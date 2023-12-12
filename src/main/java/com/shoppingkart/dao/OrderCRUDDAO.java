package com.shoppingkart.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.shoppingkart.dto.OrderDetailDTO;

public class OrderCRUDDAO {
	private String insert = "INSERT INTO orderdetails (orderid, username, productid, orderdate, deliverydate, quantity, deliveryaddress, paymentmethod, plateformname) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
	private int rowsAffected = 0;
	PreparedStatement pstmt;

	public OrderDetailDTO addOrder(OrderDetailDTO orderdto) {
		try {
			boolean personstatus = false;
			String personsql = "SELECT 1 FROM persondetails where username = ?";
			pstmt = DataBaseConnection.getConnection().prepareStatement(personsql);
			pstmt.setString(1, orderdto.getUsername());
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				//System.out.println("User is exist");
				personstatus = true;
			}

		} catch (SQLException e) {
			e.printStackTrace();

		}
		try {
			boolean productstatus = false;
			String productsql = "SELECT 1 FROM productdetails where id = ?";
			pstmt = DataBaseConnection.getConnection().prepareStatement(productsql);
			pstmt.setInt(1, orderdto.getProductid());
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				productstatus = true;
			}

		} catch (SQLException e) {
			e.printStackTrace();

		}

		try {
			pstmt = DataBaseConnection.getConnection().prepareStatement(insert);

			pstmt.setInt(1, orderdto.getOrderid());
			pstmt.setString(2, orderdto.getUsername());
			pstmt.setInt(3, orderdto.getProductid());
			pstmt.setString(4, orderdto.getOrderdate());
			pstmt.setString(5, orderdto.getDeliverydate());
			pstmt.setInt(6, orderdto.getQuantity());
			pstmt.setString(7, orderdto.getDeliveryaddress());
			pstmt.setString(8, orderdto.getPaymentmethod());
			pstmt.setString(9, orderdto.getPlateformname());
			rowsAffected = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		if (rowsAffected > 0) {
			System.out.println(orderdto.getOrderid() + " product added successfully in your kart!");
			return orderdto;
		} else {
			System.out.println(orderdto.getOrderid() + " product Failed to add in your kart.");
			return null;
		}
	}

}
