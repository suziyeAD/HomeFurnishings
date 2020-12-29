package com.dt.dao.impl;

import java.security.NoSuchAlgorithmException;

public interface Mencryption {
	
	//对密码进行加密，并返回加密后的密码
	String encryptionPwd(String password) throws NoSuchAlgorithmException;
}
