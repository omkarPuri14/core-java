package com.string;

public class Toggle_String {
//  Toggle Case of Each Character
//	Input: "JaVa"
//	Output: "jAvA"
//	(Upper → Lower, Lower → Upper)
	public static void main(String[] args) {
		
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
