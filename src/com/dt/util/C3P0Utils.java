package com.dt.util;

import java.sql.Connection;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class C3P0Utils {
	//Ĭ�ϼ���xml�����ļ�
	private static DataSource ds=new ComboPooledDataSource();
	
	public static DataSource getDatasource(){
		return ds;
	}
	
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
