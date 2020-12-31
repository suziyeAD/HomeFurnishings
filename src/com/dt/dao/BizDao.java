package com.dt.dao;

import java.util.List;

import com.dt.info.Delete;
import com.dt.info.Info;

public interface BizDao {
       
	int saveInfo(Info info);//添加
	
	List<Info> getInfoAllList();//查询

	List<Info> getUserListByUsername(String name);//用户名查询
	
	int update(Info info);//修改
	
	int del(int AllProduct_id);//删除
	
	List<Info> getInfoById(int id);
	
	List<Delete> getDeleteAllLi();//回收表查询
	
	int getTable(int deleteProduct_id);//恢复
	
	int dels(int deleteProduct_id);//删除表
	
}
