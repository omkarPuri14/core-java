package com.array;

import java.util.Arrays;

public class One_1D {
	public static void main(String[] args) {
		// 1) Write a program to declare and initialize a 1D array of integers.

//		int []a= {1,2,3,4,5,};
//		for(int i=0;i<a.length;i++) {
//			
//			System.out.println(a[i]);
//			
//		}

		// 2) Write a program to print all elements of a 1D array.
//		String [] names= {"omkar","karan","saloni","kajal","guru"};
//		
//		for(int i=0;i<names.length;i++) {
//			
//			System.out.println(names[i]);
//			
//		}

		// 3) Write a program to find the length of a 1D array.

//		int []b= {1,2,3,4,5,6};
//		System.out.println(b.length);

		// 4) Write a program to find the sum of all elements in a 1D array.

//		int []numbers= {1,2,3,4,5,6};
//		int sum = Arrays.stream(numbers).sum();
//		System.out.println(sum);

		// 5) Write a program to find the average of elements in a 1D array.
//		int []numbers= {1,2,3,4,5};
//		int sum = Arrays.stream(numbers).sum();
//		int avg=sum/numbers.length;
//		System.out.println("avg of this array is "+avg);

		// 6) Write a program to find the maximum element in a 1D array.
//		int[] num = { 10, 20, 45, 86, 34, 95 };
//
//		Arrays.sort(num);
//		int max = num[num.length - 1];
//
//		System.out.println("Maximum element of array: " + max);

		// 7) Write a program to find the minimum element in a 1D array.
//		int[] num = { 10, 20, 45, 86, 34, 95 };
//
//		Arrays.sort(num);
//		int min = num[0];
//		System.out.println("minimum element of array "+min);

		// 8) Write a program to search an element in a 1D array.

//		int[] num = { 10, 20, 45, 86, 34, 95 };
//		int search=34;
//        int a= Arrays.binarySearch(num, search);
//        if (a >= 0) {
//            System.out.println("Element found at index: " + a);
//        } else {
//            System.out.println("Element not found.");
//        }

		// 9) Write a program to count even and odd numbers in a 1D array.
//		int[] num = { 10, 20, 45, 86, 34, 95 };
//		
//				for(int i=0;i<num.length;i++) {
//					
//					if(num[i]%2==0) {
//						System.out.println("number is even "+num[i]);
//						
//					}else {
//						System.out.println("number is odd "+num[i]);
//					}
//					
//				}

		// 10) Write a program to copy elements from one array to another.

//		int[] num = { 10, 20, 45, 86, 34, 95 };
//		int[]num2= Arrays.copyOf(num, num.length);
//		
//		System.out.println(Arrays.toString(num2));

		// 11) Write a program to reverse a 1D array.

//		int[] num = { 10, 20, 45, 86, 34, 95 };
//
//		for (int i = 5; i < num.length; i--) {
//			if (i > -1) {
//				System.out.println(num[i]);
//
//			}
//
//		}
		// 12) Write a program to sort a 1D array in ascending order.

//      		int[] num = { 10, 20, 45, 86, 34, 95 };
//      	    Arrays.sort(num);
//      	    System.out.println(Arrays.toString(num));

		// 13) Write a program to sort a 1D array in descending order.
//		int[] num = { 10, 20, 45, 86, 34, 95 };
//
//		Arrays.sort(num);
//
//		for (int i = 5; i < num.length; i--) {
//
//			if (i > -1) {
//				System.out.println(num[i]);
//
//			}
//
//		}

		// 14 Write a program to find duplicate elements in a 1D array.

//		int[] num = { 10, 20, 20,45,45, 86, 34, 95 };
//		
//		 for(int i = 0; i < num.length; i++) {
//	            for(int j = i + 1; j < num.length; j++) {
//	                if(num[i] == num[j]) {
//	                    System.out.println(num[j]);
//	                    
//	                }
//	            }
//	        }

		// 15 Write a program to remove duplicate elements from a 1D array.

//		int[] arr = { 1, 2, 2, 3, 4, 4, 5 };
//		int n = arr.length;
//
//		int[] temp = new int[n];
//		int j = 0;
//
//		for (int i = 0; i < n - 1; i++) {
//			if (arr[i] != arr[i + 1]) {
//				temp[j++] = arr[i];
//			}
//		}
//		temp[j++] = arr[n - 1]; 
//
//		
//		for (int i = 0; i < j; i++) {
//			System.out.print(temp[i] + " ");
//		}

		// 16 Write a program to count frequency of each element in a 1D array

//		int []arr= {1,2,2,3,3,3,5,4,3,2,1,1,};
//		for(int i = 0; i < arr.length; i++) {
//		    
//		    int count = 1;
//		    for(int j = i + 1; j < arr.length; j++) {
//		        if(arr[i] == arr[j]) {
//		            count++;
//		           
//		        }
//		    }
//		    System.out.println(arr[i] + " occurs " + count + " times");
//		}

		// 17 Write a program to find the second largest element in a 1D array

//		int[] num = { 10, 20, 45, 86, 34, 95 };
//		Arrays.sort(num);
//	
//		int scelar=num[num.length-2];
//		System.out.println(scelar);

		// 18 Write a program to find the second smallest element in a 1D array.
//		int[] num = { 10, 20, 45, 86, 34, 95 };
//		Arrays.sort(num);
//		
//		int secsmall=num[1];
//		System.out.println(secsmall);

		// 19 Write a program to merge two 1D arrays.

//		        int[] array1 = {1, 2, 3};
//		        int[] array2 = {4, 5, 6};
//
//		        
//		        int length1 = array1.length;
//		        int length2 = array2.length;
//		        int[] mergedArray = new int[length1 + length2];
//
//		       
//		        for (int i = 0; i < length1; i++) {
//		            mergedArray[i] = array1[i];
//		        }
//
//		      
//		        for (int i = 0; i < length2; i++) {
//		            mergedArray[length1 + i] = array2[i];
//		        }
//
//		       
//		        System.out.println("Merged Array: " + Arrays.toString(mergedArray));

		// 20 Write a program to check whether a 1D array is a palindrome.

//	int[] num = { 141, 3, 5, 86, 434, 95 };
//		
//		
//		for(int i=0;i<num.length;i++) {
//			int target=num[i];
//            int temp = target;
//            int reversedNum = 0;
//
//          
//            while (temp > 0) {
//                int reminder = temp % 10;
//                reversedNum = reversedNum * 10 + reminder;
//                temp = temp / 10;
//            }
//
//           
//            if (target == reversedNum) { 
//                System.out.println(target+ " is a palindrome");
//            }
//			
//			
//		
//		}

		
		
		
		
		

	}
}
