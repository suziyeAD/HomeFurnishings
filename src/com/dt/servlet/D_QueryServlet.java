package com.dt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.Servlet;
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

@WebServlet("/dquery")
public class D_QueryServlet extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;
  
    public D_QueryServlet() {
        super();
       
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String  name=request.getParameter("name");
		String currentpage= request.getParameter("cpage");
		D_OrderService dos=new D_OrderServiceImpl();
		Page pg=new Page();
		pg.setCurrentpage(Integer.valueOf(currentpage));
		int count=dos.getOrder(name, pg).size();//得到数据表所有数据的行数
		System.out.println("邓雨川"+count);
		pg.setSumsize(count);
		//三目运算符：计算多出1条数据也要分一页出来
		pg.setLastpage(pg.getSumsize()%pg.getPagesize()==0?pg.getSumsize()/pg.getPagesize():pg.getSumsize()/pg.getPagesize()+1);
		pg.setCurrentpage(Integer.parseInt(currentpage));
		System.out.println("最后一页"+pg.getLastpage());
		System.out.println("当前也"+pg.getCurrentpage());
		List<Order> list =dos.getOrder(name, pg);
		for (Order ff: list) {
			System.out.println(ff.toString());
			
		}
		//把分页实体存储在request作用域
		request.setAttribute("pg", pg);
		request.setAttribute("list", list);
		  response.setContentType("application/josn;charset=UTF-8");
		  Map<String,Object> map = new HashMap<>();
		  map.put("list", list);
		  PrintWriter out=response.getWriter();
		  map.put("currentpage", pg.getCurrentpage());
		  out.write(JSON.toJSONString(map));
		  out.close();
		  out.flush();
		  
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
