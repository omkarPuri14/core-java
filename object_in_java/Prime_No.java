package com.methode;

public class Prime_No {
	
	int num;
	
	public void prime() {
		int count=0;
		if(num<2) {
			System.out.println(num+" not a prime no");
		}
		for(int i=2;i*i<=num;i++) {
			
			if(num%i==0) {
				count++;
				break;
			}		
		}
		if(count==0) {
			System.out.println(num+ " is prime no ");
		}else {
			System.out.println(num+" is not prime no");
		}
	}

}
