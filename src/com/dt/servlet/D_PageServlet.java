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

@WebServlet("/dpage")
public class D_PageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public D_PageServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String currentpage= request.getParameter("cpage");
		System.out.println(currentpage);
		D_OrderService dos=new D_OrderServiceImpl();
		Page pg=new Page();
		int count=dos.getOrderCount().size();//�õ����ݱ��������ݵ�����
		pg.setSumsize(count);
		//��Ŀ�������������1������ҲҪ��һҳ����
		pg.setLastpage(pg.getSumsize()%pg.getPagesize()==0?pg.getSumsize()/pg.getPagesize():pg.getSumsize()/pg.getPagesize()+1);
		pg.setCurrentpage(Integer.parseInt(currentpage));
		 List<Order> list = dos.getOrderByPage(pg);
		//�ѷ�ҳʵ��洢��request������
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
