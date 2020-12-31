package com.dt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.dt.service.D_OrderService;
import com.dt.service.impl.D_OrderServiceImpl;

@WebServlet("/ddel")
public class D_DelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public D_DelServlet() {
        super();
      
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		D_OrderService dos=new D_OrderServiceImpl();
		String  id=request.getParameter("pid");
		int[] flag= dos.delOrder(id);
		response.setContentType("application/json;charset=utf-8");
		PrintWriter out= response.getWriter();
		out.write(JSON.toJSONString(flag));
		out.flush();
		out.close();
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
