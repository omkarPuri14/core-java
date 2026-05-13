package com.array;

public class Day4 {
	
	    public static void main(String[] args) {
	        String name = "omkar@123";
	        
	        StringBuilder alphabets = new StringBuilder();
	        StringBuilder symbols = new StringBuilder();
	        StringBuilder numbers = new StringBuilder();

	        for (int i = 0; i < name.length(); i++) {
	            char ch = name.charAt(i);

	            if (Character.isLetter(ch)) {
	                alphabets.append(ch);
	            } else if (Character.isDigit(ch)) {
	                numbers.append(ch);
	            } else {
	                symbols.append(ch);
	            }
	        }

	        System.out.println("Alphabets: " + alphabets);
	        System.out.println("Symbol:    " + symbols);
	        System.out.println("Numbers:   " + numbers);
	    }
	}

