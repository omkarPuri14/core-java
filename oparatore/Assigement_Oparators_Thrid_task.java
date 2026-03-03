package program.operater;

public class Assigement_Oparators_Thrid_task {
	public static void main(String[] args) {
		double a=67;
		++a;// act value 68.0
		 a+=a+4;//act value of a=140
		 System.out.println(a/3+(a++));//print value of a =186.6666667 act value of a=141.0
		 --a;// act value of a is 140.0
		 double c=4;
		 double d=c*a;//act value of d=560.0
		 ++d;// act value of d=561
		 System.out.println(d*c);// print value 2244.o act value of d=561.0 
		 ++c;// act value of c=5
		 System.out.println(a);//print value of a=140.0
		 --a;// act value 139.0
		 System.out.println(a%=4);//print value of a=3 act value a=3
		 --c;// act value of c=4
		 System.out.println(d/=6);//print value of d=93.5 act value of d=93.5
		 ++a;//act value of a=4
		 --c;//act value of c=3
		 ++d;//act value of d=94.5 
		 System.out.println(d+=c);//print value of d=97.5 act value of d=97.5 
		 System.out.println("----------------------------");
		 
		 System.out.println(a);// act value a=4
		 System.out.println(c);// act value b=3
		 System.out.println(d);// act value c=97.5
		

	}

}
