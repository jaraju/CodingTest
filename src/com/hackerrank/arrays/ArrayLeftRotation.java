package com.hackerrank.arrays;

public class ArrayLeftRotation {
	static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		printArray(a);
		printArray(rotLeft(a, 3));
	}

	static int[] rotLeft(int[] a, int d) {
		int len = a.length;
		while (d > 0) {
			int temp = a[0];
			for (int i = 0; i < len - 1; i++) {
				a[i] = a[i + 1];
			}
			a[len - 1] = temp;
			d--;
		}
		return a;
	}
}
