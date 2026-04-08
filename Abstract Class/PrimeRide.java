package com.abstracclass;

public class PrimeRide extends Ride{
	
	@Override
	void calculateFare(double distance) {
		System.out.println("Prime ride ");

		System.out.println("distance "+distance+" Km");
		if(distance>10) {
			rate_pk=20;
			System.out.println("fare rate for Prime ride is "+rate_pk);
			double fare=distance*rate_pk;
			System.out.println("fare for this ride is "+fare);
		}else {
			System.out.println("plese choose mini ride");
		}
		
	}

}
