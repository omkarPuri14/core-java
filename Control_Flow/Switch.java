package program.control_flow;

public class Switch {
	public static void main(String[] args) {
//		System.out.println("print the day using a number");
//		int day_Number=4;
//		switch (day_Number) {
//        case 1:
//        System.out.println("Monday");
//        break;
//
//        case 2:
//        System.out.println("Tuesday");
//        break;
//
//        case 3:
//        System.out.println("Wednesday");
//        break;
//
//        case 4:
//        System.out.println("Thursday");
//        break;
//
//        case 5:
//        System.out.println("Friday");
//        break;
//
//        case 6:
//        System.out.println("Saturday");
//        break;
//        
//        case 7:
//        System.out.println("Sunday");
//        break;
//        
//        default:
//        System.out.println("Incorrect day.");
//    }
//		System.out.println("Write a program to print the month name using a number");
//		int month_Number=8;
//		switch(month_Number) {
//		case 1:
//			System.out.println("jan");
//			break;
//		case 2:
//			System.out.println("feb");
//			break;
//		case 3:
//			System.out.println("march");
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
//			System.out.println("aot");
//			break;
//		case 11:
//			System.out.println("nov");
//			break;
//		case 12:
//			System.out.println("dec");
//			break;
//			default:
//				System.out.println("invalid input");
//
//			
//		}
//		System.out.println("Create a calculator using switch case for operations");
//		int num1 = 40;
//		int num2 = 30;
//		int tem;
//		char oparation = '%';// +-*/
//		switch (oparation) {
//		case '+':
//			tem = num1 + num2;
//			System.out.println("addtion " + num1 + "+" + num2 + "=" + tem);
//			break;
//		case '-':
//			tem = num1 - num2;
//			System.out.println("sub " + num1 + "-" + num2 + "=" + tem);
//			break;
//		case '*':
//			tem = num1 * num2;
//			System.out.println("multipalation " + num1 + "*" + num2 + "=" + tem);
//			break;
//		case '/':
//			tem = num1 / num2;
//			System.out.println("didvision " + num1 + "/" + num2 + "=" + tem);
//			break;
//		case '%':
//			tem = num1 % num2;
//			System.out.println("mod " + num1 + "%" + num2 + "=" + tem);
//			break;
//		default:
//			System.out.println("wrong opation");
//		}
		// same program with another method which method you suggest
//		System.out.println("Create a calculator using switch case for operations");
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
//
//		}
//		System.out.println("Write a program to check whether a character is a vowel or consonant using switch");
		// vowel=a,e,i,o,u
//		char alphabet='c';
//		if((alphabet>='a'&& alphabet<='z')||(alphabet>='A'&& alphabet<='Z')) {
//		switch((alphabet)) {
//		
//		case 'a','e','i','o','u','A','E','I','O','U':
//			System.out.println("vowel");
//		break;
//		default:
//			System.out.println("consonant");
//		}
//		}else {
//			System.out.println("invalid input");
//		}
//		System.out.println("Write a program to print grade description");
//		A → Excellent
//		B → Good
//		C → Average
//		D → Pass
//		F → Fail
//		int mark=98;
//		switch (mark/10) {
//
//		case 10,9:
//			System.out.println("A grade  Excellent");
//			break;
//		case 8:
//			System.out.println("B grade  Good");
//			break;
//		case 7:
//			System.out.println("C grade  average");
//			break;
//		case 6,5:
//			System.out.println("D grade pass");
//			break;
//		case 4,3,2,1:
//			System.out.println("Fail -> Better Luck Next Time .... ! ");
//			break;
//		default:
//			System.out.println("Invalid Input");
//		}
//		System.out.println("Check if the day is Weekend or Weekday");
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
//		System.out.println(" Area Calculator");
//		Calculate area using switch.
//
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
//		System.out.println("Input language code and print name.");
//		1 → Java
//		2 → Python
//		3 → C++
//		4 → JavaScript
//		int lanuage_Number=1;
//		switch(lanuage_Number) {
//		case 1:
//			System.out.println(" java language");
//			break;
//		case 2:
//			System.out.println(" python language");
//			break;
//		case 3:
//			System.out.println(" c++ language");
//			break;
//		case 4:
//			System.out.println(" java script language");
//			break;
//			default:
//				System.out.println("invalid input");
//		}
//		System.out.println("Student Department");
//		1 → Computer Science
//		2 → Mechanical
//		3 → Civil
//		4 → Electrical
//		int department_Number=1;
//		switch(department_Number) {
//		case 1:
//			System.out.println("computer science department");
//			break;
//		case 2:
//			System.out.println("mechanical department");
//			break;
//		case 3:
//			System.out.println("civil department");
//			break;
//		case 4:
//			System.out.println("electrical department");
//			break;
//			default:
//				System.out.println("invalid input");
//			
//		
//		}
//		System.out.println("Season Finder");
//		12,1,2 → Winter
//		3,4,5 → Summer
//		6,7,8 → Monsoon
//		int chooise=11;
//		switch(chooise) {
//		case 12,1,2:
//			System.out.println("winter season");
//		break;
//		case 3,4,5:
//			System.out.println("summer season");
//		break;
//		case 6,7,8:
//			System.out.println("mansoon season");
//		break;
//		case 9,10,11:
//			System.out.println("spring season");
//		break;
//		default:
//			System.out.println("invalid month");
//			
//		
//		}
//		System.out.println("Create a mobile settings menu.");
//		1 → WiFi
//		2 → Bluetooth
//		3 → Mobile Data
//		4 → Airplane Mode
//		int menu=1;
//		switch(menu) {
//		case 1:
//			System.out.println("wifi opation enable");
//			break;
//		case 2:
//			System.out.println("bluetooth opation enable");
//			break;
//		case 3:
//			System.out.println("mobile data ");
//			break;
//		case 4:
//			System.out.println("airplane mode on");
//			break;
//			default:
//				System.out.println("invalid input");
//			
//			
//		
//		}
//		System.out.println("Check character type.");
//		A-Z → Uppercase
//		a-z → Lowercase
//		0-9 → Digit
//		char alphabet='4'; 
//		switch(alphabet) {
//		case 'A','B','C','D': // so on 'Z'
//			System.out.println("character is in upper case");
//		break;
//		case 'a','b','c','d'://so on 'z'
//			System.out.println("character is in lower case");
//		break;
//		case '1','2','3','4': // so on '9'
//			System.out.println("its a digit");
//		default:
//			System.out.println("invalid input");
//			}
//		1 → Pizza
//		2 → Burger
//		3 → Sandwich
//		4 → Pasta
//		int food_Menu = 1;
//		switch (food_Menu) {
//		case 1:
//			System.out.println("pizaa");
//			break;
//		case 2:
//			System.out.println("burger");
//			break;
//		case 3:
//			System.out.println("sandwich");
//			break;
//		case 4:
//			System.out.println("pasta");
//          default:
//        	  System.out.println("invalid input");
//        	  
//	System.out.println("Create food menu.");
//		}
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
		

	}

}
