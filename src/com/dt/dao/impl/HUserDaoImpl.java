package com.dt.dao.impl;


import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.junit.Test;

import com.dt.dao.HUserDao;
import com.dt.info.HUser;
import com.dt.util.Dbutils_;

public class HUserDaoImpl implements HUserDao{

	@Override
	public List<HUser> getHUser() {
		// TODO Auto-generated method stub
		List<HUser> list = null;
		QueryRunner qr=new QueryRunner(Dbutils_.getDataSource());
		try {
			String sql = "SELECT user_id AS userId,user_name AS userName,user_email AS userEmail, user_phone AS userPhone, user_time AS userTime FROM USER";
			list = qr.query(sql, new BeanListHandler<HUser>(HUser.class));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			
		}
		return list;
	}

	@Override
	public int[] add(HUser hUser) {
		// TODO Auto-generated method stub
		int[] flag = new int[1];
		QueryRunner qr=new QueryRunner(Dbutils_.getDataSource());
		try {
			String sql = "INSERT INTO USER VALUE(?,?,?,?,?,?,?)";
			flag[0] = qr.update(sql, hUser.getUserId(),hUser.getUserName(),hUser.getUserPwd(),hUser.getUserPower(),hUser.getUserEmail(),hUser.getUserPhone(),hUser.getUserTime());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return flag;
	}
	
	@Override
	public int update(HUser hUser) {
		// TODO Auto-generated method stub
		int flag = 0;
		QueryRunner qr=new QueryRunner(Dbutils_.getDataSource());
		try {
			String sql = "UPDATE USER SET user_name=?,user_email=?,user_phone=? WHERE user_id=?";
			flag=qr.update(sql, hUser.getUserName(),hUser.getUserEmail(),hUser.getUserPhone(),hUser.getUserId());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public int[] delete(int userId) {
		// TODO Auto-generated method stub
		int[] flag = new int[1];
		QueryRunner qr=new QueryRunner(Dbutils_.getDataSource());
		try {
			String sql = "DELETE FROM USER WHERE user_id  = ?";
			flag[0] = qr.update(sql, userId);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public HUser getHUserById(int userId) {
		// TODO Auto-generated method stub
		HUser huser = null;
		QueryRunner qr=new QueryRunner(Dbutils_.getDataSource());
		try {
			String sql = "SELECT user_id AS userId, user_name AS userName,user_email AS userEmail, user_phone AS userPhone FROM USER WHERE user_id=?";
			huser = qr.query(sql, new BeanHandler<>(HUser.class),userId);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return huser;
	}

	@Override
	public List<HUser> getHUserByName(String userName) {
		// TODO Auto-generated method stub
		List<HUser> list = null;
		QueryRunner qr=new QueryRunner(Dbutils_.getDataSource());
		try {
			String sql = "SELECT user_id AS userId,user_name AS userName,user_email AS userEmail, user_phone AS userPhone, user_time AS userTime  FROM USER WHERE user_name LIKE '%" + userName + "%'";
			list = qr.query(sql, new BeanListHandler<HUser>(HUser.class));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
	}
	@Test
	public void show(){
		List<HUser> list=getHUserByName("ËÄ");
		for (HUser ff : list) {
			System.out.println(ff.toString());
		}
		
		
		
		
		
		
		
	}
	

	

}
