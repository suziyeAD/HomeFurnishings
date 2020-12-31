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
import com.dt.dao.impl.PayDaoImpl;
import com.dt.info.Page;
import com.dt.info.PayedProduct;

/**
 * Servlet implementation class PageServlet
 */
@WebServlet("/page")
public class PageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String cpage=request.getParameter("cpage");
		PayDaoImpl pdi = new PayDaoImpl();
		int pid = pdi.getAllUser().getUser_id();
		Page pg = new Page();
		int count=pdi.getProductCount().size();//得到Product所有数量
		int count2=pdi.getAllClosedOrder(pid).size();//得到Closed所有数量
		int count3=count+count2;
		pg.setSumsize(count3);
		pg.setCurrentpage(Integer.parseInt(cpage));
		//涓夌洰杩愮畻绗�
		HttpSession session = request.getSession();
		int bid = (int)session.getAttribute("payId");
		pg.setLastpage(pg.getSumsize()%pg.getPagesize()==0?pg.getSumsize()/pg.getPagesize():pg.getSumsize()/pg.getPagesize()+1);
		List<PayedProduct> list = pdi.getAllProduct(pg,bid);
		//鍒嗛〉瀹炰綋瀛樺偍鍦╮equest浣滅敤鍩�
		request.setAttribute("pg", pg);
		request.setAttribute("list", list);
		response.setContentType("application/json;charset=utf-8");
		response.getWriter().write(JSON.toJSONString(list));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
