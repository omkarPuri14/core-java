package com.abstracclass;

public class MiniRide extends Ride{

	@Override
	void calculateFare(double distance) {
		System.out.println("mini ride ");
		System.out.println("distance "+distance+" Km");
		if(distance<=10) {
			rate_pk=25;
			System.out.println("fare rate for mini ride is "+rate_pk);
			double fare=distance*rate_pk;
			System.out.println("fare for this ride is "+fare);
		}else {
			System.out.println("your not eligble for mini ride");
			System.out.println("eligblity for mini ride is less than 10km or 10km ");
			
		}
		
	}
	

}
