package day1;

public class Revers_no {

	public static void main(String[] args) {

		int num = 1234;
		int reve_no=0;
		int sum=0;

		while (num != 0) {
			int reminder = num % 10;
			sum=sum+reminder;
			reve_no = reve_no * 10 + reminder;
			num = num / 10;
			
			

		}
		System.out.println(reve_no);
		System.out.println(sum);
		
		
		
		
		

	}
	
	

}
