package com.dt.info;

public class Info {
	
	private int allProduct_id;
	private String allProduct_name;//名称
	private String allProduct_location;//路径
	private String allProduct_picturename;////类别
	private double allProduct_price;//价格
	private int allProduct_count;//数量
		
	public Info() {
		
	}

	public Info(String allProduct_name, String allProduct_location, String allProduct_picturename,
			double allProduct_price, int allProduct_count) {
		super();
		this.allProduct_name = allProduct_name;
		this.allProduct_location = allProduct_location;
		this.allProduct_picturename = allProduct_picturename;
		this.allProduct_price = allProduct_price;
		this.allProduct_count = allProduct_count;
	}



	public Info(int allProduct_id, String allProduct_name, String allProduct_location, String allProduct_picturename,
			double allProduct_price, int allProduct_count) {
		super();
		this.allProduct_id = allProduct_id;
		this.allProduct_name = allProduct_name;
		this.allProduct_location = allProduct_location;
		this.allProduct_picturename = allProduct_picturename;
		this.allProduct_price = allProduct_price;
		this.allProduct_count = allProduct_count;
	}



	public int getAllProduct_id() {
		return allProduct_id;
	}



	public void setAllProduct_id(int allProduct_id) {
		this.allProduct_id = allProduct_id;
	}



	public String getAllProduct_name() {
		return allProduct_name;
	}



	public void setAllProduct_name(String allProduct_name) {
		this.allProduct_name = allProduct_name;
	}



	public String getAllProduct_location() {
		return allProduct_location;
	}



	public void setAllProduct_location(String allProduct_location) {
		this.allProduct_location = allProduct_location;
	}



	public String getAllProduct_picturename() {
		return allProduct_picturename;
	}



	public void setAllProduct_picturename(String allProduct_picturename) {
		this.allProduct_picturename = allProduct_picturename;
	}



	public double getAllProduct_price() {
		return allProduct_price;
	}



	public void setAllProduct_price(double allProduct_price) {
		this.allProduct_price = allProduct_price;
	}



	public int getAllProduct_count() {
		return allProduct_count;
	}



	public void setAllProduct_count(int allProduct_count) {
		this.allProduct_count = allProduct_count;
	}
	

}
