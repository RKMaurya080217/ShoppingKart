package com.shoppingkart.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.shoppingkart.dto.PersonDetailDTO;

public class PersonCRUDDAO {

	private String insert = "INSERT INTO persondetails (username, password, name, dob, contactno, address) VALUES (?, ?, ?, ?, ?, ?)";
	private String fetch = "SELECT * FROM persondetails";
	private String update;
	private String childdelete;
	private String parantdelete;
	private int rowsAffected = 0;
	PreparedStatement pstmt;
	List<PersonDetailDTO> person;
	private PersonDetailDTO personfetch;

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

	public List<PersonDetailDTO> getAllTasks() {

		person = new ArrayList<>();

		try {
			pstmt = DataBaseConnection.getConnection().prepareStatement(fetch);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				personfetch = new PersonDetailDTO();
				// String pass = PasswordEncryption.encryptPassword(rs.getString("password"));
				personfetch.setName(rs.getString("name"));
				personfetch.setUserName(rs.getString("username"));
				personfetch.setPassword(rs.getString("password"));
				personfetch.setDob(rs.getString("dob"));
				personfetch.setContact(rs.getString("contactno"));
				personfetch.setAddress(rs.getString("address"));

				person.add(personfetch);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return person;
	}

	public PersonDetailDTO updatePerson(String username, PersonDetailDTO persondto) {
		persondto.setUserName(username);
		update = "UPDATE persondetails SET name = '" + persondto.getName() + "', password = '" + persondto.getPassword()
				+ "', dob = '" + persondto.getDob() + "', contactno = '" + persondto.getContact() + "', address = '"
				+ persondto.getAddress() + "' WHERE username = '" + username + "'";
		try {
			pstmt = DataBaseConnection.getConnection().prepareStatement(update);

			rowsAffected = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		if (rowsAffected > 0) {
			return persondto;
		} else {
			return null;
		}
	}

	public boolean deletePerson(String username) {

		childdelete = "DELETE FROM  orderdetails WHERE username= '" + username + "'";
		parantdelete = "DELETE FROM  persondetails WHERE username= '" + username + "'";
		try {
			pstmt = DataBaseConnection.getConnection().prepareStatement(childdelete);
			rowsAffected = pstmt.executeUpdate();
			pstmt = DataBaseConnection.getConnection().prepareStatement(parantdelete);
			rowsAffected = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		if (rowsAffected > 0) {
			return true;
		} else {
			return false;
		}
	}
}
