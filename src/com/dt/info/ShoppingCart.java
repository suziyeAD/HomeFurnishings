package com.dt.info;

public class ShoppingCart {
	   private int shoppingCart_id; 
	   private int  allProduct_id; 
	   private String shoppingCart_name; 
	   private int shoppingCart_payId;  
	   private String shoppingCart_location; 
	   private String  shoppingCart_picturename;  
	   private double shoppingCart_price;
	   private int shoppingCart_count;
	   private String shoppingCart_carttime;
	   private String shoppingCart_orderStatus;
	


	public ShoppingCart(int shoppingCart_id, int allProduct_id, String shoppingCart_name, int shoppingCart_payId,
			String shoppingCart_location, String shoppingCart_picturename, double shoppingCart_price,
			int shoppingCart_count, String shoppingCart_carttime, String shoppingCart_orderStatus) {
		super();
		this.shoppingCart_id = shoppingCart_id;
		this.allProduct_id = allProduct_id;
		this.shoppingCart_name = shoppingCart_name;
		this.shoppingCart_payId = shoppingCart_payId;
		this.shoppingCart_location = shoppingCart_location;
		this.shoppingCart_picturename = shoppingCart_picturename;
		this.shoppingCart_price = shoppingCart_price;
		this.shoppingCart_count = shoppingCart_count;
		this.shoppingCart_carttime = shoppingCart_carttime;
		this.shoppingCart_orderStatus = shoppingCart_orderStatus;
	}



	public int getShoppingCart_id() {
		return shoppingCart_id;
	}



	public void setShoppingCart_id(int shoppingCart_id) {
		this.shoppingCart_id = shoppingCart_id;
	}



	public int getAllProduct_id() {
		return allProduct_id;
	}



	public void setAllProduct_id(int allProduct_id) {
		this.allProduct_id = allProduct_id;
	}



	public String getShoppingCart_name() {
		return shoppingCart_name;
	}



	public void setShoppingCart_name(String shoppingCart_name) {
		this.shoppingCart_name = shoppingCart_name;
	}



	public int getShoppingCart_payId() {
		return shoppingCart_payId;
	}



	public void setShoppingCart_payId(int shoppingCart_payId) {
		this.shoppingCart_payId = shoppingCart_payId;
	}



	public String getShoppingCart_location() {
		return shoppingCart_location;
	}



	public void setShoppingCart_location(String shoppingCart_location) {
		this.shoppingCart_location = shoppingCart_location;
	}



	public String getShoppingCart_picturename() {
		return shoppingCart_picturename;
	}



	public void setShoppingCart_picturename(String shoppingCart_picturename) {
		this.shoppingCart_picturename = shoppingCart_picturename;
	}



	public double getShoppingCart_price() {
		return shoppingCart_price;
	}



	public void setShoppingCart_price(double shoppingCart_price) {
		this.shoppingCart_price = shoppingCart_price;
	}



	public int getShoppingCart_count() {
		return shoppingCart_count;
	}



	public void setShoppingCart_count(int shoppingCart_count) {
		this.shoppingCart_count = shoppingCart_count;
	}



	public String getShoppingCart_carttime() {
		return shoppingCart_carttime;
	}



	public void setShoppingCart_carttime(String shoppingCart_carttime) {
		this.shoppingCart_carttime = shoppingCart_carttime;
	}



	public String getShoppingCart_orderStatus() {
		return shoppingCart_orderStatus;
	}



	public void setShoppingCart_orderStatus(String shoppingCart_orderStatus) {
		this.shoppingCart_orderStatus = shoppingCart_orderStatus;
	}



	public ShoppingCart() {
		super();
	} 
	   
	   
}
