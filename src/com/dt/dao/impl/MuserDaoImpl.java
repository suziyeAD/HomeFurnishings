package com.dt.dao.impl;

import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.junit.Test;

import com.dt.dao.MUserDao;
import com.dt.info.MUserInfo;
import com.dt.util.Dbutils_;

public class MuserDaoImpl implements MUserDao {
	
	//��ע���û���ӵ�user����
	@Override
	public int addUser(MUserInfo ui) {
		// TODO Auto-generated method stub
		QueryRunner qr=new QueryRunner(Dbutils_.getDataSource());//�õ�����Դ
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
	//����Ƿ���Ե�¼
	public List<MUserInfo> selectUser(String username,String password) {
		// TODO Auto-generated method stub
		List<MUserInfo> list=null;
		QueryRunner qr=new QueryRunner(Dbutils_.getDataSource());//�õ�����Դ
		try {
			String sql="SELECT * FROM USER WHERE user_name=? OR user_email=? OR user_phone =? AND user_pwd = ?";
			//��java���е�����(type),ͳһ��xxxx.class����
			list=qr.query(sql,new BeanListHandler<MUserInfo>(MUserInfo.class),username,username,username,password);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
	}
	//����Ƿ���ӵ�д��û���
	@Override
	public List<MUserInfo> checkUser(String username) {
		// TODO Auto-generated method stub
		
		List<MUserInfo> list=null;
		QueryRunner qr=new QueryRunner(Dbutils_.getDataSource());//�õ�����Դ
		try {
			String sql="SELECT * FROM USER WHERE user_name=? OR user_email=? OR user_phone =?";
			//��java���е�����(type),ͳһ��xxxx.class����
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
		
		QueryRunner qr=new QueryRunner(Dbutils_.getDataSource());//�õ�����Դ
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
