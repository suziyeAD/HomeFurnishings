package com.dt.info;

public class MUserInfo {
	private int user_id;
	private String user_name="0";
	private String user_pwd;
	private int user_power;
	private String user_email="0";
	private String user_phone="0";
	private String user_time;
	
	public MUserInfo() {
		super();
	}
	public MUserInfo(int user_id, String user_name, String user_pwd, int user_power, String user_email,
			String user_phone, String user_time) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.user_pwd = user_pwd;
		this.user_power = user_power;
		this.user_email = user_email;
		this.user_phone = user_phone;
		this.user_time = user_time;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_pwd() {
		return user_pwd;
	}
	public void setUser_pwd(String user_pwd) {
		this.user_pwd = user_pwd;
	}
	public int getUser_power() {
		return user_power;
	}
	public void setUser_power(int user_power) {
		this.user_power = user_power;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public String getUser_phone() {
		return user_phone;
	}
	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}
	public String getUser_time() {
		return user_time;
	}
	public void setUser_time(String user_time) {
		this.user_time = user_time;
	}
	
	
	
}
