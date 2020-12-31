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


public class AddCartServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json;charset=UTF-8");
		Integer id = Integer.valueOf(request.getParameter("sid"));
		Integer num = Integer.valueOf(request.getParameter("snum"));
		Integer payid = (Integer)request.getSession().getAttribute("payId");
		if (payid == null) {
			payid=1;
		}
		BaseDao bs = new BaseDaoImpl();
		int flag = bs.addtoShoppingCrt(id, num, payid);
		PrintWriter out = response.getWriter();
		out.write(JSON.toJSONString(flag));
		out.flush();
		out.close();
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
