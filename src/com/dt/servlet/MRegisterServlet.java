package com.dt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.alibaba.fastjson.JSON;
import com.dt.dao.impl.MencryptionImpl;
import com.dt.dao.impl.MuserDaoImpl;
import com.dt.info.MUserInfo;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class MRegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MRegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		MencryptionImpl mpi = new MencryptionImpl();
		String username= request.getParameter("username");
		String password=null;
		try {
			password = mpi.encryptionPwd(request.getParameter("password"));
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String userKey = request.getParameter("VerificationCode");
		
		//判断验证码是否正确
		int flag=-1;

        HttpSession session = request.getSession();
        String realKey = (String) session.getAttribute("key");
        
        //不区分大小写
        if(realKey != null && !realKey.trim().equals("")){
            realKey = realKey.toLowerCase();
        }
        if (realKey != null && !realKey.trim().equals("")){
            realKey = realKey.toLowerCase();
        }

        //验证码
        if(userKey==null || userKey==""){
            flag = -1;
        }else if(realKey.equals(userKey) || realKey==userKey){
              flag=1;
        }else{
            flag=0;
        }
        //验证码不匹配，前端显示验证码错误
        if(flag!=1){
        	response.setContentType("text/html;charset=UTF-8");
    		PrintWriter out= response.getWriter();
    		out.write(JSON.toJSONString(flag));
    		out.flush();
    		out.close();
        	
        }else{//验证码正确，传入数据库并跳转页面到登录页面
        	MuserDaoImpl mdi = new MuserDaoImpl();
        	MUserInfo mui = new MUserInfo();
        	String regex=".*[a-zA-Z]+.*";//判断字符串中是否有字母的表达式
        	//判断用户名是昵称、邮箱、还是手机号
        	if(username.contains("@")){
        		mui.setUser_email(username);
        	}else if(Pattern.compile(regex).matcher(username).matches()){//判断是否是昵称
        		mui.setUser_name(username);        		
        	}else{
        		mui.setUser_phone(username);
        	}
        	mui.setUser_pwd(password);
        	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        	String time  =df.format(new Date()).toString();// new Date()为获取当前系统时间
        	mui.setUser_time(time);
        	int i =mdi.addUser(mui);//将数据插入到数据库中
        	session.setMaxInactiveInterval(3);//单位为秒
        	session.setAttribute("username", username);
        	//将用户名传到登录页面并显示，跳转页面
        	request.getRequestDispatcher("login.jsp").forward(request, response);
        }
        //如果两个验证码一致，并移除sesssion域中的属性值
        //session.removeAttribute("key");
        //String code = realKey+"-"+userKey+"-"+flag;
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
