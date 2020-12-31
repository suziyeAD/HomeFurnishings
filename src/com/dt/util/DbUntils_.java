package com.dt.util;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class DbUntils_ {
	private static DataSource ds = new ComboPooledDataSource();
	
	public static DataSource getDataSource(){
		
		return ds;
	}
	
	public static Connection getCon(){
		try {
			return ds.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
