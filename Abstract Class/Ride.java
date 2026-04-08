package com.abstracclass;

public abstract class Ride{
	double rate_pk;
	
	
	abstract void calculateFare(double distance);
	
	void startRide(String Staring_point,String point) {
		
		System.out.println("Start point of ride "+Staring_point);
		System.out.println("end point of ride "+point);
		
	}
}
