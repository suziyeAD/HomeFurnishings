package com.dt.service;

import java.util.List;

import com.dt.dao.HUserDao;
import com.dt.info.HUser;

public interface HUserService extends HUserDao{
	List<HUser> getHUser();
	int[] add(HUser hUser);
	int[] delete(int userId);
	int update(HUser hUser);
	HUser getHUserById(int userId);
	List<HUser> getHUserByName(String userName);
}
