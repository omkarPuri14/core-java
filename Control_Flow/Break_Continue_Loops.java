package program.control_flow;

public class Break_Continue_Loops {
	public static void main(String args[]) {
//		for(int i = 1; i <= 10; i++) {
//		    if(i == 5) {
//		        break;   // loop stops
//		    }
//		    System.out.println(i);
//		}
//		Print numbers from 1 to 50 but stop when number becomes 25.

//		for(int i=1;i<=50;i++) {
//			if(i==25) {
//				break;
//				
//			}
//			System.out.println(i);
//			
//		}
//		Print even numbers from 1 to 100 but stop when you get first odd number.

//		for(int i=1;i<=100;i++) {
//			if(i%2!=0) {
//				System.out.println(i);
//				break;
//				
//			}
//			
//		}
//		Print table of 9 but stop when product becomes more than 50

//		for (int i = 1; i <= 10; i++) {
//
//			if (i * 9 > 50) {
//				break;
//
//			}
//			System.out.println(9 * i);
//
//		}
// Print numbers from 1 to 50 but skip numbers divisible by 7
//		for(int i=1;i<=50;i++) {
//			if(i%7==0) {
//				continue;
//			}
//			System.out.println(i);
//		}
// Print numbers from 1 to 100 but skip numbers ending with digit 5.
//		for(int i=1;i<=100;i++) {
//			if(i%5==0&&i%2!=0) {
//				continue;
//				
//			}
//			System.out.println(i);
//			
//		}
//Print characters from ‘A’ to ‘Z’ but skip vowels.
//		for(char i='A';i<='Z';i++) {
//			if(i=='A'||i=='E'||i=='I'||i=='O'||i=='U') {
//				continue;
//			}
//			System.out.println(i);
//			
//		}
//	Practise Problems : 

//*
//* *
//* * *
//* * * * 
//* * * * *
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("* ");
//				
//			}
//			System.out.println();
//		}

//* * * * *
//* * * *
//* * *
//* *
//*

//		for(int i=1;i<=5;i++) {
//			for(int j=5;j>=i;j--) {
//				System.out.print("* ");
//				
//			}
//			System.out.println();
//		}

//       * * * * *
//		* * * * *
//		* * * * *
//		* * * * *
//		* * * * *
//		for(int i=1;i<=5;i++) {
//			
//			for(int j=5;j>=1;j--) {
//				System.out.print(" *");
//				
//			}
//			System.out.println();
//		}

//		    *
//		   * *
//		  * * *
//		 * * * *
//		* * * * *[5*5]
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j>=i-4;j--) { // (int j=1;j<=5-i;j++) other method
//				System.out.print(" ");
//				
//			}
//			for(int j=1;j<=i;j++) {
//				System.out.print("* ");
//				
//			}
//			
//			System.out.println();
//		}

//		    *
//		   * *
//		  * * *
//		   * *
//		    *

		
//		for (int i = 1; i <= 3; i++) {
//			for (int j = 1; j <= 3 - i; j++) {
//				System.out.print(" ");
//
//			}
//			for (int j = 1; j <= i; j++) {
//				System.out.print("* ");
//
//			}
//
//			System.out.println();
//
//		}
//		for (int i = 2; i >= 1; i--) {
//			for (int j = 1; j <= 3 - i; j++) {
//				System.out.print(" ");
//
//			}
//			for (int j = 1; j <= i; j++) {
//				System.out.print("* ");
//
//			}
//
//			System.out.println();
//
//		}

	}
}
