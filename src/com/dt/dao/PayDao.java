package com.dt.dao;

import java.util.List;

import com.dt.info.ClosedOrder;
import com.dt.info.Page;
import com.dt.info.PayedProduct;
import com.dt.info.User;

public interface PayDao {
	List<PayedProduct> getAllProduct(Page page,int aid);
	
	User getAllUser();
	
	//缁熻鏁伴噺
	List<PayedProduct> getProductCount(); 
	
	int delById(int id);
	
	//閫氳繃鍒犻櫎鎸夐挳鏌ヨ鍏ㄩ儴淇℃伅
	List<PayedProduct> getInfoProduct(int zid); 
	//寰�ClosedOrder閲岄潰娣诲姞鏁版嵁
	int addProduct(ClosedOrder clord);
	//鏌ヨ鍑篊losedOrder鎵�鏈夋暟鎹�
	List<ClosedOrder> getAllClosedOrder(int cid); 
	//妯＄硦鏌ヨ鏀粯鏁版嵁搴�
	List<PayedProduct> getAllInfoProduct(String pname);
	//妯＄硦鏌ヨ鍏抽棴鏁版嵁搴�
	List<ClosedOrder> getAllInfoClosed(String cname); 
}
