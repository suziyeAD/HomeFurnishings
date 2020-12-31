package com.dt.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dt.dao.BaseDao;
import com.dt.dao.impl.BaseDaoImpl;
import com.dt.info.AllProduct;


public class ZorderServlet extends HttpServlet {
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("sid");
		String num = request.getParameter("num");
		Integer payId = (Integer)request.getSession().getAttribute("payId");
	
		if (payId==null) {
			payId=2;
		}
		BaseDao bs = new BaseDaoImpl();
		bs.insertById(Integer.valueOf(id), Integer.valueOf(num), payId);
		request.getRequestDispatcher("order.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
