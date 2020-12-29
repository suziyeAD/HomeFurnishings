package com.dt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.dt.dao.impl.MuserDaoImpl;
import com.dt.info.MUserInfo;

/**
 * Servlet implementation class MCheckUsername
 */
@WebServlet("/checkuser")
public class MCheckUsernameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MCheckUsernameServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		String username=request.getParameter("username");
		MuserDaoImpl mdi = new MuserDaoImpl();
		List<MUserInfo> list = mdi.checkUser(username);
		String flag = "";
		if(list.size()>=1){
			flag="用户名已存在";
			response.setContentType("text/html;charset=UTF-8");
    		PrintWriter out= response.getWriter();
    		out.write(flag);
    		out.flush();
    		out.close();
		}else{
			flag="用户名成立";
			response.setContentType("text/html;charset=UTF-8");
    		PrintWriter out= response.getWriter();
    		out.write(flag);
    		out.flush();
    		out.close();
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
