package com.dt.servlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.InputBuffer;

import com.dt.dao.impl.BizImpl;
import com.dt.info.Info;
import com.jspsmart.upload.File;
import com.jspsmart.upload.Files;
import com.jspsmart.upload.Request;
import com.jspsmart.upload.SmartUpload;

/**
 * Servlet implementation class AddsServlet
 */
@WebServlet("/Adds2")
public class AddsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddsServlet() {
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
				System.out.println("文件丢失");
			}
			String str3 =  request2.getParameter("cname");//名字 字符串
			String str4 =  request2.getParameter("cprice");//价格 double
			String str5 =  request2.getParameter("ccount");//数量 int
			String str6 =  request2.getParameter("cxxFn");//分类字符串
			
			//System.out.println(filename);
			System.out.println(filepath);//地址 字符串
			double jg = Double.valueOf(str4);
			int sl = Integer.valueOf(str5);
			System.out.println(jg);
		BizImpl bizImpl = new BizImpl();
		Info in = new Info(str3,filepath,str6,jg,sl);
		bizImpl.saveInfo(in);
		response.setContentType("application/json;charset=utf-8");
		response.sendRedirect("back_stage_management/product_list.jsp");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		doGet(request, response);
		
	}

}
