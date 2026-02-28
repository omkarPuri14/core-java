package program.operater;

public class Increment_Decrement_Operator {
public static void main(String[] args) {
	int i =90;
	i++; // i value is 91
	int j =i+9;// value of jn is 100 
	System.out.println(i++);//i is 91 for printing and the value increment by one 92
	
	System.out.println("------------------");
	
	--j;// first j=i+9=100 then j is pre decrement that the value of j is now 99
	
	System.out.println(j*i);// now the value of j is 99 and i value is 92 is 99*92 9108
	
	System.out.println("------------------");
	i++; // first value of i is 92 after post increment now i value is 93
	--i;// before value of is 93 after pre decrement i value is 92
	System.out.println(--i); //there is pre decrement syso so i value decrement first 92 to 91 i print 91 value
	System.out.println("-----------------");
	
	++i;//value of i then is 91 after pre increment now i value is 92
	System.out.println(j+3);// then j value is 99 now j value is 102 its print 101 value

	j--; // before value of j is 99 after post decrement j value is 98
	++j;// before value of is 98 after pre increment j value is 99
	
	System.out.println(j+7); // the syso print 99+7=106
	System.out.println("-----------------");
	
	j--; //before j value is 99 after post decrement now j value is 98
	i++;// before i value is 92 after post increment now i value is 93
	--i;// befor i value is 93 after per decrement i value now is 92
	

	System.out.println(i+j);//value of i is 92 + value of j 98= it print 190
	System.out.println("---------------");
	System.out.println(i);//print value of i 92
	System.out.println(j);//print value of j 98











	
}

}

