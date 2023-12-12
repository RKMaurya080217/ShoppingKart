package com.shoppingkart.dto;

public class OrderDetailDTO {
	private int orderid;
	private int productid;
	private String userName;
	private String orderdate;
	private String deliverydate;
	private int quantity;
	private String plateformname;
	private String deliveryaddress;
	private String paymentmethod;

	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getOrderdate() {
		return orderdate;
	}

	public void setOrderdate(String orderdate) {
		this.orderdate = orderdate;
	}

	public String getDeliverydate() {
		return deliverydate;
	}

	public void setDeliverydate(String deliverydate) {
		this.deliverydate = deliverydate;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getPlateformname() {
		return plateformname;
	}

	public void setPlateformname(String plateformname) {
		this.plateformname = plateformname;
	}

	public String getDeliveryaddress() {
		return deliveryaddress;
	}

	public void setDeliveryaddress(String deliveryaddress) {
		this.deliveryaddress = deliveryaddress;
	}

	public String getPaymentmethod() {
		return paymentmethod;
	}

	public void setPaymentmethod(String paymentmethod) {
		this.paymentmethod = paymentmethod;
	}

	@Override
	public String toString() {
		return "OrderDetailDTO [orderid=" + orderid + ", productid=" + productid + ", userName=" + userName
				+ ", orderdate=" + orderdate + ", deliverydate=" + deliverydate + ", quantity=" + quantity
				+ ", plateformname=" + plateformname + ", deliveryaddress=" + deliveryaddress + ", paymentmethod="
				+ paymentmethod + "]";
	}

}
