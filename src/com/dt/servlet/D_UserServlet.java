package com.dt.servlet;

import java.util.List;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.alibaba.fastjson.JSON;
import com.dt.info.User;
import com.dt.service.D_UserService;
import com.dt.service.impl.D_UserServiceImpl;




@WebServlet("/duser")
public class D_UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public D_UserServlet() {
        super();
       
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    request.setCharacterEncoding("utf-8");
	    //HttpSession session = request.getSession();
	    D_UserService  dus=new D_UserServiceImpl(); 
	    Integer num=dus.getUserId();
	    if(num==0){
	    	num=0;
	    }
	    request.setAttribute("num", num);
	   
	    response.setContentType("application/josn;charset=UTF-8");
	    PrintWriter out=response.getWriter();
	    out.write(JSON.toJSONString(num));
	    out.close();
	    out.flush();
	
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
