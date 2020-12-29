package com.dt.servlet;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



/**
 * Servlet implementation class CaptchaServlet
 */

@WebServlet("/CaptchaServlet")
public class MCaptchaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static final Random random = new Random();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MCaptchaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
    	
    	
    		int width = 100, height = 30;
	    	//创建BufferedImage对象，设置图片的长度宽度和色彩。   
	        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);   
	        
	        OutputStream os = response.getOutputStream();   
	        
	        //取得Graphics对象，用来绘制图片   
	        Graphics g = image.getGraphics();   
	        
	        //绘制图片背景和文字,释放Graphics对象所占用的资源。   
	        g.setColor(getRandColor(50,100));   
	        
	        //设置内容生成的位置   
	        g.fillRect(0, 0, width, height);   
	        
	        //设置内容的字体和大小   
	        g.setFont(new Font("Times New Roman", Font.BOLD, 20));   
	        
	        //图片背景上随机生成100干扰线，避免通过图片识别破解验证码   
	        for (int i = 0; i < 100; i++) {   
		        //设置内容的颜色：主要为生成图片背景的线条   
		        g.setColor(getRandColor(100, 200));
	            int x = random.nextInt(width);   
	            int y = random.nextInt(height);   
	            int xl = random.nextInt(width);   
	            int yl = random.nextInt(height);   
	            g.drawLine(x, y, x+1, y+1);   
	        }   
	        g.setColor(getRandColor(100, 250));
	        // 将运算式绘到图片中
	        g.drawString(createEquation(request), 2, 22);
	        
	        //释放此图形的上下文以及它使用的所有系统资源，类似于关闭流   
	        g.dispose();   
	        
	         //通过ImageIO对象的write静态方法将图片输出。   
	        ImageIO.write(image, "JPEG", os);   
	        os.close(); 
	        request.getSession().removeAttribute("captchaNo");
//    		request.getSession().setAttribute("captchaNo", Math.round(Math.random()*10000));
    		return;
    		
    	
    }   
	  /**  
     * 生成随机颜色 
     * @param fc  
     * @param bc  
     * @return  
     */  
    private Color getRandColor(int fc, int bc) {   
        if (fc > 255)   
            fc = 255;   
        if (bc > 255)   
            bc = 255;   
        int r = fc + random.nextInt(bc - fc);   
        int g = fc + random.nextInt(bc - fc);   
        int b = fc + random.nextInt(bc - fc);   
        return new Color(r, g, b);   
    }   
     
    /**
     * 生成运算式 
     * @param request
     * @return
     */
    private String createEquation(HttpServletRequest request) {
         // 定义数组存放加减二个运算符   
         char[] arr = {'+', '-'};   
   
         // 生成10以内的随机整数num1   
         int num1 = random.nextInt(30);   
   
         // 生成一个0-2之间的随机整数operate   
         int operate = random.nextInt(2);   
   
         // 生成10以内的随机整数num1   
         int num2 = random.nextInt(30);   
   
         // 避免出现除数为0的情况  
         if (num1 < num2) {
				int temp = num1;
				num1 = num2;
				num2 = temp;
			 }
   
         // 运算结果   
         int captchaNo = 0;   
   
         // 假定position值0/1分别代表”+”,”-”，计算前面操作数的运算结果   
         switch (operate) {   
         case 0:   
             captchaNo = num1 + num2;   
             break;   
         case 1:   
             captchaNo = num1 - num2; 
             break;     
         }   
         // 将生成的验证码值(即运算结果的值)放到session中，以便于后台做验证。   
         HttpSession session = request.getSession();     
         session.setAttribute("caNumber", captchaNo); 
         return num1+" "+ arr[operate]+" "+num2+" = ?";
    }
   
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
