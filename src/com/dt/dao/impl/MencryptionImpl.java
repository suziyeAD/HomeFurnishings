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
	        byte b2[] = md.digest( b1 ); //利用md对象把 明文b1[] 加密成  密文b2[]
	        String strpwd2 = "";
	        for(byte i:b2){
	            // 将单个字节转化为 16 进制
	            String s = Integer.toHexString(i & 0xff);
	            // 当i<16时，长度为1加个符号 ，这样可以保证最后为 密文为32
	            if(s.length()==1){
	                s = s + "0";
	            }
	            strpwd2 += s;
	        }
	        password =strpwd2;

		return password;
	}

}
