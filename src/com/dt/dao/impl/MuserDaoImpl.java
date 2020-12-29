package com.dt.dao.impl;

import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.junit.Test;

import com.dt.dao.MUserDao;
import com.dt.info.MUserInfo;
import com.dt.util.Dbutils_;

public class MuserDaoImpl implements MUserDao {
	
	//将注册用户添加到user表中
	@Override
	public int addUser(MUserInfo ui) {
		// TODO Auto-generated method stub
		QueryRunner qr=new QueryRunner(Dbutils_.getDataSource());//得到数据源
		int flag=0;
		try {
			String sql ="INSERT INTO USER(user_name,user_pwd,user_email,user_phone,user_time) VALUES(?,?,?,?,?)";
			flag=qr.update(sql,ui.getUser_name(),ui.getUser_pwd(),ui.getUser_email(),ui.getUser_phone(),ui.getUser_time());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return flag;
	}
	@Test
	@Override
	//检查是否可以登录
	public List<MUserInfo> selectUser(String username,String password) {
		// TODO Auto-generated method stub
		List<MUserInfo> list=null;
		QueryRunner qr=new QueryRunner(Dbutils_.getDataSource());//得到数据源
		try {
			String sql="SELECT * FROM USER WHERE user_name=? OR user_email=? OR user_phone =? AND user_pwd = ?";
			//在java所有的类型(type),统一用xxxx.class解析
			list=qr.query(sql,new BeanListHandler<MUserInfo>(MUserInfo.class),username,username,username,password);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
	}
	//检查是否已拥有此用户名
	@Override
	public List<MUserInfo> checkUser(String username) {
		// TODO Auto-generated method stub
		
		List<MUserInfo> list=null;
		QueryRunner qr=new QueryRunner(Dbutils_.getDataSource());//得到数据源
		try {
			String sql="SELECT * FROM USER WHERE user_name=? OR user_email=? OR user_phone =?";
			//在java所有的类型(type),统一用xxxx.class解析
			list=qr.query(sql,new BeanListHandler<MUserInfo>(MUserInfo.class),username,username,username);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
	}
	@Override
	public int updatePwd(String username, String password, String newPwd) {
		// TODO Auto-generated method stub
		
		QueryRunner qr=new QueryRunner(Dbutils_.getDataSource());//得到数据源
		int flag=0;
		try {
			String sql ="UPDATE USER SET user_pwd = ? WHERE user_email = ? AND user_pwd = ?";
			flag=qr.update(sql,newPwd,username,password);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return flag;
	}
	
	
}
