package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
public class Day5 {
	public static void main(String[] args) {
//		Write a program to reverse an integer array without using another array.
//
//		Example:
//
//		Input: [1, 2, 3, 4, 5]
//		Output: [5, 4, 3, 2, 1]

//		int [] num= {1,2,3,4,5};
//	
//		
//		for(int i=num.length-1;i>=0;i--) {
//			System.out.println(num[i]);
//		}

//		Write a method to count the number of vowels in a given string.
//
//		Example:
//
//		Input: "Programming"
//		Output: 3

//		String name="Programming";
//		
//		int vowele=0;
//		for(int i=0;i<name.length();i++) {
//			
//			char ch=name.charAt(i);
//			
//			
//			if((ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')||(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')) {
//				
//				vowele++;
//				
//			}
//			
//			
//			
//			
//		}System.out.println("total vowele is in string"+vowele);

//		Find Duplicate Elements in an Array
//
//		Given an integer array, print all duplicate elements.
//
//		Example:
//
//		Input: [1, 2, 3, 2, 4, 5, 1]
//		Output: 1, 2

//		int[] num = {1, 2, 3, 2, 4, 5, 1};
//		HashSet<Integer> dub = new HashSet<>();
//
//		for (int element : num) {
//		    
//		    if (!dub.add(element)) {
//		        System.out.println("Duplicate found: " + element);
//		    }
//		}

//		Check Palindrome String
//
//		Check whether a string is a palindrome or not.
//
//		Example:
//
//		Input: "madam"
//		Output: Palindrome

//		String name = "madam";
//		String name2 = "";
//
//		for (int i = name.length() - 1; i >= 0; i--) {
//			char ch = name.charAt(i);
//			Character.isLowerCase(ch);
//			name2 = name2 + name.charAt(i);
//
//		}
//		if (name.equals(name2)) {
//			System.out.println("string is palamdrom ");
//
//		}
		
		

		
//		        String input = "banana";
//		        
//		        
//		        Map<Character, Integer> charCountMap = new HashMap<>();
//		        
//		      
//		        for (char c : input.toCharArray()) {
//		            
//		            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
//		        }
//		        
//		       
//		        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
//		            System.out.println(entry.getKey() + " -> " + entry.getValue());
//		        }
		
//		6. Largest and Smallest Element in Array
//
//		Find the largest and smallest number in an array.
//
//		Example:
//
//		Input: [12, 5, 8, 20, 1]
//		Output:
//		Largest = 20
//		Smallest = 1
		
		
		
//		int []num= {12,5,8,20,1};
//		
//		int largest = num[0];
//        int smallest = num[0];
//
//  
//        for (int num1 : num) {
//            if (num1 > largest) {
//                largest = num1;
//            }
//            if (num1 < smallest) {
//                smallest = num1;
//            }
//        }
//
//    
//        System.out.println("Largest = " + largest);
//        System.out.println("Smallest = " + smallest);
		
//		String input = "java is easy and java is powerful";
//
//        String output = Arrays.stream(input.split(" "))
//                              .distinct() 
//                              .collect(Collectors.joining(" "));
//
//        System.out.println("Output: \"" + output + "\"");
//    
		
//		List<String> names = new ArrayList<>();
//        names.add("Rahul");
//        names.add("Amit");
//        names.add("Neha");
//
//        System.out.println("Input:  " + names);
//
//        
//        Collections.sort(names);
//
//     
//        System.out.println("Output: " + names);
		
//		Find Second Largest Element
//
//		Find the second largest element in an integer array.
//
//		Example:
//
//		Input: [10, 20, 4, 45, 99]
//		Output: 45
		
//		int[] numbers = {10, 20, 4, 45, 99};
//
//       
//        int largest = Integer.MIN_VALUE;
//        int secondLargest = Integer.MIN_VALUE;
//
//  
//        for (int i = 0; i < numbers.length; i++) {
//            int current = numbers[i];
//
//           
//            if (current > largest) {
//                secondLargest = largest; 
//                largest = current;      
//            } 
//            
//            else if (current > secondLargest && current != largest) {
//                secondLargest = current;
//            }
//        }
//
//
//        if (secondLargest == Integer.MIN_VALUE) {
//            System.out.println("There is no second largest element.");
//        } else {
//            System.out.println("Second Largest = " + secondLargest);
//        }
		
		
		
		
		
    

		
		
		
		
		
		
		
		
		
		

	}

}
