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
import com.dt.info.ClosedOrder;

/**
 * Servlet implementation class CloseServlet
 */
@WebServlet("/close")
public class CloseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CloseServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PayDao pd = new PayDaoImpl();
//		int pid = pd.getAllUser().getUser_id();
		HttpSession session = request.getSession();
		int pid=(int) session.getAttribute("payId");
		List<ClosedOrder> list = pd.getAllClosedOrder(pid);
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
