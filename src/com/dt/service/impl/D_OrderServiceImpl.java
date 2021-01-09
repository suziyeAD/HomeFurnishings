package com.dt.service.impl;

import java.util.List;

import com.dt.dao.D_OrderDao;
import com.dt.dao.impl.D_OrderDaoImpl;
import com.dt.info.Order;
import com.dt.info.Page;
import com.dt.service.D_OrderService;

public class D_OrderServiceImpl implements D_OrderService {
           
	 D_OrderDao  dod=new D_OrderDaoImpl();

	@Override
	public List<Order> getOrder(String aname, String pst) {
		
		return dod.getOrder(aname, pst);
	}

	@Override
	public List<Order> getOrder02() {
		
		return dod.getOrder02();
	}

	@Override
	public List<Order> getOrder02(String aname) {
		
		return dod.getOrder02(aname);
	}

	@Override
	public List<Order> getOrder03(String id) {
		
		return dod.getOrder03(id);
	}

	@Override
	public int[] delOrder(String id) {
		
		return dod.delOrder(id);
	}

	@Override
	public List<Order> getOrderByPage(Page page) {
		
		return dod.getOrderByPage(page);
	}

	@Override
	public List<Order> getOrderCount() {
		
		return dod.getOrderCount();
	}



	@Override
	public List<Order> getOrder(String aname, Page page) {
		
		return  dod.getOrder(aname, page);
	}

	@Override
	public List<Order> getOrder(String aname, String pst, Page page) {
		
		return dod.getOrder(aname, pst, page);
	}

    

}
