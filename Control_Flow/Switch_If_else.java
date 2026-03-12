package program.control_flow;

public class Switch_If_else {
	public static void main(String[] args) {
//		System.out.println("Write a Java program using switch case to check whether a character is");
//		Uppercase
//
//		Lowercase
//		char ch='a';
//
//		
//		if (Character.isLetter(ch)) {
//            switch (Character.toLowerCase(ch)) {
//            case 'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z':
//            	System.out.println("charater in lower case");
//            if (Character.isUpperCase(ch)) {
//                System.out.println("The character '" + ch + "' is an uppercase letter.");
//            } else {
//                System.out.println("The character '" + ch + "' is a lowercase letter.");
//            }
//            break;
//            }
//} else {
//    System.out.println("The input is not a letter of the alphabet.");
//}
//		System.out.println("Write a Java program using switch case to check whether the day number represents");
//		1–5 → Weekday
//		6–7 → Weekend
//		int day_Number=7;
//		switch(day_Number) {
//		case 1,2,3,4,5:
//			System.out.println("weekday");
//		break;
//		case 6,7:
//			System.out.println("weekend");
//		break;
//		default:
//			System.out.println("invalid input");
//		}
//		System.out.println("Write a Java program using switch case to print operation name");
//		int num1 = 40;
//		int num2 = 30;
//		String oparation = "add";
//		switch (oparation) {
//		case "add":
//			int sum = num1 + num2;
//			System.out.println("addtion " + num1 + "+" + num2 + "=" + sum);
//			break;
//		case "sub":
//			int sub = num1 - num2;
//			System.out.println("sub " + num1 + "-" + num2 + "=" + sub);
//			break;
//		case "multi":
//			int multi = num1 * num2;
//			System.out.println("multipalation " + num1 + "*" + num2 + "=" + multi);
//			break;
//		case "div":
//			int div = num1 / num2;
//			System.out.println("didvision " + num1 + "/" + num2 + "=" + div);
//			break;
//		case "mod":
//			int mod = num1 % num2;
//			System.out.println("mod " + num1 + "%" + num2 + "=" + mod);
//			break;
//	default:
//		System.out.println("wrong opation");

//		}
//		System.out.println("Write a Java program using switch case to display price of fruits");
//		1 → Apple ₹100
//		2 → Mango ₹80
//		3 → Banana ₹40
//		4 → Orange ₹60
//		int apple;
//		int mango;
//		int banana;
//		int orange;
//		String fruits = "apple";
//		switch (fruits) {
//		case "apple":
//			 apple=100;
//			System.out.println("the prise of apple ="+apple+" rs");
//			break;
//		case "mango":
//			 mango=80;
//			System.out.println("the prise of mango ="+mango+" rs");
//			break;
//		case "banana":
//			 banana=40;
//			System.out.println("the prise of banana ="+banana+" rs");
//			break;
//		case "orange":
//			 orange=60;
//			System.out.println("the prise of orange ="+orange+" rs");
//			break;
//			
//
//		}
//		System.out.println("Write a Java program using switch case to display greeting message");
//		1 → English → Hello
//		2 → Hindi → Namaste
//		3 → Marathi → Namaskar
//		int choose = 1;
//		String english;
//		String hindi;
//		String marathi;
//		switch (choose) {
//		case 1:
//			english = "hello";
//			System.out.println("english " + english);
//			break;
//		case 2:
//			hindi = "namaste";
//			System.out.println("hindi " + hindi);
//			break;
//		case 3:
//			marathi = "marathi";
//			System.out.println("marathi " + marathi);
//			break;
//		default:
//			System.out.println("invalid input");
//
//		}
//		System.out.println("Write a Java program using switch case");
//		Input: Grade letter
//		A → Distinction
//		B → First Class
//		C → Second Class
//		D → Pass
//		F → Fail
//		char grade = 'A';
//		switch (grade) {
//
//		case 'A':
//			System.out.println("distinction");
//			break;
//		case 'B':
//			System.out.println("first class");
//			break;
//		case 'C':
//			System.out.println("second class");
//			break;
//		case 'D':
//			System.out.println("pass");
//			break;
//		case 'F':
//			System.out.println("Fail  ");
//			break;
//		default:
//			System.out.println("Invalid Input");
//		}
//		System.out.println("Write a Java program using switch case to print season.");
//		Example:
//			Dec–Feb → Winter
//			Mar–May → Summer
//			Jun–Sep → Monsoon
//			Oct–Nov → Autumn
//		String month="jan";
//		switch (month) {
//		case "dec","jan","feb":
//			System.out.println("winter season");
//			break;
//		case "mar","apr","may":
//			System.out.println("summer season");
//			break;
//		case "jun","jul","aug","sep":
//			System.out.println("mansson season");
//			break;
//		case "oct","nov":
//			System.out.println("autum season");
//			break;
//			
//		}
//		System.out.println("Write a Java program using switch case.");
//		
//		System.out.println("ATM Menu Program");
//		1 → Check Balance
//		2 → Withdraw
//		3 → Deposit
//		4 → Exit
//		double amount = 100;
//		double withdraw = 45;
//		double deposit = 49;
//		double total_Amount;
//		int chooise = 2;
//		switch (chooise) {
//		case 1:
//			System.out.println("chek the balance " + amount);
//
//			break;
//		case 2:
//			System.out.println("amount deposite " + deposit);
//			total_Amount = amount + deposit;
//			System.out.println("after deposite amount= " + total_Amount);
//
//			break;
//		case 3:
//			System.out.println("amount withdraw " + withdraw);
//			total_Amount = amount + withdraw;
//			System.out.println("after withdraw amount= " + total_Amount);
//			break;
//		case 4:
//			System.out.println("exit");
//			break;
//		default:
//			System.out.println("invalid input");
//
//		}
//		System.out.println("Simple Food Menu");
//		int food_Menu = 1;
//		switch (food_Menu) {
//		case 1:
//		System.out.println("pizaa");
//		break;
//	case 2:
//		System.out.println("burger");
//		break;
//	case 3:
//		System.out.println("sandwich");
//		break;
//	case 4:
//		System.out.println("pasta");
//      default:
//    	  System.out.println("invalid input");
//	}
//		System.out.println(" Area of Shapes");
//		1 → Circle
//		2 → Rectangle
//		3 → Square
//		int r=3;
//		int r1=7;
//		double pi=3.14;
//		int l=10;
//		int w=5;
//		int a=7;
//		double area;
//		int chooise=3;
//		switch(chooise) {
//		case 1: //circle
//			 area=pi*r*r1;
//			System.out.println("area of circle "+area);
//			break;
//		case 2: //rectangle
//			 area=l*w;
//			 System.out.println("area of rectangle "+area);
//			 break;
//		case 3: // square
//			area=a*a;
//			System.out.println("area of squre "+area);
//			break;
//			default:
//				System.out.println(" invalide chooise");
//		
//		}
//		System.out.println("Check Number Range");
//		0–3 → Low
//		4–7 → Medium
//		8–10 → High
//		int num=110;
//		int range=num/10;
//		switch(range) {
//		case 0,1,2,3:
//			System.out.println("low range");
//		break;
//		
//		case 4,5,6,7:
//			System.out.println("medium range");
//		break;
//		case 8,9,10:
//			System.out.println("High range");
//		break;
//		default:
//			System.out.println(" out of the range");
//		
//		
//		}
//		System.out.println("Company Department");
//		1 → HR
//		2 → Finance
//		3 → IT
//		4 → Marketing
//		int department_Number=1;
//		switch(department_Number) {
//		case 1:
//			System.out.println("computer HR department");
//			break;
//		case 2:
//			System.out.println("Finance department");
//			break;
//		case 3:
//			System.out.println("IT department");
//			break;
//		case 4:
//			System.out.println("Marketing department");
//			break;
//			default:
//				System.out.println("invalid input");
//			
//		
//		}
//		System.out.println("Vehicle Type");
//		1 → Bike
//		2 → Car
//		3 → Bus
//		4 → Truck
//		int vechicle_Number=1;
//		switch(vechicle_Number) {
//		case 1:
//			System.out.println("bike");
//			break;
//		case 2:
//			System.out.println("car");
//			break;
//			
//		case 3:
//			System.out.println("bus");
//			break;
//			
//		case 4:
//			System.out.println("truck");
//			break;
//			
//
//			
//		
//		}
//		System.out.println(" Check Password Strength Level");
//		1 → Weak Password
//		2 → Medium Password
//		3 → Strong Password
//		String password;
//		int level=1;
//		switch(level) {
//		case 1:
//			password="12345678";
//			System.out.println("weak password "+password);
//			break;
//		case 2:
//			password="1abc345d";
//			System.out.println("medium password "+password);
//			break;
//		case 3:
//			password="abdrt456";
//			System.out.println("strong password "+password);
//			break;
		// default:
		// 	System.out.println(somting is worng);
//			
//			
//		
//		}
		


		
		}

}

