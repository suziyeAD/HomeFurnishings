package com.dt.dao.impl;

import java.security.NoSuchAlgorithmException;

public interface Mencryption {
	
	//��������м��ܣ������ؼ��ܺ������
	String encryptionPwd(String password) throws NoSuchAlgorithmException;
}
