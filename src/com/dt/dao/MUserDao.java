package com.dt.dao;

import java.util.List;

import com.dt.info.MUserInfo;

public interface MUserDao {
	List<MUserInfo> selectUser(String username,String password);
	int addUser(MUserInfo ui);
	List<MUserInfo> checkUser(String username);
	int updatePwd(String username,String password,String newPwd);
}
