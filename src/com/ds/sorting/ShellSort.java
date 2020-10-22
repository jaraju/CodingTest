package com.ds.sorting;

public class ShellSort {

	public static void main(String args[]) {

		int[] array = { 20, 35, -15, 7, 55, 1, -22 };
		shellSort(array);
	}

	private static void shellSort(int[] array) {

		for (int gap = array.length / 2; gap > 0; gap /= 2) {
			System.out.println("Gap : " + gap);
			for (int i = gap; i < array.length; i++) {
				System.out.print("     i = " + i);

				int newElement = array[i];

				int j = i;
				while (j >= gap && array[j - gap] > newElement) {
					System.out.print("     j-gap = "+(j - gap));
					array[j] = array[j - gap];
					j -= gap;
				}
				System.out.println();
				array[j] = newElement;
			}
			System.out.println("-------------------------------------------------------");
		}

		display(array);
	}

	private static void display(int[] array) {

		for (int i : array)
			System.out.print(i + " ");
		System.out.println();
	}

}
