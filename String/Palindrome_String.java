package com.string;

public class Palindrome_String {
	public static void main(String[] args) {
		String str="madam";
		String str2="";
		
	for (int i=str.length()-1;i>=0;i--) {
		
		str2=str2+str.charAt(i);
		
		
		
			
		}
	
	if(str.equals(str2)){
		System.out.println("the string is palindrome");
		
	}else {
		System.out.println("string not palidrome");
	}
	
	}

}
