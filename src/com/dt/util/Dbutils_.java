package com.dt.util;

import java.sql.Connection;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class Dbutils_ {

	//����Դ�� c3p0
	//ds����Դ������������ҵ�src�����c3p0-config.xml
	private static DataSource ds = new ComboPooledDataSource();
	
	//��������Դ
	public static DataSource getDataSource(){
		return ds;
	}
	//ֻ�ù������Ӽ��ɣ��رղ��ù�
	public static Connection getCon(){
		try {
			return ds.getConnection();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
}
