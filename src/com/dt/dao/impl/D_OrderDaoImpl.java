package com.dt.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.junit.Test;

import com.dt.dao.D_OrderDao;
import com.dt.info.Order;
import com.dt.info.Page;
import com.dt.util.Dbutils_;


public class D_OrderDaoImpl implements D_OrderDao {
    //姓名  订单状态查询
	@Override
	public List<Order> getOrder(String aname,String pst) {
		List<Order> list=null;
		  QueryRunner qr= new QueryRunner(Dbutils_.getDataSource());
	  try {
		  String sql="SELECT p.`payedProduct_orderId` pid,p.`payedProduct_paytime` ptime,a.`address_name` aname,a.`addressr_phone` aphone,a.`addressr_province` apro,a.`addressr_city` acity, a.`addressr_qvyu` aqvyu,a.`addressr_xian` axian,a.`addressr_xiangxi` axiangxi,(p.`payedProduct_price` * p.`payedProduct_count`) pric,p.`payedProduct_orderStatus` pst "
		  		+ "FROM payedproduct p "
		  		+ "INNER JOIN address a "
		  		+ "ON p.`payedProduct_orderId` = a.`addressProduct_orderId` "
		  		+ "WHERE a.`address_name`='"+aname+"' "
		  		+ "AND   p.`payedProduct_orderStatus`='"+pst+"'"
		  		+ "UNION "
		  		+ "SELECT  c.`closedOrder_orderId` cid, c.`closedOrder_closetime` ctime, a.`address_name` aname, a.`addressr_phone` aphone,  a.`addressr_province` apro,  a.`addressr_city` acity,  a.`addressr_qvyu` aqvyu,  a.`addressr_xian` axian,  a.`addressr_xiangxi` axiangxi,(  c.`closedOrder_price` * c.`closedOrder_count`) cpric, c.`shoppingCart_orderStatus` sct "
		  		+ "FROM `closedorder` c "
		  		+ "INNER JOIN `address` a "
		  		+ "ON a.`addressProduct_orderId` = c.`closedOrder_orderId` "
		  		+ "WHERE a.`address_name`='"+aname+"' "
		  		+ "AND  c.`shoppingCart_orderStatus`='"+pst+"'";
		  list=qr.query(sql,new BeanListHandler<Order>(Order.class));
	} catch (Exception e) {
		e.printStackTrace();
	}
		return list;
	}
	//查询所有
	@Override
	public List<Order> getOrder02() {
		List<Order> list02=null;
		  QueryRunner qr= new QueryRunner(Dbutils_.getDataSource());
	  try {
		  String sql="SELECT p.`payedProduct_orderId` pid,p.`payedProduct_paytime` ptime,a.`address_name` aname,a.`addressr_phone` aphone,a.`addressr_province` apro,a.`addressr_city` acity, a.`addressr_qvyu` aqvyu,a.`addressr_xian` axian,a.`addressr_xiangxi` axiangxi,(p.`payedProduct_price` * p.`payedProduct_count`) pric,p.`payedProduct_orderStatus` pst "
		  		+ "FROM payedproduct p "
		  		+ "INNER JOIN address a "
		  		+ "ON p.`payedProduct_orderId` = a.`addressProduct_orderId` "	
		  		+ "UNION "
		  		+ "SELECT  c.`closedOrder_orderId` cid, c.`closedOrder_closetime` ctime, a.`address_name` aname, a.`addressr_phone` aphone,  a.`addressr_province` apro,  a.`addressr_city` acity,  a.`addressr_qvyu` aqvyu,  a.`addressr_xian` axian,  a.`addressr_xiangxi` axiangxi,(  c.`closedOrder_price` * c.`closedOrder_count`) cpric, c.`shoppingCart_orderStatus` sct "
		  		+ "FROM `closedorder` c "
		  		+ "INNER JOIN `address` a "
		  		+ "ON a.`addressProduct_orderId` = c.`closedOrder_orderId` ";
		  list02=qr.query(sql,new BeanListHandler<Order>(Order.class));
	} catch (Exception e) {
		e.printStackTrace();
	}
		return list02;
	}
	//根据姓名查
	@Override
	public List<Order> getOrder02(String aname) {
		List<Order> list=null;
		  QueryRunner qr= new QueryRunner(Dbutils_.getDataSource());
	  try {
		  String sql="SELECT p.`payedProduct_orderId` pid,p.`payedProduct_paytime` ptime,a.`address_name` aname,a.`addressr_phone` aphone,a.`addressr_province` apro,a.`addressr_city` acity, a.`addressr_qvyu` aqvyu,a.`addressr_xian` axian,a.`addressr_xiangxi` axiangxi,(p.`payedProduct_price` * p.`payedProduct_count`) pric,p.`payedProduct_orderStatus` pst "
		  		+ "FROM payedproduct p "
		  		+ "INNER JOIN address a "
		  		+ "ON p.`payedProduct_orderId` = a.`addressProduct_orderId` "
		  		+ "WHERE a.`address_name` LIKE '%"+aname+"%' "
		  		+ "UNION "
		  		+ "SELECT  c.`closedOrder_orderId` cid, c.`closedOrder_closetime` ctime, a.`address_name` aname, a.`addressr_phone` aphone,  a.`addressr_province` apro,  a.`addressr_city` acity,  a.`addressr_qvyu` aqvyu,  a.`addressr_xian` axian,  a.`addressr_xiangxi` axiangxi,(  c.`closedOrder_price` * c.`closedOrder_count`) cpric, c.`shoppingCart_orderStatus` sct "
		  		+ "FROM `closedorder` c "
		  		+ "INNER JOIN `address` a "
		  		+ "ON a.`addressProduct_orderId` = c.`closedOrder_orderId` "
		  		+ "WHERE a.`address_name` LIKE '%"+aname+"%' ";
		  list=qr.query(sql,new BeanListHandler<Order>(Order.class));
	} catch (Exception e) {
		e.printStackTrace();
	}
		return list;
	}
	//根据id查看详情
	@Override
	public List<Order> getOrder03(String id) {
		
		List<Order> list=null;
		  QueryRunner qr= new QueryRunner(Dbutils_.getDataSource());
	  try {
		  String sql="SELECT p.`payedProduct_orderId` pid,p.`payedProduct_paytime` ptime,p.`payedProduct_name` panme,p.`payedProduct_price` pprice, p.`payedProduct_count` pcount,a.`address_name` aname,a.`addressr_phone` aphone,a.`addressr_province` apro,a.`addressr_city` acity, a.`addressr_qvyu` aqvyu,a.`addressr_xian` axian,a.`addressr_xiangxi` axiangxi,(p.`payedProduct_price` * p.`payedProduct_count`) pric,p.`payedProduct_orderStatus` pst "
		  		+ "FROM payedproduct p "
		  		+ "INNER JOIN address a "
		  		+ "ON p.`payedProduct_orderId` = a.`addressProduct_orderId` "
		  		+ " WHERE  p.`payedProduct_orderId`='"+id+"' "
		  		+ "UNION "
		  		+ "SELECT  c.`closedOrder_orderId` cid, c.`closedOrder_closetime` ctime,c.closedOrder_name canme,c.`closedOrder_price`  cprice,c.`closedOrder_count` ccount, a.`address_name` aname, a.`addressr_phone` aphone,  a.`addressr_province` apro,  a.`addressr_city` acity,  a.`addressr_qvyu` aqvyu,  a.`addressr_xian` axian,  a.`addressr_xiangxi` axiangxi,(  c.`closedOrder_price` * c.`closedOrder_count`) cpric, c.`shoppingCart_orderStatus` sct "
		  		+ "FROM `closedorder` c "
		  		+ "INNER JOIN `address` a "
		  		+ "ON a.`addressProduct_orderId` = c.`closedOrder_orderId` "
		  		+ " WHERE c.`closedOrder_orderId`='"+id+"'";
		  list=qr.query(sql,new BeanListHandler<Order>(Order.class));
	} catch (Exception e) {
		e.printStackTrace();
	}
		return list;
	}


	//根据id删除订单
	@Override
	public int[] delOrder(String id) {
		int[] flag=new int[1];
		String sql = null;
		String sql2= null;
		  QueryRunner qr= new QueryRunner(Dbutils_.getDataSource());
		  try {
		  String s1 = "select * from payedproduct where payedProduct_orderId=?";
		  Order query = qr.query(s1, id, new BeanHandler<>(Order.class));
		  if(query!=null){
			   sql="DELETE FROM `payedproduct` WHERE  payedProduct_orderId=?";
			   flag[0]=qr.update(sql,id);
		  }else{
		 sql2="DELETE FROM  `closedorder` WHERE  closedOrder_orderId=?";
		 flag[0]=qr.update(sql2,id);
		  }
	} catch (Exception e) {
		e.printStackTrace();
	}
		return flag;
	}
	//分页
	@Override
	public List<Order> getOrderByPage(Page page) {
		List<Order> list=null;
		  QueryRunner qr= new QueryRunner(Dbutils_.getDataSource());
	  try {
		  String sql="SELECT p.`payedProduct_orderId` pid,p.`payedProduct_paytime` ptime,a.`address_name` aname,a.`addressr_phone` aphone,a.`addressr_province` apro,a.`addressr_city` acity, a.`addressr_qvyu` aqvyu,a.`addressr_xian` axian,a.`addressr_xiangxi` axiangxi,(p.`payedProduct_price` * p.`payedProduct_count`) pric,p.`payedProduct_orderStatus` pst "
		  		+ "FROM payedproduct p "
		  		+ "INNER JOIN address a "
		  		+ "ON p.`payedProduct_orderId` = a.`addressProduct_orderId` "	
		  		+ "UNION "
		  		+ "SELECT  c.`closedOrder_orderId` cid, c.`closedOrder_closetime` ctime, a.`address_name` aname, a.`addressr_phone` aphone,  a.`addressr_province` apro,  a.`addressr_city` acity,  a.`addressr_qvyu` aqvyu,  a.`addressr_xian` axian,  a.`addressr_xiangxi` axiangxi,(  c.`closedOrder_price` * c.`closedOrder_count`) cpric, c.`shoppingCart_orderStatus` sct "
		  		+ "FROM `closedorder` c "
		  		+ "INNER JOIN `address` a "
		  		+ "ON a.`addressProduct_orderId` = c.`closedOrder_orderId` LIMIT ?,? ";
		  list=qr.query(sql,new BeanListHandler<Order>(Order.class),(page.getCurrentpage()-1)*page.getPagesize(),page.getPagesize());
	  } catch (Exception e) {
		e.printStackTrace();
	}
		return list;
	}
	//统计数据
	@Override
	public List<Order> getOrderCount() {
		List<Order> list=null;
		  QueryRunner qr= new QueryRunner(Dbutils_.getDataSource());
	  try {
		  String sql="SELECT p.`payedProduct_orderId` pid,p.`payedProduct_paytime` ptime,a.`address_name` aname,a.`addressr_phone` aphone,a.`addressr_province` apro,a.`addressr_city` acity, a.`addressr_qvyu` aqvyu,a.`addressr_xian` axian,a.`addressr_xiangxi` axiangxi,(p.`payedProduct_price` * p.`payedProduct_count`) pric,p.`payedProduct_orderStatus` pst "
		  		+ "FROM payedproduct p "
		  		+ "INNER JOIN address a "
		  		+ "ON p.`payedProduct_orderId` = a.`addressProduct_orderId` "	
		  		+ "UNION "
		  		+ "SELECT  c.`closedOrder_orderId` cid, c.`closedOrder_closetime` ctime, a.`address_name` aname, a.`addressr_phone` aphone,  a.`addressr_province` apro,  a.`addressr_city` acity,  a.`addressr_qvyu` aqvyu,  a.`addressr_xian` axian,  a.`addressr_xiangxi` axiangxi,(  c.`closedOrder_price` * c.`closedOrder_count`) cpric, c.`shoppingCart_orderStatus` sct "
		  		+ "FROM `closedorder` c "
		  		+ "INNER JOIN `address` a "
		  		+ "ON a.`addressProduct_orderId` = c.`closedOrder_orderId`  ";
		  list=qr.query(sql,new BeanListHandler<Order>(Order.class));
	} catch (Exception e) {
		e.printStackTrace();
	}
		return list;
	}
	@Test
	public void shou(){
		D_OrderDao dd=new D_OrderDaoImpl();
		try {
			List<Order> order02 = dd.getOrder02();
			for (Order  ff: order02) {
				System.out.println(ff.toString());
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
