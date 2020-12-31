package com.dt.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dt.dao.impl.BizImpl;
import com.dt.info.Info;

/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/Update")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("allProduct_id");
		 int id1=Integer.valueOf(id);
		BizImpl bizImpl = new BizImpl();
		List<Info> list = bizImpl.getInfoById(id1);
		request.getSession().setAttribute("wlist", list);
		Info info = new Info();
		info.setAllProduct_id(id1);
		int a = info.getAllProduct_id();
	    request.getSession().setAttribute("a", a);
       // System.out.println(id1);
		//System.out.println(list.toString());
		response.sendRedirect("back_stage_management/edit_product2.jsp");
//		request.getRequestDispatcher("back_stage_management/edit_product.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
