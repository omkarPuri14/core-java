package program.control_flow;

public class Pratice_Q {
	public static void main(String[] args) {
//		1 : print pattern like this : 
//
//			A
//			AB
//			ABC
//			ABCD
//			ABCDE

//		for(char i='A';i<='D';i++) {
//			for (char j='A';j<=i;j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}

//		2. 
//
//		*
//		**
//		***
//		****
//		*****
//		****
//		***
//		**
//		*

//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//
//			}
//			System.out.println();
//
//		}
//		for (int i = 1; i <= 4; i++) {
//			for (int j = 4; j >= i; j--) {
//				System.out.print("*");
//
//			}
//			System.out.println();
//
//		}
//		3. 
//		1
//		01
//		101
//		0101
//		10101

//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=i;j++) {
//				if((i+j)%2==0) {
//					System.out.print("1");
//					
//				}else {
//					System.out.print("0");
//				}
//							
//			}
//			System.out.println();
//		}

//		4. 
//
//
//		*   *
//		 * *
//		  *
//		 * *
//		*   *
//
//		for (int i = 0; i < 5; i++) {
//
//			for (int j = 0; j < 5; j++) {
//
//				if (i == j || j == 5 - 1 - i) {
//					System.out.print(" *");
//				} else {
//					System.out.print(" ");
//				}
//			}
//
//			System.out.println();
//		}
		
//		5. 
//
//		Input a number (1–5) and print:
//		1 → Java
//		2 → Python
//		3 → C++
//		4 → JavaScript
//		5 → SQL
//		int number=2;
//		String language;
//		switch(number) {
//		case 1:
//			language="Java";
//			System.out.println(language);
//			break;
//		case 2:
//			language="Python";
//			System.out.println(language);
//			break;
//		case 3:
//			language="C++";
//			System.out.println(language);
//			break;
//		case 4:
//			language="Java Script";
//			System.out.println(language);
//			break;
//		case 5:
//			language="SQL";
//			System.out.println(language);
//			break;
//			
//		
//		}
		
//		6 .Create a program to calculate area:
//			1 → Circle
//			2 → Square
//			3 → Rectangle
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
//     	}
		
//		7 . Input a number (1–3) and print:
//			1 → "Login Success"
//			2 → "Invalid Password"
//			3 → "Account Locked"
//		String name="omkar_tz";
//		int password=123456;
//		int choose=1;
//		switch(choose) {
//		case 1:
//			 if(name=="omkar_tz"&&password==123456) {
//				 System.out.println("login Success");
//					
//				}else {
//					System.out.println(" invalid ");
//				}
//			 break;
//		case 2:
//			if(name=="omkar_tz"&&password!=123456) {
//				System.out.println("Invalid Password");
//				
//			}
//			break;
//		case 3:
//			if(name!="omkar_tz"&&password!=123456) {
//			System.out.println("account locked");
//			}
//			
//		
//          
//		
//		}
		
	}

}
