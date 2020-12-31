package com.dt.dao;

import java.util.List;

import com.dt.info.HUser;

public interface HUserDao {
	//��ȡ����user
	List<HUser> getHUser();
	//���user
	int[] add(HUser hUser);
	//ɾ��user
	int[] delete(int userId);
	//�޸�user��Ϣ
	int update(HUser hUser);
	//ͨ��id��ѯ��Ӧ��user��Ϣ
	HUser getHUserById(int userId);
	//ͨ��name��ѯ
	List<HUser> getHUserByName(String userName);
}
