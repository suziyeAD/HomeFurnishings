package com.dt.service.impl;

import com.dt.dao.D_UserDao;
import com.dt.dao.impl.D_UserDaoImpl;
import com.dt.service.D_UserService;

public class D_UserServiceImpl  implements D_UserService{
         D_UserDao ud=new D_UserDaoImpl();
	@Override
	public Integer getUserId() {
		return ud.getUserId();
	}
	@Override
	public Integer getUser() {

		return ud.getUser();
	}


}
