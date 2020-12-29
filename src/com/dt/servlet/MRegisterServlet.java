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
		
		//�ж���֤���Ƿ���ȷ
		int flag=-1;

        HttpSession session = request.getSession();
        String realKey = (String) session.getAttribute("key");
        
        //�����ִ�Сд
        if(realKey != null && !realKey.trim().equals("")){
            realKey = realKey.toLowerCase();
        }
        if (realKey != null && !realKey.trim().equals("")){
            realKey = realKey.toLowerCase();
        }

        //��֤��
        if(userKey==null || userKey==""){
            flag = -1;
        }else if(realKey.equals(userKey) || realKey==userKey){
              flag=1;
        }else{
            flag=0;
        }
        //��֤�벻ƥ�䣬ǰ����ʾ��֤�����
        if(flag!=1){
        	response.setContentType("text/html;charset=UTF-8");
    		PrintWriter out= response.getWriter();
    		out.write(JSON.toJSONString(flag));
    		out.flush();
    		out.close();
        	
        }else{//��֤����ȷ���������ݿⲢ��תҳ�浽��¼ҳ��
        	MuserDaoImpl mdi = new MuserDaoImpl();
        	MUserInfo mui = new MUserInfo();
        	String regex=".*[a-zA-Z]+.*";//�ж��ַ������Ƿ�����ĸ�ı��ʽ
        	//�ж��û������ǳơ����䡢�����ֻ���
        	if(username.contains("@")){
        		mui.setUser_email(username);
        	}else if(Pattern.compile(regex).matcher(username).matches()){//�ж��Ƿ����ǳ�
        		mui.setUser_name(username);        		
        	}else{
        		mui.setUser_phone(username);
        	}
        	mui.setUser_pwd(password);
        	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//�������ڸ�ʽ
        	String time  =df.format(new Date()).toString();// new Date()Ϊ��ȡ��ǰϵͳʱ��
        	mui.setUser_time(time);
        	int i =mdi.addUser(mui);//�����ݲ��뵽���ݿ���
        	session.setMaxInactiveInterval(3);//��λΪ��
        	session.setAttribute("username", username);
        	//���û���������¼ҳ�沢��ʾ����תҳ��
        	request.getRequestDispatcher("login.jsp").forward(request, response);
        }
        //���������֤��һ�£����Ƴ�sesssion���е�����ֵ
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
