package com.dt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.alibaba.fastjson.JSON;
import com.dt.info.Order;
import com.dt.service.D_OrderService;
import com.dt.service.impl.D_OrderServiceImpl;


@WebServlet("/dorder03")
public class D_OrderServlet03 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public D_OrderServlet03() {
        super();
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 request.setCharacterEncoding("utf-8");
		  //HttpSession session = request.getSession();
		  String  name=request.getParameter("name");
		 
		  D_OrderService  dos=new D_OrderServiceImpl();
		  List<Order> list= dos.getOrder02(name);
		  //session.setAttribute("list",list);

		  response.setContentType("application/josn;charset=UTF-8");
		  PrintWriter out=response.getWriter();
		  out.write(JSON.toJSONString(list));
		  out.close();
		  out.flush();
		}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
