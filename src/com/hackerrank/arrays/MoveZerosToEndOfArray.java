package com.hackerrank.arrays;

public class MoveZerosToEndOfArray {

	public static void main(String[] args) {

		int arr1[] = { 1, 2, 0, 4, 3, 0, 5, 0 };
		int arr2[] = { 1, 2, 0, 0, 0, 3, 6 };

		move(arr1);
		System.out.println();
		move(arr2);
	}

	private static void move(int[] arr) {

		int position = 0;
		int arrLength = arr.length;

		for (int i = 0; i < arrLength; i++) {
			if (arr[i] != 0) {
				arr[position++] = arr[i];
			}
		}

		while (position < arrLength) {
			arr[position++] = 0;
		}

		for (int a : arr)
			System.out.print(a + " ");
	}

}
