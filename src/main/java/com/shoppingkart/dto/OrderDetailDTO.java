package com.shoppingkart.dto;

public class OrderDetailDTO {
	private int orderid;
	private int productid;
	private String username;
	private String orderdate;
	private String deliverydate;
	private int quantity;
	private String deliveryaddress;
	private String paymentmethod;
	private String plateformname;

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


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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
		return "OrderDetailDTO [orderid=" + orderid + ", productid=" + productid + ", userName=" + username
				+ ", orderdate=" + orderdate + ", deliverydate=" + deliverydate + ", quantity=" + quantity
				+ ", plateformname=" + plateformname + ", deliveryaddress=" + deliveryaddress + ", paymentmethod="
				+ paymentmethod + "]";
	}

}
