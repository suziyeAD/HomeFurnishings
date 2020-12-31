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


public class DecorationServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json;charset=UTF-8");
		BaseDao bs = new BaseDaoImpl();
		List<AllProduct> listDecoration = bs.getDecoration();
		PrintWriter out = response.getWriter();
		out.write(JSON.toJSONString(listDecoration));
		out.flush();
		out.close();
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
