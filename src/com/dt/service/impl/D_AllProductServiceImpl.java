package com.dt.service.impl;

import com.dt.dao.D_AllProductDao;
import com.dt.dao.impl.D_AllProductDaoImpl;
import com.dt.service.D_AllProductService;

public class D_AllProductServiceImpl implements D_AllProductService {
	
	D_AllProductDao  dad=new D_AllProductDaoImpl();  
	
	@Override
	public Integer getAllProduct() {
	
		return dad.getAllProduct();
	}

	@Override
	public String getAllProductPrice() {
		
		return dad.getAllProductPrice();
	}

}
