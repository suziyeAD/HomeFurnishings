package com.dt.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.Session;

import com.dt.dao.impl.BizImpl;
import com.dt.info.Info;
import com.jspsmart.upload.File;
import com.jspsmart.upload.Files;
import com.jspsmart.upload.Request;
import com.jspsmart.upload.SmartUpload;

/**
 * Servlet implementation class Adds3Servlet
 */
@WebServlet("/Adds3")
public class Adds3Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Adds3Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("1111111111111111111111111");
		request.setCharacterEncoding("utf-8");	
		System.out.println("======111111===");
		SmartUpload su = new SmartUpload();
		su.initialize(super.getServletConfig(), request, response);
		File file;
		try {
			su.setAllowedFilesList("jpg,png");
			su.setDeniedFilesList("jsp,exe");
			su.setCharset("utf-8");
			su.setMaxFileSize(5*1024*1024);
			System.out.println("=========");
			su.upload();
			Files files = su.getFiles();
			Request request2 = su.getRequest();
			file = files.getFile(0);
			String filename = "";
			String filepath = "";
			if (!file.isMissing()) {
				filename = file.getFileName();
				filepath = "img/"+filename;
				file.saveAs(filepath, su.SAVE_VIRTUAL);
			}else{
				System.out.println("�ļ���ʧ");
			}
			String str3 =  request2.getParameter("cname");//���� �ַ���
			String str4 =  request2.getParameter("cprice");//�۸� double
			String str5 =  request2.getParameter("ccount");//���� int
		
			String str6 =  request2.getParameter("cxxFn");//�����ַ���
			System.out.println(str3);
			System.out.println(str4);
			System.out.println(str5);
			int a =  (Integer)request.getSession().getAttribute("a");
		//	System.out.println(request.getSession().getAttribute("a"));
			//System.out.println(filename);
			System.out.println(filepath);//��ַ �ַ���
			double jg = Double.valueOf(str4);
			int sl = Integer.valueOf(str5);
			System.out.println(jg);
		BizImpl bizImpl = new BizImpl();
		Info in = new Info(a,str3,filepath,str6,jg,sl);
		int flag = bizImpl.update(in);
		System.out.println(flag);
		response.setContentType("application/json;charset=utf-8");
		response.sendRedirect("back_stage_management/product_list.jsp");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		doGet(request, response);
		
	}
	

}
