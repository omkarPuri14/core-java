package com.serile;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserial {
	public static void main(String[] args) throws Exception {

		FileInputStream file = new FileInputStream("C:\\workspace\\1320 java batch\\Beyt.code.text");
		ObjectInputStream os = new ObjectInputStream(file);

		Emp_Info emp = (Emp_Info) os.readObject();

		System.out.println(emp.id + "   " + emp.name + "  " + emp.location);

		os.close();
		file.close();

	}

}
