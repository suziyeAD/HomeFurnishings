package com.dt.info;

import java.util.Date;

public class HUser {
	private int userId;
	private String userName;
	private String userPwd;
	private int userPower;
	private String userEmail;
	private String userPhone;
	private String userTime;
	
	public HUser() {
		super();
	}
	public HUser(int userId, String userName, String userPwd, int userPower, String userEmail, String userPhone,String userTime) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPwd = userPwd;
		this.userPower = userPower;
		this.userEmail = userEmail;
		this.userPhone = userPhone;
		this.userTime = userTime;
	}
	public HUser(int userId, String userName,String userEmail, String userPhone) {
		super();
		this.userId = userId;
		this.userName = userName;
		//this.userPwd = userPwd;
		this.userEmail = userEmail;
		this.userPhone = userPhone;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public int getUserPower() {
		return userPower;
	}
	public void setUserPower(int userPower) {
		this.userPower = userPower;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserTime() {
		return userTime;
	}
	public void setUserTime(String userTime) {
		this.userTime = userTime;
	}
	@Override
	public String toString() {
		return "HUser [userId=" + userId + ", userName=" + userName + ", userPwd=" + userPwd + ", userPower="
				+ userPower + ", userEmail=" + userEmail + ", userPhone=" + userPhone + ", userTime=" + userTime + "]";
	}
	
	
}
