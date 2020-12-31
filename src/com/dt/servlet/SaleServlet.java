package com.dt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.dt.dao.BaseDao;
import com.dt.dao.impl.BaseDaoImpl;
import com.dt.info.AllProduct;

/**
 * Servlet implementation class SaleServlet
 */
public class SaleServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json;charset=UTF-8");
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("sid");
		BaseDao bs = new BaseDaoImpl();
		AllProduct allpro = bs.getSale(Integer.valueOf(id));
		request.setAttribute("allpro", allpro);
		request.getRequestDispatcher("proDetail.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
