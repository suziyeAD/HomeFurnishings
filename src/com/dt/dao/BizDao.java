package com.dt.dao;

import java.util.List;

import com.dt.info.Delete;
import com.dt.info.Info;

public interface BizDao {
       
	int saveInfo(Info info);//���
	
	List<Info> getInfoAllList();//��ѯ

	List<Info> getUserListByUsername(String name);//�û�����ѯ
	
	int update(Info info);//�޸�
	
	int del(int AllProduct_id);//ɾ��
	
	List<Info> getInfoById(int id);
	
	List<Delete> getDeleteAllLi();//���ձ��ѯ
	
	int getTable(int deleteProduct_id);//�ָ�
	
	int dels(int deleteProduct_id);//ɾ����
	
}
