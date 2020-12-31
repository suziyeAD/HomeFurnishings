package com.dt.info;

public class Delete {
	private int deleteProduct_id;
	private String deleteProduct_name;//名称
	private String deleteProduct_location;//路径
	private String deleteProduct_picturename;////类别
	private double deleteProduct_price;//价格
	private int deleteProduct_count;//数量
	private String delete_Date;
	



	public Delete() {
		
	}
	
	

	public Delete(int deleteProduct_id, String deleteProduct_name, String deleteProduct_location,
			String deleteProduct_picturename, double deleteProduct_price, int deleteProduct_count,String delete_Date) {
		super();
		this.deleteProduct_id = deleteProduct_id;
		this.deleteProduct_name = deleteProduct_name;
		this.deleteProduct_location = deleteProduct_location;
		this.deleteProduct_picturename = deleteProduct_picturename;
		this.deleteProduct_price = deleteProduct_price;
		this.deleteProduct_count = deleteProduct_count;
		this.delete_Date = delete_Date;
	}



	public int getDeleteProduct_id() {
		return deleteProduct_id;
	}

	public void setDeleteProduct_id(int deleteProduct_id) {
		this.deleteProduct_id = deleteProduct_id;
	}

	public String getDeleteProduct_name() {
		return deleteProduct_name;
	}

	public void setDeleteProduct_name(String deleteProduct_name) {
		this.deleteProduct_name = deleteProduct_name;
	}

	public String getDeleteProduct_location() {
		return deleteProduct_location;
	}

	public void setDeleteProduct_location(String deleteProduct_location) {
		this.deleteProduct_location = deleteProduct_location;
	}

	public String getDeleteProduct_picturename() {
		return deleteProduct_picturename;
	}

	public void setDeleteProduct_picturename(String deleteProduct_picturename) {
		this.deleteProduct_picturename = deleteProduct_picturename;
	}

	public double getDeleteProduct_price() {
		return deleteProduct_price;
	}

	public void setDeleteProduct_price(double deleteProduct_price) {
		this.deleteProduct_price = deleteProduct_price;
	}

	public int getDeleteProduct_count() {
		return deleteProduct_count;
	}

	public void setDeleteProduct_count(int deleteProduct_count) {
		this.deleteProduct_count = deleteProduct_count;
	}

	
	public String getDelete_Date() {
		return delete_Date;
	}

	public void setDelete_Date(String delete_Date) {
		this.delete_Date = delete_Date;
	}

}
