package com.dt.info;

public class Address {
	//µØÖ·±íµ¥
	private int address_id;
	private String address_name;
	private String addressr_phone;
	private String addressr_province;
	private String addressr_city;
	private String addressr_xian;
	private String addressr_qvyu;
	private String addressr_xiangxi;
	private String addressr_mail;
	private String addressProduct_orderId;
	public Address() {
		super();
	}
	public Address(int address_id, String address_name, String addressr_phone, String addressr_province,
			String addressr_city, String addressr_xian, String addressr_qvyu, String addressr_xiangxi,
			String addressr_mail, String addressProduct_orderId) {
		super();
		this.address_id = address_id;
		this.address_name = address_name;
		this.addressr_phone = addressr_phone;
		this.addressr_province = addressr_province;
		this.addressr_city = addressr_city;
		this.addressr_xian = addressr_xian;
		this.addressr_qvyu = addressr_qvyu;
		this.addressr_xiangxi = addressr_xiangxi;
		this.addressr_mail = addressr_mail;
		this.addressProduct_orderId = addressProduct_orderId;
	}
	

}
