package com.dt.dao;

import java.util.List;

import com.dt.info.Order;
import com.dt.info.Page;

public interface D_OrderDao {
	//����չʾ��������������״̬
	List<Order> getOrder(String aname,String pst);
	//����չʾ��������
	List<Order> getOrder02(String aname);
	//ҳ�����չʾ������Ϣ
	List<Order> getOrder02();
	//����idչʾ��Ϣ
	List<Order> getOrder03(String id);
	//����idɾ������
	int[] delOrder(String id);
	
	
	
	//ͳ������
	List<Order> getOrderCount();
	//ҳ����ط�ҳ/�����ѯ
	List<Order> getOrderByPage(Page page);
	//����������ҳ
	List<Order> getOrder(String aname,Page page);
	//��������������״̬��ҳ
	List<Order> getOrder(String aname,String pst,Page page);
}
