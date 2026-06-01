package com.day4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class CustomerDao {

	public void insertData(Custmore cu) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1320", "root", "root");
		PreparedStatement ps = c.prepareStatement(
				"insert into custmore(cust_Id,name,email,phone_No,city,age,adharNO,purchases,payAmmount,remaingAmmount)values(?,?,?,?,?,?,?,?,?,?)");
		ps.setInt(1, cu.getCust_ID());
		ps.setString(2, cu.getName());
		ps.setString(3, cu.getEmail());
		ps.setLong(4, cu.getPhone_No());
		ps.setString(5, cu.getCity());
		ps.setInt(6, cu.getAge());
		ps.setLong(7, cu.getAdharNo());
		ps.setInt(8, cu.getPurchase());
		ps.setInt(9, cu.getPayAmmount());
		ps.setInt(10, cu.getRemaingAmmount());

		int a = ps.executeUpdate();

		if (a > 0) {
			System.out.println("inseretd");

		} else {
			System.out.println("not inseretd");
		}

		c.close();

	}

	public void updateData(Custmore cu) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1320", "root", "root");
		PreparedStatement ps = c.prepareStatement("update  custmore set name=? where cust_Id=?");

		ps.setString(1, cu.getName());
		ps.setInt(2, cu.getCust_ID());

		int a = ps.executeUpdate();

		if (a > 0) {
			System.out.println("update");

		} else {
			System.out.println("not update");
		}

		c.close();

	}
	
	public void delecetData(Custmore cu) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1320", "root", "root");
		PreparedStatement ps = c.prepareStatement("delete from custmore where cust_Id=?");

		
		ps.setInt(1, cu.getCust_ID());

		int a = ps.executeUpdate();

		if (a > 0) {
			System.out.println("deleted");

		} else {
			System.out.println("not deleted");
		}

		c.close();

	}

}
