package com.string;

public class String_Count {
//	Count Number of Digits in String
//	Input: "Java1234"
//	Output: Digits = 4


	public static void main(String[] args) {
		String str="Java1234";
		int count=0;
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z') {
				
				
				
			}else {
				count++;
				
			}
			
			
			
		}
		System.out.println("digites inside String is "+count);
		
		
	}

}
