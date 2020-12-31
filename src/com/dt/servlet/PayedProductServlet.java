package com.dt.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.alibaba.fastjson.JSON;
import com.dt.dao.PayDao;
import com.dt.dao.impl.PayDaoImpl;
import com.dt.info.Page;
import com.dt.info.PayedProduct;


@WebServlet("/pay")
public class PayedProductServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PayDao pd = new PayDaoImpl();
		Page pg = new Page();
		
		
		//涓夌洰杩愮畻绗�
		//pg.setLastpage(pg.getSumsize()%pg.getPagesize()==0?pg.getSumsize()/pg.getPagesize():pg.getSumsize()/pg.getPagesize()+1);
		pg.setCurrentpage(1);
		//鍒嗛〉瀹炰綋瀛樺偍鍦╮equest浣滅敤鍩�
		request.setAttribute("pg", pg);
		HttpSession session = request.getSession();
		int pid = (int)session.getAttribute("payId");
		List<PayedProduct> list=pd.getAllProduct(pg,pid);
		request.setAttribute("pg", pg);
		request.setAttribute("list", list);
		response.setContentType("application/json;charset=utf-8");
		response.getWriter().write(JSON.toJSONString(list));
		//request.getRequestDispatcher("myorderq.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
