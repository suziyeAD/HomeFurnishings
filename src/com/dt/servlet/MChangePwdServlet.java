package com.dt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.security.NoSuchAlgorithmException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.dt.dao.impl.MencryptionImpl;
import com.dt.dao.impl.MuserDaoImpl;

/**
 * Servlet implementation class MChangePwdServlet
 */
@WebServlet("/changePwd")
public class MChangePwdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MChangePwdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		String username=request.getParameter("username");
		String changePwd=null;		
		String confirPwd=null;
		//对密码进行加密
		MencryptionImpl mpi = new MencryptionImpl();
		try {
			changePwd = mpi.encryptionPwd(request.getParameter("changePwd"));
			confirPwd=mpi.encryptionPwd(request.getParameter("confirPwd"));
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		//修改密码
		MuserDaoImpl mdi = new MuserDaoImpl();
		int num=mdi.updatePwd(username, changePwd, confirPwd);
		boolean flag=false;
		if(num==1){
			flag=true;
		}
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out= response.getWriter();
		out.write(JSON.toJSONString(flag));
		out.flush();
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
