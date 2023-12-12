package com.shoppingkart.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.shoppingkart.dto.OrderDetailDTO;
import com.shoppingkart.dto.ProductDetailDTO;

public class OrderCRUDDAO {
	private String insert = "INSERT INTO orderdetails (orderid, username, productid, orderdate, deliverydate, quantity, deliveryaddress, paymentmethod, onlineoffline) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
	private String getproductid = "SELECT id FROM productdetails";
	private int rowsAffected = 0;
	PreparedStatement pstmt;
	ProductDetailDTO productdto;
	private int productid;

	public OrderDetailDTO addOrder(OrderDetailDTO orderdto) {

		try {
			boolean status = false;
			String sql = "SELECT 1 FROM productdetails where id = ?";
			pstmt = DataBaseConnection.getConnection().prepareStatement(sql);
			pstmt.setInt(1, orderdto.getProductid());
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				status = true;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();

		}
		
		try {
			pstmt = DataBaseConnection.getConnection().prepareStatement(getproductid);
			pstmt = DataBaseConnection.getConnection().prepareStatement(insert);

			pstmt.setInt(1, orderdto.getOrderid());
			pstmt.setString(2, orderdto.getUserName());
			pstmt.setInt(3, orderdto.getOrderid());
			pstmt.setString(4, orderdto.getOrderdate());
			pstmt.setString(5, orderdto.getDeliverydate());
			pstmt.setInt(6, orderdto.getQuantity());
			pstmt.setString(7, orderdto.getDeliveryaddress());
			pstmt.setString(8, orderdto.getPaymentmethod());
			pstmt.setString(9, orderdto.getDeliveryaddress());
			rowsAffected = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		if (rowsAffected > 0) {
			System.out.println(orderdto.getOrderid() + " added successfully in your kart!");
			return orderdto;
		} else {
			System.out.println(orderdto.getOrderid() + " Failed to add in your kart.");
			return null;
		}
	}

}
