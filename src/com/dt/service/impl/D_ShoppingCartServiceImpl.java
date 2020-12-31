package com.dt.service.impl;

import com.dt.dao.D_ShoppingCartDao;
import com.dt.dao.impl.D_ShoppingCartDaoImpl;
import com.dt.dao.impl.D_UserDaoImpl;
import com.dt.service.D_ShoppingCartService;

public class D_ShoppingCartServiceImpl implements D_ShoppingCartService{
         
	D_ShoppingCartDao ds= new D_ShoppingCartDaoImpl();

		@Override
		public Integer getShopping() {
			
			return ds.getShopping();
		}

		@Override
		public Integer getShopping2() {
			
			return ds.getShopping2();
		}

		@Override
		public Integer getShopping3() {
			
			return ds.getShopping3();
		}
	}