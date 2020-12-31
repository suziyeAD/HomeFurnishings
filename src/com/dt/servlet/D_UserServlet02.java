package com.dt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.dt.service.D_UserService;
import com.dt.service.impl.D_UserServiceImpl;

/**
 * Servlet implementation class D_UserServlet02
 */
@WebServlet("/user02")
public class D_UserServlet02 extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public D_UserServlet02() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  request.setCharacterEncoding("utf-8");
		    //HttpSession session = request.getSession();
		    D_UserService  dus=new D_UserServiceImpl(); 
		    Integer num2=dus.getUser();
		    if(num2==0){
		    	num2=0;
		    }
		    request.setAttribute("num2", num2);
		    response.setContentType("application/josn;charset=UTF-8");
		    PrintWriter out=response.getWriter();
		    out.write(JSON.toJSONString(num2));
		    out.close();
		    out.flush();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
