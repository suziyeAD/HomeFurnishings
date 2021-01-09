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
		int count=dos.getOrder(name, pg).size();//�õ����ݱ��������ݵ�����
		System.out.println("���괨"+count);
		pg.setSumsize(count);
		//��Ŀ�������������1������ҲҪ��һҳ����
		pg.setLastpage(pg.getSumsize()%pg.getPagesize()==0?pg.getSumsize()/pg.getPagesize():pg.getSumsize()/pg.getPagesize()+1);
		pg.setCurrentpage(Integer.parseInt(currentpage));
		System.out.println("���һҳ"+pg.getLastpage());
		System.out.println("��ǰҲ"+pg.getCurrentpage());
		List<Order> list =dos.getOrder(name, pg);
		for (Order ff: list) {
			System.out.println(ff.toString());
			
		}
		//�ѷ�ҳʵ��洢��request������
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
