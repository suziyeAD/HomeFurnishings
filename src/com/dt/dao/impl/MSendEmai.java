package com.dt.dao.impl;

import org.apache.commons.mail.HtmlEmail;
import org.junit.Test;

public class MSendEmai {

	//������֤��
		public static boolean sendEmail(String emailaddress,String code){
			try {
				HtmlEmail email = new HtmlEmail();//���ø���
				email.setHostName("smtp.qq.com");//��Ҫ�޸ģ�126����Ϊsmtp.126.com,163����Ϊ163.smtp.com��QQΪsmtp.qq.com
				email.setCharset("UTF-8");
				email.addTo(emailaddress);// �ռ���ַ
	 
				email.setFrom("1574495771@qq.com", "aa");//�˴��������ַ���û���,�û�������������д
	 
				email.setAuthentication("1574495771@qq.com", "apzpnmfdbpewbafa");//�˴���д�����ַ�Ϳͻ�����Ȩ��
	 
				email.setSubject("��ҼҾ�");//�˴���д�ʼ������ʼ�����������д
				email.setMsg("�𾴵��û�����,�������޸��������֤����:" + code);//�˴���д�ʼ�����
				email.send();
				return true;
			}
			catch(Exception e){
				e.printStackTrace();
				return false;
			}
		}	
}
