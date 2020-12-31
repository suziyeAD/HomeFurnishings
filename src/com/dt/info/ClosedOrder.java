package com.dt.info;

public class ClosedOrder {
	private int closedorder_id ;
	private String closedorder_name;
	private int closedorder_payId;
	private String closedorder_location;
	private String closedorder_picturename;
	private Double closedorder_price;
	private int closedorder_count;
	private String closedorder_closetime;
	private String payedProduct_orderId;
	private String closedorderproduct_orderId;
	private String shoppingcart_orderStatus;
	public ClosedOrder(int closedorder_id, String closedorder_name, int closedorder_payId, String closedorder_location,
			String closedorder_picturename, Double closedorder_price, int closedorder_count,
			String closedorder_closetime, String payedProduct_orderId, String closedorderproduct_orderId,
			String shoppingcart_orderStatus) {
		super();
		this.closedorder_id = closedorder_id;
		this.closedorder_name = closedorder_name;
		this.closedorder_payId = closedorder_payId;
		this.closedorder_location = closedorder_location;
		this.closedorder_picturename = closedorder_picturename;
		this.closedorder_price = closedorder_price;
		this.closedorder_count = closedorder_count;
		this.closedorder_closetime = closedorder_closetime;
		this.payedProduct_orderId = payedProduct_orderId;
		this.closedorderproduct_orderId = closedorderproduct_orderId;
		this.shoppingcart_orderStatus = shoppingcart_orderStatus;
	}
	public ClosedOrder() {
		super();
	}
	public int getClosedorder_id() {
		return closedorder_id;
	}
	public void setClosedorder_id(int closedorder_id) {
		this.closedorder_id = closedorder_id;
	}
	public String getClosedorder_name() {
		return closedorder_name;
	}
	public void setClosedorder_name(String closedorder_name) {
		this.closedorder_name = closedorder_name;
	}
	public int getClosedorder_payId() {
		return closedorder_payId;
	}
	public void setClosedorder_payId(int closedorder_payId) {
		this.closedorder_payId = closedorder_payId;
	}
	public String getClosedorder_location() {
		return closedorder_location;
	}
	public void setClosedorder_location(String closedorder_location) {
		this.closedorder_location = closedorder_location;
	}
	public String getClosedorder_picturename() {
		return closedorder_picturename;
	}
	public void setClosedorder_picturename(String closedorder_picturename) {
		this.closedorder_picturename = closedorder_picturename;
	}
	public Double getClosedorder_price() {
		return closedorder_price;
	}
	public void setClosedorder_price(Double closedorder_price) {
		this.closedorder_price = closedorder_price;
	}
	public int getClosedorder_count() {
		return closedorder_count;
	}
	public void setClosedorder_count(int closedorder_count) {
		this.closedorder_count = closedorder_count;
	}
	public String getClosedorder_closetime() {
		return closedorder_closetime;
	}
	public void setClosedorder_closetime(String closedorder_closetime) {
		this.closedorder_closetime = closedorder_closetime;
	}
	public String getPayedProduct_orderId() {
		return payedProduct_orderId;
	}
	public void setPayedProduct_orderId(String payedProduct_orderId) {
		this.payedProduct_orderId = payedProduct_orderId;
	}
	public String getClosedorderproduct_orderId() {
		return closedorderproduct_orderId;
	}
	public void setClosedorderproduct_orderId(String closedorderproduct_orderId) {
		this.closedorderproduct_orderId = closedorderproduct_orderId;
	}
	public String getShoppingcart_orderStatus() {
		return shoppingcart_orderStatus;
	}
	public void setShoppingcart_orderStatus(String shoppingcart_orderStatus) {
		this.shoppingcart_orderStatus = shoppingcart_orderStatus;
	}
	@Override
	public String toString() {
		return "ClosedOrder [closedorder_id=" + closedorder_id + ", closedorder_name=" + closedorder_name
				+ ", closedorder_payId=" + closedorder_payId + ", closedorder_location=" + closedorder_location
				+ ", closedorder_picturename=" + closedorder_picturename + ", closedorder_price=" + closedorder_price
				+ ", closedorder_count=" + closedorder_count + ", closedorder_closetime=" + closedorder_closetime
				+ ", payedProduct_orderId=" + payedProduct_orderId + ", closedorderproduct_orderId="
				+ closedorderproduct_orderId + ", shoppingcart_orderStatus=" + shoppingcart_orderStatus + "]";
	}
	
}
