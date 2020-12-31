package com.dt.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.dt.dao.PayDao;
import com.dt.dao.impl.PayDaoImpl;
import com.dt.info.ClosedOrder;
import com.dt.info.PayedProduct;

/**
 * Servlet implementation class MoHuChaXunCloseServlet
 */
@WebServlet("/mhcxcs")
public class MoHuChaXunCloseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MoHuChaXunCloseServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String zhi = request.getParameter("mhvalue");
		System.out.println(zhi);
		PayDao pd = new PayDaoImpl();
		List<ClosedOrder> list = pd.getAllInfoClosed(zhi);
		System.out.println(list);
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
