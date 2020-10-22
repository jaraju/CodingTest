package com.ds.sorting;

public class InsertionSort {

	public static void main(String[] args) {
		int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
		display(intArray);

		for (int firstUnSortedIndex = 1; firstUnSortedIndex < intArray.length; firstUnSortedIndex++) {

			int newElement = intArray[firstUnSortedIndex];
			int i;

			for (i = firstUnSortedIndex; i > 0 && intArray[i - 1] > newElement; i--) {
				intArray[i] = intArray[i - 1];
			}
			intArray[i] = newElement;
		}

		display(intArray);

	}

	private static void display(int[] array) {

		for (int i : array)
			System.out.print(i + " ");
		System.out.println();
	}
}
