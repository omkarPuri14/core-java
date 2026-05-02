package com.list;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class Pratice_List_Q {

	public static void main(String[] args) {

		// Program to create an array list and add 10 integer then print them

//		ArrayList<Integer> list=new ArrayList<Integer>();
//		list.add(45);
//		list.add(48);
//		list.add(78);
//		list.add(87);
//		list.add(42);
//		list.add(90);
//		list.add(99);
//		list.add(44);
//		list.add(97);
//		list.add(66);
//		System.out.println(list);

		// Create a Vector and add the element in it and display
//		Vector<Integer>list=new Vector<Integer>();
//		
//		list.add(45);
//		list.add(48);
//		list.add(78);
//		list.add(87);
//		list.add(42);
//		list.add(90);
//		list.add(99);
//		list.add(44);
//		list.add(97);
//		list.add(66);
//		System.out.println(list);

		// Create a linklist of an string and print all the element

//		LinkedList<String>name=new LinkedList<String>();
//		name.add("omkar");
//		name.add("Ramesh");
//		name.add("Suresha");
//		name.add("Radhika");
//		name.add("Kajal");
//		name.add("Salaoni");
//		name.add("Ram");
//		System.out.println(name);

		// Program to find the size of an array list

//		ArrayList<Integer> list=new ArrayList<Integer>();
//		list.add(45);
//		list.add(48);
//		list.add(78);
//		list.add(87);
//		list.add(42);
//		list.add(90);
//		list.add(99);
//		list.add(44);
//		list.add(97);
//		list.add(66);
//		System.out.println("size of an array "+list.size());

		// Check whether an element exists in a vector

//		Vector<Integer>list=new Vector<Integer>();
//	
//		list.add(45);
//		list.add(48);
//		list.add(78);
//		list.add(87);
//		list.add(42);
//		list.add(90);
//		list.add(99);
//		list.add(44);
//		list.add(97);
//		list.add(66);
//		
//		System.out.println(list.contains(45));

		// get first and list element from link list

//		LinkedList<String>name=new LinkedList<String>();
//		name.add("omkar");
//		name.add("Ramesh");
//		name.add("Suresha");
//		name.add("Radhika");
//		name.add("Kajal");
//		name.add("Salaoni");
//		name.add("Ram");
//		System.out.println(name.getFirst());
//		System.out.println(name.getLast());

		// remove Specific element form an array list

//		ArrayList<Integer> list=new ArrayList<Integer>();
//		list.add(45);
//		list.add(48);
//		list.add(78);
//		list.add(87);
//		list.add(42);
//		list.add(90);
//		list.add(99);
//		list.add(44);
//		list.add(97);
//		list.add(66);
//		list.remove(5);
//		System.out.println(list);

		// Update an specific element in vector

		// Vector<Integer>list=new Vector<Integer>();

//			list.add(45);
//			list.add(48);
//			list.add(78);
//			list.add(87);
//			list.add(42);
//			list.add(90);
//			list.add(99);
//			list.add(44);
//			list.add(97);
//			list.add(66);
//			list.set(4, 67);
//			
//			System.out.println(list);

		// iterate an array list using iterator
//		
//		ArrayList<String> fruits = new ArrayList<>();
//        fruits.add("Apple");
//        fruits.add("Banana");
//        fruits.add("Cherry");
//
//       
//        Iterator<String> it = fruits.iterator();
//
//       
//        while(it.hasNext()) {
//            String fruit = it.next(); // Returns the next element
//            System.out.println(fruit);
//        }

		// reverse a link list

//		LinkedList<String>name=new LinkedList<String>();
//		name.add("omkar");
//		name.add("Ramesh");
//		name.add("Suresha");
//		name.add("Radhika");
//		name.add("Kajal");
//		name.add("Salaoni");
//		name.add("Ram");
//		
//		System.out.println(name.reversed());

		// sort an array list in ascending order

//		ArrayList<Integer> list=new ArrayList<Integer>();
//		list.add(45);
//		list.add(48);
//		list.add(78);
//		list.add(87);
//		list.add(42);
//		list.add(90);
//		list.add(99);
//		list.add(44);
//		list.add(97);
//		list.add(66);
//		
//		list.sort(null);
//		System.out.println(list);

		// copy element array list to vector

//		ArrayList<Integer> list=new ArrayList<Integer>();
//		list.add(45);
//		list.add(48);
//		list.add(78);
//		list.add(87);
//		list.add(42);
//		list.add(90);
//		list.add(99);
//		list.add(44);
//		list.add(97);
//		list.add(66);
//		
//		Vector<Integer>list1=new Vector<Integer>(list);
//		System.out.println(list1);

		// insert a Specific element position in link list
//		LinkedList<String>name=new LinkedList<String>();
//		name.add("omkar");
//		name.add("Ramesh");
//		name.add("Suresha");
//		name.add("Radhika");
//		name.add("Kajal");
//		name.add("Salaoni");
//		name.add("Ram");
//		name.set(1, "guru");
//		System.out.println(name);

		// remove duplicate element in array list

//		ArrayList<Integer> list = new ArrayList<Integer>();
//		list.add(45);
//		list.add(48);
//		list.add(45);
//		list.add(87);
//		list.add(42);
//		list.add(99);
//		list.add(99);
//		list.add(66);
//		list.add(97);
//		list.add(66);
//
//		for (int i = 0; i < list.size(); i++) {
//			for (int j = i + 1; j < list.size(); j++) {
//
//				if (list.get(i).equals(list.get(j))) {
//					list.remove(j);
//
//					j--;
//
//				}
//			}
//
//		}
//		System.out.println(list);
		
		//merge two array list object
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		list.add(45);
//		list.add(48);
//		list.add(45);
//		list.add(87);
//		list.add(42);
//		list.add(99);
//		list.add(99);
//		list.add(66);
//		list.add(97);
//		list.add(66);
//		ArrayList<Integer>list2=new ArrayList<Integer>();
//		list2.add(78);
//		list2.add(67);
//		list2.add(78);
//		
//		
//		
//		list.addAll(list2); 
//		System.out.println(list);
		
		// convert an vector to array list 
//		Vector<Integer> list=new Vector <Integer>();
//		list.add(45);
//		list.add(48);
//		list.add(78);
//		list.add(87);
//		list.add(42);
//		list.add(90);
//		list.add(99);
//		list.add(44);
//		list.add(97);
//		list.add(66);
//		
//		ArrayList <Integer>list1=new ArrayList<Integer>(list);
//		System.out.println(list1);
		
		//search an element in link list and display its position
		
//		LinkedList<String>name=new LinkedList<String>();
//		name.add("omkar");
//		name.add("Ramesh");
//		name.add("Suresha");
//		name.add("Radhika");
//		name.add("Kajal");
//		name.add("Saloni");
//		name.add("Ram");
//		String target="Saloni";
//		int position = name.indexOf(target);
//		if (position != -1) {
//            System.out.println("Element '" + target + "' found at position: " + position);
//        } else {
//            System.out.println("Element not found in the list.");
//        }
		//compare two array list object
//		ArrayList<Integer> list=new ArrayList <Integer>();
//		list.add(45);
//		list.add(48);
//		list.add(78);
//		list.add(87);
//		list.add(42);
//		list.add(90);
//		list.add(99);
//		list.add(44);
//		list.add(97);
//		list.add(66);
//		
//		ArrayList<Integer> list1=new ArrayList <Integer>();
//		list1.add(45);
//		list1.add(48);
//		list1.add(78);
//		list1.add(87);
//		list1.add(42);
//		list1.add(90);
//		list1.add(99);
//		list1.add(44);
//		list1.add(97);
//		list1.add(66);
//		
//		if(list.equals(list1)) {
//			System.out.println("all element are same ");
//		}else {
//			System.out.println("all elements are diff");
//		}
		
		// count the no of element in vector
		
//		Vector<Integer> list=new Vector <Integer>();
//		list.add(45);
//		list.add(48);
//		list.add(78);
//		list.add(87);
//		list.add(42);
//		list.add(90);
//		list.add(99);
//		list.add(44);
//		list.add(97);
//		list.add(66);
//		System.out.println("element that are present in vector is: "+list.size());
		
		// transfer data array list -> vector -> linklist in java
		
//		 ArrayList<Integer> list = new ArrayList<Integer>();
//		 
//		    list.add(45);
//			list.add(48);
//			list.add(78);
//			list.add(87);
//			list.add(42);
//			list.add(90);
//			list.add(99);
//			list.add(44);
//			list.add(97);
//			list.add(66);
//		 
//
//	        
//	        Vector<Integer> vector = new Vector<Integer>(list);
//
//	        
//	        LinkedList<Integer> linkedList = new LinkedList<Integer>(vector);
//
//	        System.out.println("Final LinkedList: " + linkedList);
		
		
		
		
		
		



	}

}
