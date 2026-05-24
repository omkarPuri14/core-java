package com.day3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Student_Dao{
	public void insertdata(Student s) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1320","root","root");
		PreparedStatement pm=c.prepareStatement("insert into student(id,name,city)values(?,?,?)");
		pm.setInt(1,s.getId());
		pm.setString(2, s.getName());
		pm.setString(3, s.getCity());
	int a=	pm.executeUpdate();
	
	if(a>0) {
		System.out.println("insert data");
		
	}else {
		System.out.println("not inserted");
	}
	c.close();
		
	}
	public void updateData(Student s) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1320","root","root");
	PreparedStatement p=	c.prepareStatement("update student set name=?, city=? where id=?");
	
	p.setString(1, s.getName());
	p.setString(2, s.getCity());
	p.setInt(3, s.getId());
	
	int b=p.executeUpdate();
	
	if(b>0) {
		System.out.println("update");
		
		
	}else {
		System.out.println("not update");
	}
	c.close();
		
		
	}
	
	public void deleteData(Student s) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1320", "root", "root");
		PreparedStatement ps = c.prepareStatement("delete from student where id =?");
		ps.setInt(1, s.getId());
		int checked = ps.executeUpdate();

		if (checked > 0) {
			System.out.println("deleted");
		} else {
			System.out.println("NOT deleted");
		}

		c.close();
	}
	
	public void getAllData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1320", "root", "root");
		PreparedStatement ps = c.prepareStatement("select * from student");
		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "   " + rs.getString(3));
		}

		c.close();
	}

	public void getSingleData(Student s) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1320", "root", "root");
		PreparedStatement ps = c.prepareStatement("select * from student where id = ?");
		ps.setInt(1, s.getId());
		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "   " + rs.getString(3));
		}

		c.close();
	}
	
}
