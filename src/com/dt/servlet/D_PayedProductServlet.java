package com.dt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.dt.service.D_ShoppingCartService;
import com.dt.service.impl.D_ShoppingCartServiceImpl;

/**
 * Servlet implementation class PayedProductServlet
 */
@WebServlet("/sayedproduct")
public class D_PayedProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public D_PayedProductServlet() {
        super();
      
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
	    //HttpSession session = request.getSession();
	    D_ShoppingCartService ds=new D_ShoppingCartServiceImpl();
	    Integer shopp=ds.getShopping3();
	    System.out.println("weu"+shopp);
	    if(shopp==0){
	    	shopp=0;
	    }
	    request.setAttribute("shopp", shopp);
	    System.out.println(shopp);	   
	    response.setContentType("application/josn;charset=UTF-8");
	    PrintWriter out=response.getWriter();
	    out.write(JSON.toJSONString(shopp));
	    out.close();
	    out.flush();
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
