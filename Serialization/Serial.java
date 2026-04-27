package com.serile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class Serial {
	
	public static void main(String[] args) throws Exception {
		Emp_Info emp=new Emp_Info(24, "omkar", "bhosari");
		FileOutputStream file=new FileOutputStream("C:\\workspace\\1320 java batch\\Beyt.code.text");
		ObjectOutputStream ob=new ObjectOutputStream(file);
		ob.writeObject(emp);
		file.close();
		ob.close();

		System.out.println("file created SuccessFully ... !");

	}

}
