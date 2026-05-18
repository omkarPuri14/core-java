package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Custmore {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1320","root","root");
	    Statement s=  c.createStatement();
	    int a=  s.executeUpdate("insert into custmore (id,name,age,city)values(1,'omkar',21,'pune')");
	    
	    if(a>0) {
	    	System.out.println("insert");
	    	
	    }else {
	    	System.out.println("not");
	    }
	    
	}

}
