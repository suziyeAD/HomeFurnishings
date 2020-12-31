package com.dt.dao.impl;

import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.dt.dao.BizDao;
import com.dt.info.Delete;
import com.dt.info.Info;
import com.dt.util.Dbutils_;

public class BizImpl implements BizDao{
	
	private static final ResultSetHandler AllProduct_id = null;
	QueryRunner qr = new QueryRunner(Dbutils_.getDataSource());

	@Override
	public int saveInfo(Info info) {
		String sql = "INSERT INTO allproduct VALUE(NULL,?,?,?,?,?)";
		int i =0;
		try {
			i=qr.update(sql,info.getAllProduct_name(),info.getAllProduct_location(),info.getAllProduct_picturename(),info.getAllProduct_price(),info.getAllProduct_count());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public List<Info> getInfoAllList() {
		String sql = "SELECT * FROM allproduct";
		List<Info> list = null;
		try {
			list=qr.query(sql, new BeanListHandler<Info>(Info.class));
		} catch (Exception e) {
	       e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Info> getUserListByUsername(String name) {
		String sql = " SELECT * FROM allproduct WHERE AllProduct_name LIKE concat('%',?,'%') ";
		List<Info> list = null;
		try {
			list=qr.query(sql, new BeanListHandler<Info>(Info.class),name);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public int update(Info info) {
		String sql = " UPDATE allproduct SET AllProduct_name=?"
				+ ",AllProduct_location=?"
				+ ",AllProduct_picturename=?"
				+ ",AllProduct_price=?"
				+ ",AllProduct_count=?"
				+ " WHERE AllProduct_id=?";
		int i = 0;
		try {
			i=qr.update(sql, info.getAllProduct_name(),info.getAllProduct_location(),info.getAllProduct_picturename(),info.getAllProduct_price(),info.getAllProduct_count(),info.getAllProduct_id());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public int del(int AllProduct_id) {
		String sql1 = "select * from allproduct where AllProduct_id=?";
		String sql3="INSERT INTO deleteproduct VALUE(NULL,?,?,?,?,?,now())";
		int i1 = 0;
		List<Info> list = null;
		try {
			list=qr.query(sql1, new BeanListHandler<Info>(Info.class),AllProduct_id);
			i1=qr.update(sql3,list.get(0).getAllProduct_name(),list.get(0).getAllProduct_location(),list.get(0).getAllProduct_picturename(),list.get(0).getAllProduct_price(),list.get(0).getAllProduct_count());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	
		String sql = " DELETE FROM allproduct WHERE AllProduct_id=?";
		int i = 0;
		try {
			i=qr.update(sql, AllProduct_id);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public List<Info> getInfoById(int AllProduct_id) {
		// TODO Auto-generated method stub
		String sql = "SELECT AllProduct_name,AllProduct_picturename,AllProduct_price,AllProduct_count FROM allproduct WHERE AllProduct_id=?";
		List<Info> list = null;
		try {
			list=qr.query(sql, new BeanListHandler<Info>(Info.class),AllProduct_id);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Delete> getDeleteAllLi() {
		String sql = "SELECT * FROM deleteproduct";
		List<Delete> list = null;
		try {
			list=qr.query(sql, new BeanListHandler<Delete>(Delete.class));
		} catch (Exception e) {
	       e.printStackTrace();
		}
		return list;
	}

	@Override
	public int getTable(int deleteProduct_id) {
		String sql1 = "select * from deleteproduct where deleteProduct_id=?";
		String sql3="INSERT INTO allproduct VALUE(NULL,?,?,?,?,?)";
		List<Delete> list = null;
		int i1 = 0;
		try {
			list=qr.query(sql1, new BeanListHandler<Delete>(Delete.class),deleteProduct_id);
			i1=qr.update(sql3,list.get(0).getDeleteProduct_name(),list.get(0).getDeleteProduct_location(),list.get(0).getDeleteProduct_picturename(),list.get(0).getDeleteProduct_price(),list.get(0).getDeleteProduct_count());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql2 = " DELETE FROM deleteproduct WHERE deleteProduct_id=?";
		int i = 0;
		try {
			i =  qr.update(sql2,deleteProduct_id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public int dels(int deleteProduct_id) {
		String sql2 = "DELETE FROM deleteproduct WHERE deleteProduct_id=?";
		int i = 0;
		try {
			i =  qr.update(sql2,deleteProduct_id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return i;
	}	

}
