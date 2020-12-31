package com.dt.dao;

import java.util.List;

import com.dt.info.AllProduct;
import com.dt.info.PayedProduct;
import com.dt.info.ShoppingCart;

public interface BaseDao {
	List<AllProduct> getIndexFlower();
	List<AllProduct> getIndexFlower2();
	List<AllProduct> getIndexWall();
	List<AllProduct> getIndexWall2();
	List<AllProduct> getIndexWall3();
	List<AllProduct> getFlowerDer();
	List<AllProduct> getDecoration();
	List<AllProduct> getPaint1();
	List<AllProduct> getPaint2();
	List<AllProduct> getPaint3();
	List<AllProduct> getPaint4();
	List<AllProduct> getPerfume1();
	List<AllProduct> getPerfume2();
	List<AllProduct> getIdeaOne1();
	List<AllProduct> getIdeaOne2();
	List<AllProduct> getIdeaOne3();
	List<AllProduct> getIdeaTwo1();
	List<AllProduct> getIdeaTwo2();
	List<AllProduct> getIdeaThree1();
	List<AllProduct> getIdeaThree2();
	AllProduct getSale(Integer sid);
	int insertById(Integer sid,Integer num,Integer payId);//ͨ�����ֱ�ӹ������ݴ������ݿ�
	List<ShoppingCart> getAllShopping(Integer payId);
	String getoOrderId();//����16λ����
	void InsertPayedProduct();
	int addtoShoppingCrt(Integer id,Integer num,Integer payid);
	int delShopping(Integer id);
}
