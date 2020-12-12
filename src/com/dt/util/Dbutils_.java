package com.dt.util;

import java.sql.Connection;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class Dbutils_ {

	//数据源： c3p0
	//ds数据源对象帮助我们找到src下面的c3p0-config.xml
	private static DataSource ds = new ComboPooledDataSource();
	
	//返回数据源
	public static DataSource getDataSource(){
		return ds;
	}
	//只用管理连接即可，关闭不用管
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
