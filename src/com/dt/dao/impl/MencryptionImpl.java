package com.dt.dao.impl;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.junit.Test;


public class MencryptionImpl implements Mencryption {
	
	@Override
	
	public String encryptionPwd(String password) throws NoSuchAlgorithmException {
		// TODO Auto-generated method stub
		 MessageDigest md = MessageDigest.getInstance("MD5");
	        byte b1[] = password.getBytes();
	        byte b2[] = md.digest( b1 ); //����md����� ����b1[] ���ܳ�  ����b2[]
	        String strpwd2 = "";
	        for(byte i:b2){
	            // �������ֽ�ת��Ϊ 16 ����
	            String s = Integer.toHexString(i & 0xff);
	            // ��i<16ʱ������Ϊ1�Ӹ����� ���������Ա�֤���Ϊ ����Ϊ32
	            if(s.length()==1){
	                s = s + "0";
	            }
	            strpwd2 += s;
	        }
	        password =strpwd2;

		return password;
	}

}
