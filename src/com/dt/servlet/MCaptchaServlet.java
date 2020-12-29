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
	    	//����BufferedImage��������ͼƬ�ĳ��ȿ�Ⱥ�ɫ�ʡ�   
	        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);   
	        
	        OutputStream os = response.getOutputStream();   
	        
	        //ȡ��Graphics������������ͼƬ   
	        Graphics g = image.getGraphics();   
	        
	        //����ͼƬ����������,�ͷ�Graphics������ռ�õ���Դ��   
	        g.setColor(getRandColor(50,100));   
	        
	        //�����������ɵ�λ��   
	        g.fillRect(0, 0, width, height);   
	        
	        //�������ݵ�����ʹ�С   
	        g.setFont(new Font("Times New Roman", Font.BOLD, 20));   
	        
	        //ͼƬ�������������100�����ߣ�����ͨ��ͼƬʶ���ƽ���֤��   
	        for (int i = 0; i < 100; i++) {   
		        //�������ݵ���ɫ����ҪΪ����ͼƬ����������   
		        g.setColor(getRandColor(100, 200));
	            int x = random.nextInt(width);   
	            int y = random.nextInt(height);   
	            int xl = random.nextInt(width);   
	            int yl = random.nextInt(height);   
	            g.drawLine(x, y, x+1, y+1);   
	        }   
	        g.setColor(getRandColor(100, 250));
	        // ������ʽ�浽ͼƬ��
	        g.drawString(createEquation(request), 2, 22);
	        
	        //�ͷŴ�ͼ�ε��������Լ���ʹ�õ�����ϵͳ��Դ�������ڹر���   
	        g.dispose();   
	        
	         //ͨ��ImageIO�����write��̬������ͼƬ�����   
	        ImageIO.write(image, "JPEG", os);   
	        os.close(); 
	        request.getSession().removeAttribute("captchaNo");
//    		request.getSession().setAttribute("captchaNo", Math.round(Math.random()*10000));
    		return;
    		
    	
    }   
	  /**  
     * ���������ɫ 
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
     * ��������ʽ 
     * @param request
     * @return
     */
    private String createEquation(HttpServletRequest request) {
         // ���������żӼ����������   
         char[] arr = {'+', '-'};   
   
         // ����10���ڵ��������num1   
         int num1 = random.nextInt(30);   
   
         // ����һ��0-2֮����������operate   
         int operate = random.nextInt(2);   
   
         // ����10���ڵ��������num1   
         int num2 = random.nextInt(30);   
   
         // ������ֳ���Ϊ0�����  
         if (num1 < num2) {
				int temp = num1;
				num1 = num2;
				num2 = temp;
			 }
   
         // ������   
         int captchaNo = 0;   
   
         // �ٶ�positionֵ0/1�ֱ����+��,��-��������ǰ���������������   
         switch (operate) {   
         case 0:   
             captchaNo = num1 + num2;   
             break;   
         case 1:   
             captchaNo = num1 - num2; 
             break;     
         }   
         // �����ɵ���֤��ֵ(����������ֵ)�ŵ�session�У��Ա��ں�̨����֤��   
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
