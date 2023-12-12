package com.shoppingkart.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.shoppingkart.dto.PersonDetailDTO;

public class PersonCRUDDAO {

	private String insert = "INSERT INTO persondetails (username, password, name, dob, contactno, address) VALUES (?, ?, ?, ?, ?, ?)";
	private int rowsAffected = 0;
	PreparedStatement pstmt;

	public PersonDetailDTO addPerson(PersonDetailDTO persondto) {
		try {
			pstmt = DataBaseConnection.getConnection().prepareStatement(insert);

			pstmt.setString(1, persondto.getUserName());
			pstmt.setString(2, persondto.getPassword());
			pstmt.setString(3, persondto.getName());
			pstmt.setString(4, persondto.getDob());
			pstmt.setString(5, persondto.getContact());
			pstmt.setString(6, persondto.getAddress());

			rowsAffected = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		if (rowsAffected > 0) {
			System.out.println(persondto.getName() + " added successfully!");
			return persondto;
		} else {
			System.out.println(persondto.getName() + " Failed to add.");
			return null;
		}
	}

}
