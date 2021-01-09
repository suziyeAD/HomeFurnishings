package com.dt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.alibaba.fastjson.JSON;
import com.dt.info.Order;
import com.dt.info.Page;
import com.dt.service.D_OrderService;
import com.dt.service.impl.D_OrderServiceImpl;
//ҳ�����
@WebServlet("/dpage")
public class D_PageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public D_PageServlet() {
        super();
        
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String currentpage= request.getParameter("cpage");
		String pst= request.getParameter("pst");
		D_OrderService dos=new D_OrderServiceImpl();
		
		Page pg=new Page();
		int count=dos.getOrderCount().size();//�õ����ݱ��������ݵ�����
		pg.setSumsize(count);
		//��Ŀ�������������1������ҲҪ��һҳ����
		pg.setLastpage(pg.getSumsize()%pg.getPagesize()==0?pg.getSumsize()/pg.getPagesize():pg.getSumsize()/pg.getPagesize()+1);
		pg.setCurrentpage(Integer.parseInt(currentpage));
		List<Order> list = new ArrayList<>();
		if((name == "" || name == null)&&(pst == "" || pst == null)){
			//ȫ����
			list = dos.getOrderByPage(pg);
		}else if((name != "" || name != null)&&(pst == "" || pst == null)){
			//��������
			list= dos.getOrder(name, pg);
		}
		else{
			list= dos.getOrder(name, pst, pg);
		}		 
		//�ѷ�ҳʵ��洢��request������
		 int page=pg.getLastpage();
		  request.setAttribute("pg", pg);
		  request.setAttribute("list", list);
		  response.setContentType("application/josn;charset=UTF-8");
		  PrintWriter out=response.getWriter();
		  Map<String,Object> map = new HashMap<>();
		  map.put("list", list);
		  map.put("currentpage", pg.getCurrentpage());
		  out.write(JSON.toJSONString(map));
		  out.close();
		  out.flush();

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
