package com.dt.dao.impl;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.junit.Test;

import com.dt.dao.D_AllProductDao;
import com.dt.util.C3P0Utils;

public class D_AllProductDaoImpl implements D_AllProductDao {

	@Override
	public Integer getAllProduct() {
		Integer i=null;
		QueryRunner qr = new QueryRunner(C3P0Utils.getDatasource());
		try {
			String sql="SELECT COUNT(*) FROM AllProduct WHERE allProduct_id = allProduct_id";
			String str = qr.query(sql, new ScalarHandler(1)).toString();
			i=Integer.valueOf(str);
		} catch (Exception e) {   
			e.printStackTrace();
		}
		return i;
	}
    //商品总价
	@Override
	public String getAllProductPrice() {
		
		QueryRunner qr = new QueryRunner(C3P0Utils.getDatasource());
		try {
			String sql="SELECT  SUM(allProduct_price*allProduct_count) FROM  AllProduct ";
			//String str1= (String) qr.query(sql, new ScalarHandler(1));
			Object obj = qr.query(sql, new ScalarHandler()); 
			if(obj==null){
				return 0+"";
			}else{
				String number =obj.toString();
				return number;
			}
		} catch (Exception e) {   
			e.printStackTrace();
		}
		return null;
	}
	@Test
	public void show(){
		D_AllProductDao as=new D_AllProductDaoImpl();
		  String a=as.getAllProductPrice();
		  System.out.println(a);
		
	}

}	

