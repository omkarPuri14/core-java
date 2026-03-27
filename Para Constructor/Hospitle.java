package com.construcror;

public class Hospitle {
	 String hospitalName;
	 String address;
	 int maxPatientCapacity;
     int currentPatients;
	 int staffCount;
	 
	 public Hospitle(String hospitalName,String address,int maxPatientCapacity,int currentPatients,int staffCount) {
		 this.hospitalName=hospitalName;
		 this.address=address;
		 this.maxPatientCapacity=maxPatientCapacity;
		 this.currentPatients=currentPatients;
		 this.staffCount=staffCount;
		 
	 }
	 
	 public void display() {
		 System.out.println("--- Hospital Management System ---");
			System.out.println("Hospital Name: " + hospitalName);
			System.out.println("Address: " + address);
			System.out.println("Max Capacity: " + maxPatientCapacity);
			System.out.println("Current Patients: " + currentPatients);
			System.out.println("Staff Count: " + staffCount);
			
	 }
	
}
