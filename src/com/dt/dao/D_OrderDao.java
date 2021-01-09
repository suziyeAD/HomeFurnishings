package com.dt.dao;

import java.util.List;

import com.dt.info.Order;
import com.dt.info.Page;

public interface D_OrderDao {
	//订单展示根据姓名、订单状态
	List<Order> getOrder(String aname,String pst);
	//订单展示根据姓名
	List<Order> getOrder02(String aname);
	//页面加载展示所有信息
	List<Order> getOrder02();
	//根据id展示信息
	List<Order> getOrder03(String id);
	//根据id删除订单
	int[] delOrder(String id);
	
	
	
	//统计数量
	List<Order> getOrderCount();
	//页面加载分页/点击查询
	List<Order> getOrderByPage(Page page);
	//根据姓名分页
	List<Order> getOrder(String aname,Page page);
	//根据姓名、订单状态分页
	List<Order> getOrder(String aname,String pst,Page page);
}
