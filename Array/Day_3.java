package com.array;

public class Day_3 {
	
	// check the 2d array element are prime no or not
	
	public static void main(String[] args) {
		int [][]num= {{2,5,11},{83,67,4},{89,17,90}};
		
		for(int i=0;i<num.length;i++) {
			
			for (int j=0;j<num.length;j++) {
				
				int target=num[i][j];
				int count=0;
				
				for(int k=1;k<=target;k++) {
					if(target%k==0) {
						count++;
					}
					
				}if(count==2) {
					System.out.println(target);
					
				}
				
				
			}
			
		}
		
		// Toggle Case of Each Character
//		Input: "JaVa"
//		Output: "jAvA"
//		(Upper → Lower, Lower → Upper)
	
			
			 String input = "JaVa";
		
		        StringBuilder result = new StringBuilder();
		       

		        
		        for (int i = 0; i < input.length(); i++) {
		            char ch = input.charAt(i);

		         
		            if (Character.isUpperCase(ch)) {
		                result.append(Character.toLowerCase(ch));
		            } 
		            
		            else if (Character.isLowerCase(ch)) {
		                result.append(Character.toUpperCase(ch));
		            } 
		            
		            else {
		                result.append(ch);
		            }
		        }

		        System.out.println("Input: " + input);
		        System.out.println("Output: " + result.toString());
			
		
		
		
		
		
	}
	
	

}
