package com.dt.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.dt.dao.PayDao;
import com.dt.info.ClosedOrder;
import com.dt.info.Page;
import com.dt.info.PayedProduct;
import com.dt.info.User;
import com.dt.util.Dbutils_;

public class PayDaoImpl implements PayDao{
	
	QueryRunner qr = new QueryRunner(Dbutils_.getDataSource());
	
	@Override
	public List<PayedProduct> getAllProduct(Page page,int aid) {
		// TODO Auto-generated method stub
		List<PayedProduct> list=null;
		try {
			String sql = "SELECT * FROM payedproduct WHERE PayedProduct_payId=? UNION SELECT * FROM closedorder WHERE ClosedOrder_payId=? LIMIT ?,?";
			list= qr.query(sql, new BeanListHandler<PayedProduct>(PayedProduct.class),aid,aid,(page.getCurrentpage()-1)*page.getPagesize(),page.getPagesize());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public User getAllUser() {
		// TODO Auto-generated method stub
		List<User> list=null;
		try {
			String sql = "SELECT * FROM USER";
			return qr.query(sql, new BeanHandler<User>(User.class));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<PayedProduct> getProductCount() {
		// TODO Auto-generated method stub
		List<PayedProduct> list=null;
		try {
			String sql="SELECT * FROM payedproduct";
			return qr.query(sql, new BeanListHandler<PayedProduct>(PayedProduct.class));
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	@Override
	public int delById(int id) {
		// TODO Auto-generated method stub
		int flag=0;
		try {
			String sql="DELETE FROM payedproduct WHERE PayedProduct_id=?";
			flag= qr.update(sql, id);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public List<PayedProduct> getInfoProduct(int zid) {
		// TODO Auto-generated method stub
		List<PayedProduct> list=null;
		try {
			String sql="SELECT * FROM payedproduct WHERE PayedProduct_id =? ";
			return qr.query(sql, new BeanListHandler<PayedProduct>(PayedProduct.class),zid);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	@Override
	public int addProduct(ClosedOrder co) {
		// TODO Auto-generated method stub
		int flag=0;
		try {
			String sql="INSERT INTO closedorder VALUES(?,?,?,?,?,?,?,?,?,?)";
			flag= qr.update(sql,co.getClosedorder_id(),co.getClosedorder_name(),co.getClosedorder_payId(),co.getClosedorder_location(),co.getClosedorder_picturename(),co.getClosedorder_price(),co.getClosedorder_count(),co.getClosedorder_closetime(),co.getClosedorderproduct_orderId(),co.getShoppingcart_orderStatus());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public List<ClosedOrder> getAllClosedOrder(int cid) {
		// TODO Auto-generated method stub
		List<ClosedOrder> list=null;
		try {
			String sql="SELECT * FROM closedorder WHERE ClosedOrder_payId=? ";
			return qr.query(sql, new BeanListHandler<ClosedOrder>(ClosedOrder.class),cid);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}

	@Override
	public List<PayedProduct> getAllInfoProduct(String pname) {
		// TODO Auto-generated method stub
		List<PayedProduct> list=null;
		try {
			String sql="SELECT * FROM payedproduct WHERE payedproduct_name LIKE CONCAT('%',?,'%')";
			return qr.query(sql, new BeanListHandler<PayedProduct>(PayedProduct.class),pname);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<ClosedOrder> getAllInfoClosed(String cname) {
		// TODO Auto-generated method stub
		List<ClosedOrder> list=null;
		try {
			String sql="SELECT * FROM closedorder WHERE ClosedOrder_name LIKE CONCAT('%',?,'%')";
			return qr.query(sql, new BeanListHandler<ClosedOrder>(ClosedOrder.class),cname);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
	}	
}
