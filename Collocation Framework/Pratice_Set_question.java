package com.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Pratice_Set_question {
	public static void main(String[] args) {
		// Program to create an has set and add 10 integer then print them

//		HashSet<Integer> set=new HashSet<Integer>();
//		set.add(34);
//		set.add(456);
//		set.add(89);
//		set.add(67);
//		set.add(891);
//		set.add(70);
//		set.add(13);
//		set.add(15);
//		set.add(34);
//		set.add(93);
//		System.out.println(set);

		// Create a tree set and add the element in it and display

//		TreeSet<Integer> set=new TreeSet<Integer>();
//		set.add(34);
//		set.add(456);
//		set.add(89);
//		set.add(67);
//		set.add(891);
//		set.add(70);
//		set.add(13);
//		set.add(15);
//		set.add(34);
//		set.add(93);
//		System.out.println(set);// always print element in order also null not accepted

		// Create a has link set of an string and print all the element

//		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
//		set.add(34);
//		set.add(456);
//		set.add(89);
//		set.add(67);
//		set.add(891);
//		set.add(70);
//		set.add(13);
//		set.add(15);
//		set.add(34);
//		set.add(93);
// System.out.println(set);// always follow the sequence order and accept one null value

		// Program to find the size of an has set

//		HashSet<Integer> set=new HashSet<Integer>();
//		set.add(34);
//		set.add(456);
//		set.add(89);
//		set.add(67);
//		set.add(891);
//		set.add(70);
//		set.add(13);
//		set.add(15);
//		set.add(314);
//		set.add(93);
//		System.out.println(set.size());

		// Check whether an element exists in a tree set
//		TreeSet<Integer> set=new TreeSet<Integer>();
//		set.add(34);
//		set.add(456);
//		set.add(89);
//		set.add(67);
//		set.add(891);
//		set.add(70);
//		set.add(13);
//		set.add(15);
//		set.add(34);
//		set.add(93);
//		System.out.println(set.contains(34));

		// get first and list element from has link set
//		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
//		set.add(34);
//		set.add(456);
//		set.add(89);
//		set.add(67);
//		set.add(891);
//		set.add(70);
//		set.add(13);
//		set.add(15);
//		set.add(34);
//		set.add(93);
//		System.out.println(set.getFirst());
//		System.out.println(set.getLast());

		// remove Specific element form an has set
//		HashSet<Integer> set=new HashSet<Integer>();
//		set.add(34);
//		set.add(456);
//		set.add(89);
//		set.add(67);
//		set.add(891);
//		set.add(70);
//		set.add(13);
//		set.add(15);
//		set.add(314);
//		set.add(93);
//		set.remove(891);
//		System.out.println(set);// here you need need to mention specific element not specific index

		// Update an specific element in tree set

//		TreeSet<Integer> set=new TreeSet<Integer>();
//		set.add(34);
//		set.add(456);
//		set.add(89);
//		set.add(67);
//		set.add(891);
//		set.add(70);
//		set.add(13);
//		set.add(15);
//		set.add(34);
//		set.add(93);
//		set.remove(34);
//		set.add(45);
//		System.out.println(set);// you can't remove specific element for tree set because it don't Maintain Insertion Orders

		// iterate an has set using iterator

//		HashSet<Integer> set=new HashSet<Integer>();
//		set.add(34);
//		set.add(456);
//		set.add(89);
//		set.add(67);
//		set.add(891);
//		set.add(70);
//		set.add(13);
//		set.add(15);
//		set.add(314);
//		set.add(93);
//	Iterator<Integer> ite=set.iterator();
//	
//	while(ite.hasNext()) {
//		System.out.println(ite.next());
//		
//		
//	}
		// insert a Specific element position in has link set
//		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
//		
//		set.add(34);
//		set.add(456);
//		set.add(89);
//		set.add(67);
//		set.add(891);
//		set.add(70);
//		set.add(13);
//		set.add(15);
//		set.add(34);
//		set.add(93);
//		set.getFirst();
//		
//		System.out.println(set);// it is also not possible because it don't contain random access

		// remove duplicate element in has set
//		HashSet<Integer> set=new HashSet<Integer>();
//		set.add(34);
//		set.add(45);
//		set.add(89);
//		set.add(67);
//		set.add(45);
//		set.add(70);
//		set.add(13);
//		set.add(15);
//		set.add(34);
//		set.add(93);

//	   System.out.println(set);// set can't contain duplicate value it is advantage of a set

		// merge two has set object

//		HashSet<Integer> set=new HashSet<Integer>();
//		set.add(34);
//		set.add(45);
//		set.add(89);
//		set.add(67);
//		set.add(45);
//		set.add(70);
//		set.add(13);
//		set.add(15);
//		set.add(34);
//		set.add(93);
//		
//		HashSet<Integer> set1=new HashSet<Integer>(set);
//		set1.add(49);
//		set1.add(45);
//		set1.add(90);
//		set1.add(13);
//		set1.addAll(set);
//		
//		
//		System.out.println(set1);

		// convert an tree set to has set
//		TreeSet<Integer> set=new TreeSet<Integer>();
//		set.add(34);
//		set.add(456);
//		set.add(89);
//		set.add(67);
//		set.add(891);
//		set.add(70);
//		set.add(13);
//		set.add(15);
//		set.add(34);
//		set.add(93);
//	
//		HashSet<Integer> set1=new HashSet<Integer>(set);
//	
//		System.out.println(set1)

		// compare two link has set object

//		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
//		
//		set.add(34);
//		set.add(456);
//		set.add(89);
//		set.add(67);
//		set.add(891);
//		set.add(70);
//		set.add(13);
//		set.add(15);
//		set.add(34);
//		set.add(93);
//		
		// LinkedHashSet<Integer> set1=new LinkedHashSet<Integer>();

//		
//		set1.add(34);
//		set1.add(456);
//		set1.add(89);
//		set1.add(67);
//		set1.add(891);
//		set1.add(70);
//		set1.add(13);
//		set1.add(15);
//		set1.add(34);
//		set1.add(93);
//		
//		if(set.equals(set1)) {
//			System.out.println("all element are same ");
//			
//		}else {
//			System.out.println("all element are diff same ");
//
//			
//		}

		// count the no of element in tree set

//		TreeSet<Integer> set=new TreeSet<Integer>();
//		set.add(34);
//		set.add(456);
//		set.add(89);
//		set.add(67);
//		set.add(891);
//		set.add(70);
//		set.add(13);
//		set.add(15);
//		set.add(34);
//		set.add(93);
//		
//		System.out.println(set.size());

		// transfer data array has set -> Tree set -> link hash set in java
//		HashSet<Integer> set=new HashSet<Integer>();
//		
//		
//		set.add(34);
//		set.add(456);
//		set.add(89);
//		set.add(67);
//		set.add(891);
//		set.add(70);
//		set.add(13);
//		set.add(15);
//		set.add(34);
//		set.add(93);
//		TreeSet<Integer> set1=new TreeSet<Integer>(set);
//		LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>(set1);
//	
//		
//	
//		System.out.println(set2);

	}

}
