package com.dt.info;

public class AllProduct {
	private int allProduct_id;
	private String allProduct_name;
	private String allProduct_location;
	private String allProduct_picturename;
	private double allProduct_price;
	private int allProduct_count;
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
	public AllProduct(int allProduct_id, String allProduct_name, String allProduct_location,
			String allProduct_picturename, double allProduct_price, int allProduct_count) {
		super();
		this.allProduct_id = allProduct_id;
		this.allProduct_name = allProduct_name;
		this.allProduct_location = allProduct_location;
		this.allProduct_picturename = allProduct_picturename;
		this.allProduct_price = allProduct_price;
		this.allProduct_count = allProduct_count;
	}
	public AllProduct() {
		super();
	}
	@Override
	public String toString() {
		return "AllProduct [allProduct_id=" + allProduct_id + ", allProduct_name=" + allProduct_name
				+ ", allProduct_location=" + allProduct_location + ", allProduct_picturename=" + allProduct_picturename
				+ ", allProduct_price=" + allProduct_price + ", allProduct_count=" + allProduct_count + "]";
	}
	
	
	
}
