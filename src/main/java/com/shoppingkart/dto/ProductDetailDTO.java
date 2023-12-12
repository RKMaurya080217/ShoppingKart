package com.shoppingkart.dto;

public class ProductDetailDTO {
	private int id;
	private String name;
	private int price;
	private int quantity;
	private String category;
	private String warantee;
	private String plateformName;
	private boolean status;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getWarantee() {
		return warantee;
	}

	public void setWarantee(String warantee) {
		this.warantee = warantee;
	}

	public String getPlateformName() {
		return plateformName;
	}

	public void setPlateformName(String plateformName) {
		this.plateformName = plateformName;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "ProductDetailDTO [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity
				+ ", category=" + category + ", warantee=" + warantee + ", plateformName=" + plateformName + ", status="
				+ status + "]";
	}
}
