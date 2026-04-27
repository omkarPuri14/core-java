package com.serile;

import java.io.Serializable;

public class Emp_Info implements Serializable {
	int id;
	String name;
	String location;
	public Emp_Info(int id,String name,String location) {
		
		this.id=id;
		this.name=name;
		this.location=location;
		
	}

}
