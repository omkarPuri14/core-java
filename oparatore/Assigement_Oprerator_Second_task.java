package program.operater;

public class Assigement_Oprerator_Second_task {
	public static void main(String[] args) {
		int i=34;
		  i++; // act value of i=35
		--i;//act value of i=34
		System.out.println(i+i++); // printing value of i=68 act value of i i=35
		i++; // act value of i=36
		System.out.println(i %= 4);//print value of i=0 act value of i=0 
		--i; //act value of i=-1
		System.out.println(i += 5);//print value of i is=4 act value of i=4
		i++; // act value of i=5
		i = 3;
	    int b = i + 2;// act value of b is 5 
		System.out.println(i++); // print value of i 3 act value of i=4
		System.out.println(b*i);//print value of i=20 act value of i=4
		--i; // act value of i=3
		i %= 4;// act value of i=3
		System.out.println(i++); // print value of i=3 act value 4
		--i; // act value of i=3
		System.out.println(i /3); //print value of i=1 act value of i is 3

		System.out.println("______________________________");
		System.out.println(i);// print value of i is 3

	}

}
