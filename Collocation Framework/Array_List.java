package com.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.ListIterator;

public class Array_List {

	public static void main(String[] args, ArrayList<Integer> Integer) {
		// Write a Java program to store 5 integer elements in an ArrayList and print
		// all elements.

//		ArrayList<Integer> list=new ArrayList<Integer>();
//		list.add(12);
//		list.add(34);
//		list.add(45);
//		list.add(67);
//		list.add(67);
//		System.out.println("printing all integer value"+list);

		// Write a Java program to add, update, and remove elements from a List.
//		ArrayList list=new ArrayList();
//		list.add(34);
//		list.add(56);
//		list.add(56);
//		list.add(67);
//		list.add(90);
//		list.set(0,6);
//		list.remove(1);
//	
//		System.out.println(list);

		// Write a Java program to find the size of a List and print the first and last
		// element.

//		
//		ArrayList list=new ArrayList();
//		list.add(34);
//		list.add(56);
//		list.add(56);
//		list.add(67);
//		list.add(90);
//		
//		
//		
//		System.out.println("size of array list "+list.size());
//		System.out.println("frist element "+list.getFirst());
//		System.out.println("list element "+list.getLast());

		// Write a Java program to check whether a given element exists in a List or
		// not.

//		ArrayList list=new ArrayList();
//		list.add(34);
//		list.add(56);
//		list.add(56);
//		list.add(67);
//		list.add(90);
//		
//		
//		System.out.println(list.contains(56));

		// Write a Java program to iterate a List using for-each loop

//		ArrayList list=new ArrayList();
//		list.add(34);
//		list.add(56);
//		list.add(56);
//		list.add(67);
//		list.add(90);
//		
//		for (Object obj : list) {
//			System.out.println(obj);
//			
//		}

		// Write a Java program to sort a List of integers in ascending order.

//		ArrayList list=new ArrayList();
//	
//		list.add(85);
//		list.add(56);
//		list.add(99);
//		list.add(67);
//		list.add(90);
//		list.sort(null);
//		System.out.println(list);

		// Write a Java program to remove duplicate elements from a List.
//		ArrayList list = new ArrayList();
//
//		list.add(85);
//		list.add(84);
//		list.add(99);
//		list.add(67);
//		list.add(90);
//		list.add(67);
//		list.add(99);
//		
//		for (int i = 0; i < list.size(); i++) {
//            
//            for (int j = i + 1; j < list.size(); j++) {
//                if (list.get(i).equals(list.get(j))) {
//                    System.out.println(list.get(j));
//                   
//                    break; 
//                }
//            }
//        }

		// Write a Java program to reverse elements of a List.

//		ArrayList list = new ArrayList();
//		
//				list.add(85);
//				list.add(84);
//				list.add(99);
//				list.add(67);
//				list.add(90);
//				list.add(67);
//				list.add(99);
//				
//				
//				System.out.println(list.reversed());

		// Write a Java program to copy all elements from one List to another List.

//		ArrayList list = new ArrayList();
//	
//				list.add(85);
//				list.add(84);
//				list.add(99);
//				list.add(67);
//				list.add(90);
//				list.add(67);
//				list.add(99);
//				
//				ArrayList list1=new ArrayList(list);
//				
//				
//				System.out.println(list);
//				System.out.println(list1);

		// Write a Java program to convert a List into an array and print the array elements.
		
		
		ArrayList<Integer>list=new ArrayList<Integer>();
		
					list.add(85);
					list.add(84);
					list.add(99);
					list.add(67);
					list.add(90);
					list.add(67);
					list.add(99);
					int []num= {};
					
				 for (int i = 0; i < list.size(); i++) {
				           
							num[i] = list.get(i);
							
							
					 }
				 
		
		
        
		   
		 

	}

}
