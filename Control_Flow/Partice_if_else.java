package program.control_flow;

public class Partice_if_else {
	public static void main(String args[]) {
//	System.out.println("Write a program that checks if a person’s age is greater than 18, then print Adult");
//	int age=19;
//	if(age>18) {
//		System.out.println(" age is greater than 18");
//	}else {
//		System.out.println(" age is less than 18");
//	}
//	System.out.println("Write program to check whether a number is divisible by 10");
//	int num1=20;
//	if(num1%10==0) {
//		System.out.println("number is divisible by 10");
//	}else{
//		System.out.println("number is not divisible by 10");
//	}
//	System.out.println("Write a program to check whether a temperature is above 30°C, then print Hot Day");
//	double temperature=32.56;
//	if (temperature>30) {
//		System.out.println(" hot day");
//	}else {
//		System.out.println("cool day");
//	}
//		System.out.println("Write a program to check whether a number is even or odd");
//		int num1=46;
//		if(num1%2==0&&num1!=0) {
//			System.out.println("number is even");
//		}else if(num1%2!=0) {
//			System.out.println("number is odd");
//			
//		}else if (num1==0) {
//			System.out.println("number is zero");
//		}else {
//			System.out.println("invalid input");
//		}
//	System.out.println("Write a program to check whether a given year is leap year or not");
//	int year=2100;
//	if((year%4==0&&year%100!=0)||year%400==0) {
//		System.out.println(year+" leap year");
//	}else {
//		System.out.println("not a leap year");
//	}
//		System.out.println("Write a program to check whether a number is positive or negative.");
//		int num1 = -6;
//		if (num1 > 0) {
//			System.out.println("number is positive");
//		} else if (num1 < 0) {
//			System.out.println("number is negative");
//		} else if (num1 == 0) {
//			System.out.println("number is zero");
//
//		} else {
//			System.out.println("invalid input");
//		}
//		System.out.println("Write a program to find grade of a student based  on marks:");
//			90–100 → Grade A
//			75–89 → Grade B
//			50–74 → Grade C
//			35–49 → Grade D
//			Below 35 → Fail
//		int mark=9;
//		if(mark>=90&&mark<=100) {
//			System.out.println("student pass with A grade");
//			
//		}else if(mark>=75&&mark<=89) {
//			System.out.println("student pass with B grade");
//		
//	}else if(mark>=50&&mark<=74){
//		System.out.println("studentb pass with C grade");
//	}else if(mark>=35&&mark<=49){
//		System.out.println("student pass with D grade");
//	}else if(mark<35){
//		System.out.println("student got fail");
//	}else {
//		System.out.println("invalid input");
//	}
//		System.out.println("Write a program to print the day of the week based on day number (1–7)");
//		int day_Number = 5;
//		
//				if (day_Number == 1) {
//					System.out.println("Monday");
//		
//				} else if (day_Number == 2) {
//					System.out.println("Tuesday");
//		
//				} else if (day_Number == 3) {
//		
//					System.out.println("Wednesday");
//		
//				} else if (day_Number == 4) {
//		
//					System.out.println("Thursday");
//				} else if (day_Number == 5) {
//		
//					System.out.println("Friday");
//		
//				} else if (day_Number == 6) {
//		
//					System.out.println("Saturday");
//		
//				} else if (day_Number == 7) {
//		
//					System.out.println("Sunday");
//		
//				} else {
//		
//					System.out.println("invalid input");
//				}
//		System.out.println("Write a program to check the type of triangle (Equilateral, Isosceles, or Scalene).");
//		double angle_A=40;
//		double angle_B=50;
//		double angle_C=90;
//		if(angle_A+angle_B+angle_C==180) {
//		if(angle_A==angle_B&&angle_A==angle_C) {
//			System.out.println("triangle is Equilateral");
//		}else if(angle_A==angle_B||angle_B==angle_C||angle_A==angle_C) {
//			System.out.println("triang isosceles");
//			
//			
//		}else {
//			System.out.println("triangle is scalene");
//			
//		}
//		}else {
//			System.out.println("invalide angles");
//		}
//		System.out.println("Write a program to print a message based on age group");
//		0–12 → Child
//		13–19 → Teenager
//		20–59 → Adult
//		60+ → Senior Citizen
//		int age=34;
//		if(age>0&&age<=120) {
//			if(age>0&&age<=12) {
//				System.out.println("child");
//			}else if(age>12&&age<=19) {
//				System.out.println("teenager");
//			}else if(age>19&&age<=59) {
//				System.out.println("adult");
//			}else {
//				System.out.println("Senior Citizen");
//			}
//		}else {
//			System.out.println("invalid age");
//		}
//		System.out.println("Write a program to classify a temperature as Hot, Warm, Cool, or Cold.");
//		Hot: Above 25°C - 30°C+ (77°F - 86°F+)
//		Warm: 20°C - 25°C (68°F - 77°F)
//		Cool: 10°C - 19°C (50°F - 66°F)
//		Cold: Below 10°C (Below 50°F)
//		double temperature = 25;
//		if (temperature <= 30) {
//			if (temperature > 25 && temperature <= 30) {
//				System.out.println("hot day");
//			} else if (temperature >= 20 && temperature <= 25) {
//				System.out.println("warm day");
//			} else if (temperature >= 19 && temperature <= 10) {
//				System.out.println("cool day");
//			} else if (temperature > 10 && temperature <= 0) {
//				System.out.println("cold day");
//			} else {
//				System.out.println("Freezing(super cold day)");
//			}
//		} else {
//			System.out.println("super hot day");
//		}
//		System.out.println("Write a program to check whether a number is positive, negative, or zero.");
//		int num3 = 7;
//
//		if (num3 > 0) {
//			System.out.println("The given number " + num3 + " is Positive");
//		} else if (num3 < 0) {
//			System.out.println("The given number " + num3 + " is Negative");
//		} else if(num3==0) {
//			System.out.println("The given number " + num3 + " is Zero (neither positive nor negative)");
//		}else {
//			System.out.println("invalid input");
//		}
//		System.out.println("Write a program to check if a person is eligible to vote, and if eligible, check if they can contest in elections (age ≥ 25).");
//		int age=56;
//		if(age>=18&&age<=120) {
//			System.out.println("your eligible for voting");
//			if(age>=25) {
//				System.out.println("your eligible for contest in election");
//				
//			}else {
//				System.out.println("your not eligible for contest in election");
//			}
//		}else {
//			System.out.println("your not eligible for voting");
//		}
//		System.out.println("Write a program to check if a year is leap year, and if leap, check if it’s a century year");
//		int year=1200;// 1300 ,1400,1500 that number req year%400
//		if((year%4==0&&year%100!=0)||year%400==0) {
//			System.out.println("leap year");
//		}else {
//			System.out.println("not a leap year");
//		}
//		System.out.println("Write a program to check whether a number is even, and if even, check whether it’s greater than 50");
//		int num=2;
//		if(num%2==0) {
//			System.out.println("number is even");
//			if(num>50) {
//				System.out.println("number is greater than 50");
//			}else {
//				System.out.println("number is less than 50");
//			}
//		}else if(num%2!=0) {
//			System.out.println("number is odd");
//		}else if(num==0) {
//			System.out.println("number is 0");
//		}else {
//			System.out.println("invalid numbar");
//		}

	}
	
}
