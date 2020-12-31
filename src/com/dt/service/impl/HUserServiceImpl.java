package com.dt.service.impl;

import java.util.List;

import com.dt.dao.HUserDao;
import com.dt.dao.impl.HUserDaoImpl;
import com.dt.info.HUser;
import com.dt.service.HUserService;

public class HUserServiceImpl implements HUserService{
	HUserDao hd = new HUserDaoImpl();
	@Override
	public List<HUser> getHUser() {
		// TODO Auto-generated method stub
		
		return hd.getHUser();
	}

	@Override
	public int[] add(HUser hUser) {
		// TODO Auto-generated method stub
		return hd.add(hUser);
	}

	@Override
	public int[] delete(int userId) {
		// TODO Auto-generated method stub
		
		return hd.delete(userId);
	}

	@Override
	public int update(HUser hUser) {
		// TODO Auto-generated method stub
		return hd.update(hUser);
	}

	@Override
	public HUser getHUserById(int userId) {
		// TODO Auto-generated method stub
		return hd.getHUserById(userId);
	}

	@Override
	public List<HUser> getHUserByName(String userName) {
		// TODO Auto-generated method stub
		return hd.getHUserByName(userName);
	}

}
