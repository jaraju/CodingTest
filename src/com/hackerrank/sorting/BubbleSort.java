package com.hackerrank.sorting;

public class BubbleSort {

	public static void main(String[] args) {
		int[] intArr = {6,5,4,3,2,1};
		countSwaps(intArr);
	}

	static void countSwaps(int[] a) {
		int swapCount = 0;
		int arrLength = a.length;

		for (int i = 0; i < arrLength; i++) {
			for (int j = 0; j < arrLength - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					swapCount++;
				}
			}
		}
		System.out.println("Array is sorted in " + swapCount + " swaps.");
		System.out.println("First Element: " + a[0]);
		System.out.println("Last Element: " + a[arrLength - 1]);
	}
}
