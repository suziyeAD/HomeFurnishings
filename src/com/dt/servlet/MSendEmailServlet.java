package com.dt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.alibaba.fastjson.JSON;
import com.dt.dao.impl.MSendEmai;

/**
 * Servlet implementation class MSendEmailServlet
 */
@WebServlet("/SendEmail")
public class MSendEmailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MSendEmailServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		String emailaddress= request.getParameter("username");
		String code= String.valueOf(Math.round((Math.random()+1) * 1000));
		//发送邮件并返回结果
		boolean flag=MSendEmai.sendEmail(emailaddress, code);
		//把邮件验证码保存到session中
		HttpSession session = request.getSession();
		session.setAttribute("emailCode", code);
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out= response.getWriter();
		out.write(JSON.toJSONString(flag));
		out.flush();
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
