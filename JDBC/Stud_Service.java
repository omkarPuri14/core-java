package com.day3;

public class Stud_Service {
	
	public void insertData(Student s) throws Exception {
		Student_Dao d=new Student_Dao();
		d.insertdata(s);
	}
	
	public void upDateData(Student s) throws Exception {
		Student_Dao d=new Student_Dao();
		d.updateData(s);
		
	}
	
	public void deletData(Student s) throws Exception {
		Student_Dao d=new Student_Dao();
		d.deleteData(s);
		
	}
	
	public void getAllRecord() throws Exception {
		Student_Dao d=new Student_Dao();
		d.getAllData();
		
	}
	public void getSingle_Record(Student s) throws Exception {
		Student_Dao d=new Student_Dao();
		d.getSingleData(s);
		
	}
	
	
	

}
