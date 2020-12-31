package com.dt.dao.impl;

import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.junit.Test;

import com.dt.dao.D_UserDao;
import com.dt.info.User;
import com.dt.util.C3P0Utils;
import com.dt.util.Dbutils_;
import com.mchange.v2.c3p0.cfg.C3P0Config;
import com.mchange.v2.c3p0.cfg.C3P0ConfigUtils;

public class D_UserDaoImpl  implements D_UserDao{
    //统计权限
	@Override
	public Integer getUserId(){
		Integer i=null;
		QueryRunner qr = new QueryRunner(C3P0Utils.getDatasource());
		try {
			String sql="SELECT  COUNT(*) FROM user WHERE user_power ='1'";

			String str = qr.query(sql, new ScalarHandler(1)).toString();
			i=Integer.valueOf(str);
		} catch (Exception e) {   
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public Integer getUser(){
		Integer i=null;
		QueryRunner qr = new QueryRunner(C3P0Utils.getDatasource());
		try {
			String sql="SELECT  COUNT(*) FROM user WHERE user_power ='2'";
			String str = qr.query(sql, new ScalarHandler(1)).toString();
			i=Integer.valueOf(str);
		} catch (Exception e) {   
			e.printStackTrace();
		}
		return i;
	}
	 
}



