package com.dt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.dt.service.D_AllProductService;

import com.dt.service.impl.D_AllProductServiceImpl;



@WebServlet("/dallProduct")
public class D_AllProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public D_AllProductServlet() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
	    D_AllProductService dps=new D_AllProductServiceImpl();
	    Integer all=dps.getAllProduct();
	    if(all==0){
	    	all=0;
	    }
	    request.setAttribute("all", all);
	    response.setContentType("application/josn;charset=UTF-8");
	    PrintWriter out=response.getWriter();
	    out.write(JSON.toJSONString(all));
	    out.close();
	    out.flush();
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
