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


@WebServlet("/dallproductprice")
public class D_AllProductPriceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public D_AllProductPriceServlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String  price=" ";
	    D_AllProductService dps=new D_AllProductServiceImpl();
	    price= dps.getAllProductPrice();
	    request.setAttribute("price", price);
	    response.setContentType("application/josn;charset=UTF-8");
	    PrintWriter out=response.getWriter();
	    out.write(JSON.toJSONString(price));
	    out.close();
	    out.flush();
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
