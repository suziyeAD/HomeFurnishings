package com.dt.info;

import java.util.Date;

public class PayedProduct {
	private int payedproduct_id;
	private String payedProduct_name;
	private int payedProduct_payId;
	private String payedProduct_location;
	private String payedProduct_picturename;
	private Double payedProduct_price;
	private int payedProduct_count;
	private String payedProduct_paytime;
	private String payedProduct_orderId;
	private String payedProduct_orderStatus;
	public PayedProduct(int payedproduct_id, String payedProduct_name, int payedProduct_payId,
			String payedProduct_location, String payedProduct_picturename, Double payedProduct_price,
			int payedProduct_count, String payedProduct_paytime, String payedProduct_orderId,
			String payedProduct_orderStatus) {
		super();
		this.payedproduct_id = payedproduct_id;
		this.payedProduct_name = payedProduct_name;
		this.payedProduct_payId = payedProduct_payId;
		this.payedProduct_location = payedProduct_location;
		this.payedProduct_picturename = payedProduct_picturename;
		this.payedProduct_price = payedProduct_price;
		this.payedProduct_count = payedProduct_count;
		this.payedProduct_paytime = payedProduct_paytime;
		this.payedProduct_orderId = payedProduct_orderId;
		this.payedProduct_orderStatus = payedProduct_orderStatus;
	}
	public PayedProduct() {
		super();
	}
	public int getPayedproduct_id() {
		return payedproduct_id;
	}
	public void setPayedproduct_id(int payedproduct_id) {
		this.payedproduct_id = payedproduct_id;
	}
	public String getPayedProduct_name() {
		return payedProduct_name;
	}
	public void setPayedProduct_name(String payedProduct_name) {
		this.payedProduct_name = payedProduct_name;
	}
	public int getPayedProduct_payId() {
		return payedProduct_payId;
	}
	public void setPayedProduct_payId(int payedProduct_payId) {
		this.payedProduct_payId = payedProduct_payId;
	}
	public String getPayedProduct_location() {
		return payedProduct_location;
	}
	public void setPayedProduct_location(String payedProduct_location) {
		this.payedProduct_location = payedProduct_location;
	}
	public String getPayedProduct_picturename() {
		return payedProduct_picturename;
	}
	public void setPayedProduct_picturename(String payedProduct_picturename) {
		this.payedProduct_picturename = payedProduct_picturename;
	}
	public Double getPayedProduct_price() {
		return payedProduct_price;
	}
	public void setPayedProduct_price(Double payedProduct_price) {
		this.payedProduct_price = payedProduct_price;
	}
	public int getPayedProduct_count() {
		return payedProduct_count;
	}
	public void setPayedProduct_count(int payedProduct_count) {
		this.payedProduct_count = payedProduct_count;
	}
	public String getPayedProduct_paytime() {
		return payedProduct_paytime;
	}
	public void setPayedProduct_paytime(String payedProduct_paytime) {
		this.payedProduct_paytime = payedProduct_paytime;
	}
	public String getPayedProduct_orderId() {
		return payedProduct_orderId;
	}
	public void setPayedProduct_orderId(String payedProduct_orderId) {
		this.payedProduct_orderId = payedProduct_orderId;
	}
	public String getPayedProduct_orderStatus() {
		return payedProduct_orderStatus;
	}
	public void setPayedProduct_orderStatus(String payedProduct_orderStatus) {
		this.payedProduct_orderStatus = payedProduct_orderStatus;
	}
	@Override
	public String toString() {
		return "PayedProduct [payedproduct_id=" + payedproduct_id + ", payedProduct_name=" + payedProduct_name
				+ ", payedProduct_payId=" + payedProduct_payId + ", payedProduct_location=" + payedProduct_location
				+ ", payedProduct_picturename=" + payedProduct_picturename + ", payedProduct_price="
				+ payedProduct_price + ", payedProduct_count=" + payedProduct_count + ", payedProduct_paytime="
				+ payedProduct_paytime + ", payedProduct_orderId=" + payedProduct_orderId
				+ ", payedProduct_orderStatus=" + payedProduct_orderStatus + "]";
	}
	
}
