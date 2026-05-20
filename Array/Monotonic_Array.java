package com.array;

public class Monotonic_Array {
	
	public static void main(String[] args) {
		int[] num = { 1,5,2 };
		int p = num.length - 1;

		int left = 0;
		int right = num.length - 1;
		int count = 0;
		int count1 = 0;

		while (left < right) {

			if (num[left] >= num[right]) {
				count++;

				right--;

			} else if (num[right] >= num[left]) {

				count1++;

				left++;

			}

		}
		if (count == p || count1 == p) {
			System.out.println("monotonic array");

		} else {
			System.out.println("not monotonic array");
		}
	}

}
