package com.dt.servlet;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dt.dao.impl.MencryptionImpl;
import com.dt.dao.impl.MuserDaoImpl;
import com.dt.info.MUserInfo;

/**
 * Servlet implementation class MLoginServlet
 */
@WebServlet("/Login")
public class MLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		String username= request.getParameter("username");
		//将密码 加密后与数据库加密后的密码进行对比
		MencryptionImpl mpi = new MencryptionImpl();
		String password=null;
		try {
			password = mpi.encryptionPwd(request.getParameter("password"));
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		MuserDaoImpl mdi = new MuserDaoImpl();
		List<MUserInfo> list=mdi.selectUser(username, password);
		if(list.isEmpty()){
			response.setContentType("text/html;charset=UTF-8");
			request.setAttribute("selectResult", "用户名或密码错误");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}else if(list.size()>=1){
			System.out.println(list.get(0).getUser_power());
			//根据权限判断是进入后台还是进入主页
			if(list.get(0).getUser_power()==2){
				 HttpSession session = request.getSession();
				 session.setMaxInactiveInterval(60);
				 session.setAttribute("username", list.get(0));
				 session.setAttribute("username", username);
				 request.getRequestDispatcher("index.jsp").forward(request, response);
			}else if(list.get(0).getUser_power()==1){
				System.out.println("已进入");
				HttpSession session = request.getSession();
				 session.setMaxInactiveInterval(60);
				 session.setAttribute("username", username);
				 request.getRequestDispatcher("back_stage_management/index.jsp").forward(request, response);
			}
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
