package com.shoppingkart.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.shoppingkart.dto.ProductDetailDTO;

public class ProductCRUDDAO {
	
	private String insert = "INSERT INTO productdetails (id, name, price, quantity, plateformname, category, warantee) VALUES (?, ?, ?, ?, ?, ?,?)";
	private int rowsAffected = 0;
	PreparedStatement pstmt;

	public ProductDetailDTO addProduct(ProductDetailDTO productdto) {
		try {
			pstmt = DataBaseConnection.getConnection().prepareStatement(insert);

			pstmt.setInt(1, productdto.getId());
			pstmt.setString(2, productdto.getName());
			pstmt.setInt(3, productdto.getPrice());
			pstmt.setInt(4, productdto.getQuantity());
			pstmt.setString(5, productdto.getPlateformName());
			pstmt.setString(6, productdto.getCategory());
			pstmt.setString(7, productdto.getWarantee());

			rowsAffected = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		if (rowsAffected > 0) {
			System.out.println(productdto.getName() + " added successfully!");
			return productdto;
		} else {
			System.out.println(productdto.getName() + " Failed to add.");
			return null;
		}
	}

}
