package program.control_flow;

public class Pratice_Section {
	public static void main(String args[]) {

		// 1) write a program using switch casev with do whilw loop.
		// print number 1-10
//		int i=1;
//		do {
//			if(i>10) {
//				System.out.println("exit");
//			}
//			switch(i) {
//			case 1:
//				System.out.println(i);
//				break;
//			case 2:
//				System.out.println(i);
//				break;
//			case 3:
//				System.out.println(i);
//				break;
//			case 4:
//				System.out.println(i);
//				break;
//			case 5:
//				System.out.println(i);
//				break;
//			case 6:
//				System.out.println(i);
//				break;
//			case 7:
//				System.out.println(i);
//				break;
//			case 8:
//				System.out.println(i);
//				break;
//			case 9:
//				System.out.println(i);
//				break;
//			case 10:
//				System.out.println(i);
//				break;
//				
//				
//			}
//			i++;
//		
//			
//		}while(i<=11);
		
		// print even number
//		int i=1;
//		
//		
//		do {
//			
//			
//			switch(i%2) {
//			case 0:
//				System.out.println(i+ " is even no");
//				break;
//				
//			
//			}
//			
//		  i++;	
//		}while(i<=50);
//		 int i=1;
//		 do {
//			 switch(i%2) {
//			 case 1:
//				 System.out.println(i);
//				 break;
//				 default:
//					 System.out.println("exit");
//			 
//			 }
//		 }while(i<=50);
		// 2)write a program sum of digite
		
//		int i=1;
//		int sum=0;
//		while(i<=10) {
//			sum=sum+i;
//			i++;
//						
//			
//			}
//		System.out.println(sum)

// 3) write a programusing while loopto print 10to 1
//int i=10;
//while(i>=1) {
//	System.out.println(i);
//	i--;
//}
		
		
// 4) month using switch name of month
//		int month_Number=7;
//		switch(month_Number) {
//		case 1:
//			System.out.println("jan");
//			break;
//		case 2:
//			System.out.println("feb");
//			break;
//		case 3:
//			System.out.println("mar");
//			break;
//		case 4:
//			System.out.println("apr");
//			break;
//		case 5:
//			System.out.println("may");
//			break;
//		case 6:
//			System.out.println("jun");
//			break;
//		case 7:
//			System.out.println("jul");
//			break;
//		case 8:
//			System.out.println("aug");
//			break;
//		case 9:
//			System.out.println("sep");
//			break;
//		case 10:
//			System.out.println("oct");
//			break;
//		case 11:
//			System.out.println("nov");
//			break;
//		case 12:
//			System.out.println("dec");
//			break;
//			
//			
//			
//		
//		}
//		
//		
// 5) eligible for voting 
//		
//		int age=23;
//		if(age>=18) {
//			System.out.println("eligible for voting");
//		}else {
//			System.out.println("not eligible for voting");
//		}
//		
//		
//
// 6) leap year
//		int year=2000;
//		if((year%4==0&&year%100!=0)||year%400==0) {
//			System.out.println("leap year");
//			
//		}else {
//			System.out.println("not a leap year");
//		}
		
// 7) fact using while loop

//		int i=1;
//		int fact =1;
//		while(i<=10) {
//			 fact=fact*i;
//			 System.out.println(i+" fact is "+fact);
//				
//			i++;
//			
//		}
//		
// 8)A to Z usong
		
//		for(char i='A';i<='Z';i++) {
//			System.out.println(i);
//			
//		}
		
		
// 9) using while loop to reverse a number
//		int number = 12345; // The fixed number to reverse
//        int reversedNumber = 0;
//        int originalNumber = number; // Store the original for printing
//
//        // Use a while loop to reverse the number
//        while (number != 0) {
//            int remainder = number % 10; // Get the last digit
//            reversedNumber = reversedNumber * 10 + remainder; // Build the reversed number
//            number = number / 10; // Remove the last digit
//        }
//
//        System.out.println("Original Number: " + originalNumber);
//        System.out.println("Reversed Number: " + reversedNumber);
        
        // USING while loop to count number of digites in number
//		int number =12345;
//		int count_no=0;
//
//		if(number==0) {
//			count_no++;
//		}else {
//		while(number!=0) {
//			number=number/10;
//			count_no++;
//			
//			
//		}
//		    System.out.println("The number of digits is: " + count_no);
//		
//		}
    
		}
}
