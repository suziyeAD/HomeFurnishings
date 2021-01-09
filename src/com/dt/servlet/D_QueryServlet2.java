package com.dt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.dt.info.Order;
import com.dt.info.Page;
import com.dt.service.D_OrderService;
import com.dt.service.impl.D_OrderServiceImpl;

/**
 * Servlet implementation class D_QueryServlet2
 */
@WebServlet("/dquery02")
public class D_QueryServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public D_QueryServlet2() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String  name=request.getParameter("name");
		String  pst=request.getParameter("pst");
		String currentpage= request.getParameter("cpage");
		D_OrderService dos=new D_OrderServiceImpl();
		Page pg=new Page();
		int count=dos.getOrderCount().size();//得到数据表所有数据的行数
		pg.setSumsize(count);
		//三目运算符：计算多出1条数据也要分一页出来
		pg.setLastpage(pg.getSumsize()%pg.getPagesize()==0?pg.getSumsize()/pg.getPagesize():pg.getSumsize()/pg.getPagesize()+1);
		pg.setCurrentpage(Integer.parseInt(currentpage));
		List<Order> list =dos.getOrder(name, pst, pg);
		//把分页实体存储在request作用域
		request.setAttribute("pg", pg);
		request.setAttribute("list", list);
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
