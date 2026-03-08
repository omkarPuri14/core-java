package program.control_flow;

public class Nested_If_else {

	public static void main(String[] args) {

//		System.out.println("Write a program to check if a character is uppercase.");

//		char spical_Symbole='l';
//		
//		if(Character.isUpperCase(spical_Symbole)) {
//			System.out.println(spical_Symbole+"  character in upeercase");
//		} else {
//			System.out.println(spical_Symbole+ " character in lower case ");
//		}

//		System.out.println("Write a program to check if a person is eligible for voting (age >= 18)");
//		System.out.println();
//		int voter_Age=34;
//		String voter_Name="omkar";
//		
//		
//		if(voter_Age>=19&&voter_Age<=120) {
//			
//			System.out.println(voter_Name+"  is eligible for voting");
//		}else {
//			
//			System.out.println(voter_Name+"  is not eligible for voting");
//		}
//		System.out.println("Write a program to check whether a character is vowel or consonant.");
//		
//		char ch='c';
//		if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))//check the value is alphabet or character
//		{
//			if((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')||(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')) {
//				System.out.println(ch+" is an vowel");
//				
//			}else {
//				System.out.println(ch+" it is an consonant");
//			}
//			
//		}else {
//			System.out.println(ch+" it is an alphabet");
//		}
//		System.out.println("Write a program to check whether a number is divisible by 2 ");
//		System.out.println();
//		 int num1=56;
//		 if(num1%2==0) {
//			 System.out.println(num1+" is divisible by 2");
//		 }else {
//			 System.out.println(num1+" is not divisible by 2");
//		 }
//		 
//		System.out.println("Write a program to find the largest among three numbers");
//		System.out.println();
//		int num1=34;
//		int num2=67;
//		int num3=45;
//		
//		if(num1>num2&&num1>num3) {
//			System.out.println(num1+" is largest among three numbers");
//			
//			
//		}else if(num2>num1&&num2>num3) {
//			System.out.println(num2+" is largest among three numbers");
//			
//		}else {
//			System.out.println(num3+" is largest among three numbers");
//		}
//		System.out.println("Write a program to display grade based on marks");
//		
//		int marks=101;
//		
//		if(marks>=75&&marks<=100) {
//			System.out.println("stdudent pass with Distinction grade");
//			
//		}else if(marks>=60&&marks<75) {
//			System.out.println("student pass with First Class grade");
//			
//		}else if(marks>=50&&marks<60) {
//			System.out.println("student pass with second Class grade");
//			
//		}else if (marks>=35&&marks<50) {
//			System.out.println("student get  pass ");
//			
//		}else {
//			System.out.println("student get fail");
//		}
//		
//		System.out.println("Write a program to display day name based on day number (1–7)");
//		int day_Number = 7;
//
//		if (day_Number == 1) {
//			System.out.println("Monday");
//
//		} else if (day_Number == 2) {
//			System.out.println("Tuesday");
//
//		} else if (day_Number == 3) {
//
//			System.out.println("Wednesday");
//
//		} else if (day_Number == 4) {
//
//			System.out.println("Thursday");
//		} else if (day_Number == 5) {
//
//			System.out.println("Friday");
//
//		} else if (day_Number == 6) {
//
//			System.out.println("Saturday");
//
//		} else if (day_Number == 7) {
//
//			System.out.println("Sunday");
//
//		} else {
//
//			System.out.println("invalid input");
//		}
//		System.out.println("Write a program to calculate electricity bill based on units");

//		0–100 → ₹5 per unit
//		101–200 → ₹7 per unit
//		Above 200 → ₹10 per unit

//		int units=102;
//		
//		if(units>=0&&units<=100) {
//			int bill=units*5;
//			
//            System.out.println(units+" units the light bill is "+bill);
//		}else if (units>100&&units<=200) {
//			
//			int bill=100*5+(units-100)*7;
//			
//			System.out.println(units+ " units  the light bill is "+bill);
//			
//		}else if(units>200) {
//			
//			int bill=100*5+100*7+(units-200)*10;
//			
//			System.out.println(units+ " units  the light bill is "+bill);
//		}
//		System.out.println("Write a program to check whether a number is positive and even");
//
//		int num1 = 12;
//
//		if (num1 > 0) {
//			System.out.println(num1 + " number is positive");
//			if (num1 % 2 == 0) {
//				System.out.println(num1 + " number is even");
//
//			} else {
//				System.out.println(num1 + " is odd number");
//			}
//		} else if (num1 < 0) {
//			System.out.println(num1 + " number is negetive");
//		} else if (num1 == 0) {
//			System.out.println(num1 + " is zero");
//		} else {
//			System.out.println(num1 + " invalid input ");
//		}
//		System.out.println("Write a program to check whether a person is eligible for a loan");
//		Conditions :
//		Age ≥ 21
//		Salary ≥ 25000

//		int age = 21;
//		int salary = 25000;
//
//		if (age >= 18 && age < 120) {
//			System.out.println("youer eligible for next process");
//			if (salary >= 25000) {
//
//				System.out.println("you are eligible for lone");
//
//			} else {
//
//				System.out.println(salary + " insufficient salary for lone");
//			}
//		} else {
//			System.out.println("required age is 18 or 18+ and below 120");
//		}
//		System.out.println("Write a program to check login authentication (username and password).");
//
//		String user_Name = "omkar_234";
//		long mobile_No = 4536453423l;
//		String mail_Id = "omkar@123.com";
//		int password = 34256;
//		if (user_Name == "omkar_234" || mobile_No == 4536453423l || mail_Id == "omkar@123.com") {
//
//			System.out.println("correct iformation ");
//
//			if (password == 34256) {
//				System.out.println("your loging successfully ");
//			} else {
//				System.out.println("wrong password");
//			}
//
//		} else {
//			System.out.println("invalide input");
//		}

//		int year = 2024; // You can change this value to test different years
//
//		boolean isLeapYear;
//		
//		if (year % 4 == 0) {
//			if (year % 100 == 0) {
//				if (year % 400 == 0) {
//					isLeapYear = true;
//				} else {
//					isLeapYear = false;
//				}
//			} else {
//				isLeapYear = true;
//			}
//		} else {
//			isLeapYear = false;
//		}
//
//		if (isLeapYear) {
//			System.out.println(year + " is a leap year.");
//		} else {
//			System.out.println(year + " is not a leap year.");
//		}

//		System.out.println("Write a program to check whether a number is divisible by both 3 and 5");
//		
//		int num1=45;
//		 if(num1%3==0&&num1%5==0) {
//			System.out.println(num1+" is divisible by both 3 and 5");
//		
//		 }else if (num1%3==0){
//			 System.out.println("number is only divisible by 3");
//			 
//			 
//		 }else if (num1%5==0){
//			 System.out.println("number is only divisible by 5");
//			 
//		 }else {
//			 System.out.println("number not dividible by both 3 and 5");
//		 }
//
	}
}
