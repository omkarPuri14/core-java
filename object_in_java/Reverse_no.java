package com.methode;

public class Reverse_no {
	int num;
	int reve_no;

	public void reverse_No() {

		
			while (num != 0) {
				int reminder = num % 10;
				reve_no = reve_no * 10 + reminder;
				num = num / 10;
				

			}
			System.out.println(reve_no);
		}

	
	}


