package com.dt.dao.impl;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.junit.Test;

import com.dt.dao.D_ShoppingCartDao;
import com.dt.util.C3P0Utils;

public class D_ShoppingCartDaoImpl implements D_ShoppingCartDao{

	@Override
	public Integer getShopping(){
		Integer i=null;
		QueryRunner qr = new QueryRunner(C3P0Utils.getDatasource());
		try {
			String sql="SELECT  COUNT(*) FROM ShoppingCart WHERE ShoppingCart_orderStatus='未支付'";
			String str = qr.query(sql, new ScalarHandler(1)).toString();
			i=Integer.valueOf(str);
		} catch (Exception e) {   
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public Integer getShopping2() {
		Integer i=null;
		QueryRunner qr = new QueryRunner(C3P0Utils.getDatasource());
		try {
			String sql="SELECT  COUNT(*) FROM ShoppingCart WHERE ShoppingCart_id=ShoppingCart_id";
			String str = qr.query(sql, new ScalarHandler(1)).toString();
			i=Integer.valueOf(str);
		} catch (Exception e) {   
			e.printStackTrace();
		}
		return i;
	}
	
	@Override
	public Integer getShopping3() {
		Integer i=null;
		QueryRunner qr = new QueryRunner(C3P0Utils.getDatasource());
		try {
			String sql="SELECT COUNT(*) FROM `payedproduct` WHERE payedProduct_orderStatus='已支付'";
			String str = qr.query(sql, new ScalarHandler()).toString();
			i=Integer.valueOf(str);
			System.out.println("已支付数量："+i);
		} catch (Exception e) {   
			e.printStackTrace();
		}
		return i;
	}

}
