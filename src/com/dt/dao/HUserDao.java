package com.dt.dao;

import java.util.List;

import com.dt.info.HUser;

public interface HUserDao {
	//获取所有user
	List<HUser> getHUser();
	//添加user
	int[] add(HUser hUser);
	//删除user
	int[] delete(int userId);
	//修改user信息
	int update(HUser hUser);
	//通过id查询对应的user信息
	HUser getHUserById(int userId);
	//通过name查询
	List<HUser> getHUserByName(String userName);
}
