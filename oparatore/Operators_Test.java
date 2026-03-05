package program.operater;

public class Operators_Test {
	public static void main(String[] args) {
		
		1) int a=10;a+=5;a-=3; a*=2;a/=4;//act value of a is 10 after a+=3(a=15) after a-=3(12) after a*=2(a=24) after a/=4(a=6)

		System.out.println(a); //printig value of a=6
		
		2) int a = 5; b = 10; c = 15;
		System.out.println((a < b) && (b < c));// its print true
		Syso((true)&&(true))
		syso(true)
		
		3. System.out.println((a > b) || (b < c));// print true
		syso((false)||(true));
		syso(true); // because || operator needs only one value true
		System.out.println(!(a < c));// false
		syso(!(true)); // not operator change value true to false
		syso(false);// print false
		
		4. int x = 10; y = 20;
		System.out.println(x++ + ++y);// 10+21 because of y is pre increment the out put=31
		//out put is 31
		
		
		5. int a = 5;b = 2;
		System.out.println(a % b);//reminder is 1
		
		6. int p = 7, q = 3; 
		System.out.println(p * q + p / q);//23
		syso(21+2);
		//out put 23
		
		
		7. int n = 5;
		System.out.println(++n + n++);//pre increment of n=6 (6+6) act value of n=7
		// out put is 12
		
		
		8. int x = 5, y = 10; System.out.println(x > y ? x : y)// out of 
		
		9. int a = 10, b = 5, c; c = a++ + --b + a * b; //(10++ + -5 + 11*5)
		System.out.println(c);//60
		
		
		10. int a = 4, b = 2; 
		System.out.println(a << b);//  binary no 16  8 4 2  1  
		                           // by no 4          1  0  0   now using right shift << by b=2
		                           //             1  0 0    we consider 1=16
		// out put is 16
		
		
		11. int a = 8, b = 2; 
		
		System.out.println(a >> b);//2
		                           //  binary no 16  8  4  2  1
		                          // by no 8 is      1  0  0  0 now using left shift by 2
		                         //                        1  0  0  0 // consider the 1 =2
		// the out put=2
		
		
		
		
		12. int a = 10; 
		System.out.println(~a);// -11
		
		
		13. int a = 5, b = 7; 
		System.out.println(a & b);// 5
		// binary no    8  4  2  1
		// by no of 7 =    1  1  1
		// by no of 5=     1  0  1 using & bitewise operator check the value in 1  0 format
		//                ---------
		//                 1  0  1 now consider the 1=1+1(4+1)=5
		
		
		14. int a = 5, b = 7; 
		System.out.println(a | b);// 7
		// binary no    8  4  2  1
				// by no of 7 =    1  1  1
				// by no of 5=     1  0  1 using | bitewise operator check the value in 1  0 format
				//                ---------
				//                 1  1  1 now consider the 1=1+1(4+2+1)=7

		
		
		15. int a = 5, b = 7;
		System.out.println(a ^ b);// 2
		// binary no    8  4  2  1
		// by no of 7 =    1  1  1
		// by no of 5=     1  0  1 using ^ bitewise operator check the value in 1  0 format
		//                ---------
		//                 0  1  0 now consider the 1=2


		
		
		
		16. int a = 10; 
		System.out.println(a++ + ++a + a--);// 34
		//(10++ + ++12 + 12--)act value of a is 11
		
		
		17. int a = 1; a += a++ + ++a;  // 1+= 1++ + ++3; 
		System.out.println(a);// 5
		
		
		18. int a = 5, b = 10; 
		boolean result = (a < b) ? true : false;
		System.out.println(result);//out 
		
		
		19. int a = 5, b = 10;
		System.out.println(a == b);// its print false
		
		20. int a = 3, b = 2; 
		System.out.println(a * b + a / b);// 7
		//(3*2 + 3/2)=(6+1)=(7)
		
		21. int a = 5; a = a++ + ++a; // a=5+7
		System.out.println(a);// 12
		
		
		22. int a = 10, b = 5;
		System.out.println(a > b && a != b);// true
		//(true && true)= (true)
		
		
		23. int x = 2, y = 3; x *= y + 1; //2*=3+1(2*4)
		System.out.println(x);//8
		
		
		24. int a = 5; a += a -= a *= a;// using bodmas rule /*+-
		// 5+=5-=5*=5; // -5*5=25 // 5+=5-25// 5+5=10// 10-25=-15
		System.out.println(a);//-15
		
		25. int a = 4, b = 3; 
		System.out.println(a > b ? a++ : ++b);// out of
		
		26. int a = 5;
		System.out.println(a++ + a++ + ++a);//19
		//(5++ + 6++ + 8)=19
		
		
		27. int a = 2, b = 3; 
		System.out.println(a + b * a / b);//4 using bodmas rule /*+-
		//(2+3*2/3)=(2+6/3)=(2+2)=4
		
		
		28. int a = 10, b = 20; 
		System.out.println(a < b && b > a);// true
		//(true && true)
		
		
		29. int a = 6, b = 2;
		System.out.println((a / b) * (a % b));//0
		// ((6/2)*(6%2))=(3*0)=0
		
		30. int a = 5, b = 10, c = 15;
		System.out.println((a < b && b > c) || !(b < c));// false
		// ((true && false)||!(true))
		// (false||)

	}
}