package program.operater;

public class Assigement_Operator_Frist_task {
	public static void main(String[] args) {

		System.out.println("----------First Task ---------------");
		int i = 5;
		i++; // actual value is 6
		--i; // actual v=5
		System.out.println(--i);// print value 4 actual v=4
		i++; // act value =5
		System.out.println(i % 2); // print value 1 act value of i=5
		--i; // act value of i=4
		System.out.println(i += 8); // printing value of i=12 act value of i 12
		i++; // act value of i=13
		int b = i + 12; // act value of b=25
		System.out.println(b);// printing value is 25
		b++;// act value 26
		System.out.println(b * i);// print value of b*i=338
		System.out.println(i++);// print value of i is 13 act value of i=14
		--i; // act value of i=13
		i %= 2; // act value of i =1 (13%2)
		System.out.println(i++); // printing value of i is 1 act value of i=2
		++i; // act value of i=3
		System.out.println(i + 4); // print value of i is 7 act value of i 3

		System.out.println("______________________________");
		System.out.println(i); // printing value of i is 3

	}

}
