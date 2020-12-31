package com.dt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.dt.dao.HUserDao;
import com.dt.dao.impl.HUserDaoImpl;
import com.dt.info.HUser;
import com.dt.service.HUserService;
import com.dt.service.impl.HUserServiceImpl;

/**
 * Servlet implementation class AddServlet
 */
@WebServlet("/hadd")

public class HAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HAddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		//System.out.println("------addservlet");
		String userId = request.getParameter("userId");
		int userIds = Integer.parseInt(userId);
		String userName = request.getParameter("userName");//userName
		String userPwd = request.getParameter("userPwd");
		String userPower = request.getParameter("userPower");
		int userPowers = Integer.parseInt(userPower);
		String userEmail = request.getParameter("userEmail");
		String userPhone = request.getParameter("userPhone");
		String userTime = request.getParameter("userTime");
		//System.out.println("----------"+Charset.defaultCharset());
		//System.out.println("------addservlet111:"+userName);
		//String sname = new String(userName.getBytes(),"UTF-8");
		//System.out.println("------addservlet222:"+sname);
		HUserDao hd = new HUserDaoImpl();
		int[] flag = hd.add(new HUser(userIds,userName,userPwd,userPowers,userEmail,userPhone,userTime));
		PrintWriter out = response.getWriter();
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
