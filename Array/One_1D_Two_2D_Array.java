package com.array;

public class One_1D_Two_2D_Array {

	public static void main(String[] args) {

		// 1 dublicates value in array
//
//		        int[][] num = { { 12, 34, 45 }, { 46, 34, 45 }, { 23, 34, 45 } };
//
//		        System.out.println("Duplicates found:");
//
//		        for (int i = 0; i < 3; i++) {
//		            for (int j = 0; j < 3; j++) {
//		                
//		                int target = num[i][j];
//		                int count = 0;
//
//		               
//		                for (int r = 0; r < 3; r++) {
//		                    for (int c = 0; c < 3; c++) {
//		                        if (num[r][c] == target) {
//		                            count++;
//		                        }
//		                    }
//		                }
//
//		              
//		                if (count > 1) {
//		                 
//		                    boolean alreadyPrinted = false;
//		                    for (int r = 0; r <= i; r++) {
//		                        for (int c = 0; c < (r == i ? j : 3); c++) {
//		                            if (num[r][c] == target) {
//		                                alreadyPrinted = true;
//		                            }
//		                        }
//		                    }
//
//		                    if (!alreadyPrinted) {
//		                        System.out.println(target + " is a duplicate ");
//		                    }
//		                }
//		            }
//		        }

		// 2D sum

//		int[][] num = { { 12, 34, 45 }, { 46, 34, 45 }, { 23, 34, 45 } };
//		int sum = 0;
//
//		for (int i = 0; i < num.length; i++) {
//
//			for (int j = 0; j < num.length; j++) {
//				sum = sum + num[i][j];
//
//			}
//
//		}
//		System.out.println(sum);

		// 2d EVEN ODD

//		int[][] num = { { 12, 34, 45 }, { 46, 34, 45 }, { 23, 34, 45 } };
//
//		for (int i = 0; i < num.length; i++) {
//
//			for (int j = 0; j < num.length; j++) {
//				if (num[i][j] % 2 == 0) {
//					System.out.println("number is even " + num[i][j]);
//				} else {
//					System.out.println("number is odd " + num[i][j]);
//
//				}
//
//			}
//
//		}

		// 2D array prime or not
//		        int[][] num = { { 3, 17, 4 }, { 46, 41, 45 }, { 23, 34, 45 } };
//
//		        System.out.println("Prime numbers found in the array:");
//
//		       
//		        for (int i = 0; i < num.length; i++) {
//		            
//		            for (int j = 0; j < num.length; j++) {
//		                int target = num[i][j];
//		                int count = 0;
//
//		                
//		                for (int k = 1; k <= target; k++) {
//		                    if (target % k == 0) {
//		                        count++;
//		                    }
//		                }
//
//		               
//		                if (count == 2) {
//		                    System.out.println(target + " prime no");
//		                }else {
//		                	     System.out.println(target+ " not prime no");
//		                }
//		            }
//		        }
		// remove dublicate 2D
//		 int[][] num = { { 12, 34, 45 }, { 46, 34, 45 }, { 23, 34, 45 } };
//		 
//		 		        System.out.println(" not Duplicates found:");
//		 
//		 		        for (int i = 0; i < 3; i++) {
//		 		            for (int j = 0; j < 3; j++) {
//		 		                
//		 		                int target = num[i][j];
//		 		                int count = 0;
//		 
//		 		               
//		 		                for (int r = 0; r < 3; r++) {
//		 		                    for (int c = 0; c < 3; c++) {
//		 		                        if (num[r][c] == target) {
//		 		                            count++;
//		 		                        }
//		 		                    }
//		 		                }
//		 
//		 		              
//		 		                if (count > 1) {
//		 		                 
//		 		                    boolean alreadyPrinted = false;
//		 		                    for (int r = 0; r <= i; r++) {
//		 		                        for (int c = 0; c < (r == i ? j : 3); c++) {
//		 		                            if (num[r][c] == target) {
//		 		                                alreadyPrinted = true;
//		 		                            }
//		 		                        }
//		 		                    }
//		 
//		 		                    if (!alreadyPrinted) {
//		 		                       // System.out.println(target + " is not duplicate ");
//		 		                    }
//		 		                }else {
//		 		                	System.out.println(target);
//		 		                }
//		 		            }
//		 		        }
		// cheak palemdrome no in 2D

//		        int[][] num = { { 121, 34, 45 }, { 646, 34, 45 }, { 23, 343, 45 } };
//
//		        System.out.println("Palindrome numbers found in the array:");
//
//		        for (int i = 0; i < num.length; i++) {
//		            for (int j = 0; j < num.length; j++) {
//		                
//		                int target = num[i][j];
//		                int temp = target;
//		                int reversedNum = 0;
//
//		              
//		                while (temp > 0) {
//		                    int reminder = temp % 10;
//		                    reversedNum = reversedNum * 10 + reminder;
//		                    temp = temp / 10;
//		                }
//
//		               
//		                if (target == reversedNum) { 
//		                    System.out.println(target+ " is a palindrome");
//		                }
//		            }
//		        }

		// System.out.println("one d array");

		// find dublicate 1D

//		int[] num = { 10, 20, 20, 45, 45, 86, 34, 95 };
//
//		for (int i = 0; i < num.length; i++) {
//			for (int j = i + 1; j < num.length; j++) {
//				if (num[i] == num[j]) {
//					System.out.println(" dublicate found " + num[j]);
//
//				}
//			}
//		}

		// sum of 1D array
//		int[] num = { 10, 20, 20, 45, 45, 86, 34, 95 };
//		int sum=0;
//		
//		
//		for(int i=0;i<num.length;i++) {
//			
//			int target=num[i];
//			sum=sum+target;
//			
//			
//		}
//		System.out.println(sum);

		// even odd 1D array

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
		// element is prime or not

//		int[] num = { 41, 3, 5, 86, 34, 95 };
//		
//		for(int i=0;i<num.length;i++) {
//			int target=num[i];
//			int count=0;
//		
//		for (int j = 1; j <= target; j++) {
//            if (target % j == 0) {
//                count++;
//            }
//        }
//
//       
//        if (count == 2) {
//            System.out.println(target + " prime no");
//        }else {
//        	     System.out.println(target+ " not prime no");
//        }
//		}

		// palamdrome no in 1D array
//		int[] num = { 141, 3, 5, 86, 434, 95 };
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
