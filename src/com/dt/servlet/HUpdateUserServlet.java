package com.dt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dt.dao.HUserDao;
import com.dt.dao.impl.HUserDaoImpl;
import com.dt.info.HUser;
import com.dt.service.HUserService;
import com.dt.service.impl.HUserServiceImpl;

/**
 * Servlet implementation class UpdateUserServlet
 */
@WebServlet("/upd")
public class HUpdateUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HUpdateUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("sid");
		int ids = Integer.parseInt(id);
		System.out.println(ids);
		HUserDao hd  = new HUserServiceImpl();
		HUser huesr = hd.getHUserById(ids);
		request.setAttribute("huesr", huesr);
		System.out.println(huesr);
		request.getRequestDispatcher("back_stage_management/edit_user.jsp").forward(request, response);
/*		String userId = request.getParameter("userId");
		int userIds = Integer.parseInt(userId);
		String userName = request.getParameter("userName");
		String userEmail = request.getParameter("userEmail");
		String userPhone = request.getParameter("userPhone");
		String userPwd = request.getParameter("userPwd");
		String userPwds = request.getParameter("userPwds");
		HttpSession session= request.getSession();
		session.setAttribute("ui", userId);
		session.setAttribute("un", userName);
		session.setAttribute("ue", userEmail);
		session.setAttribute("uph", userPhone);
		session.setAttribute("upw", userPwd);
		session.setAttribute("upws", userPwds);
		
		HUser hUser = new HUser(userIds,userName,userEmail,userPhone,userPwd);
		HUserService hs = new HUserServiceImpl();
		int flag = hs.update(hUser);
		if(flag>0){
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter out= response.getWriter();
			out.write("<script>");
			out.write("location.href='/Demo_jspNews/login?uname=admin&upwd=admin';");
			out.write("</script>");
			out.flush();
			out.close();
			request.getRequestDispatcher("user_list.jsp").forward(request, response);
		}else{
			response.sendRedirect("user_list.jsp");
		}*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
