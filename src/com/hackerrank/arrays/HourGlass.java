package com.hackerrank.arrays;

import java.util.Random;

public class HourGlass {

	public static void main(String[] args) {

		int arr[][] = new int[6][6];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++)
				arr[i][j] = new Random().nextInt((9 - 0) + 1) + 0;
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++)
				System.out.print(arr[i][j] + " ");
			System.out.println();
		}
		hourglassSum(arr);
	}

	static int hourglassSum(int[][] arr) {
		int big = -64;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i < arr.length - 2 && j < arr.length - 2) {
					int incr = 1;
					int count = 0;
					for (int k = i; k < i + 3 && k < arr.length; k++) {
						for (int l = j; l < j + 3 && l < arr.length; l++) {
							if (incr != 4 && incr != 6) {
								count = count + arr[k][l];
							}
							incr++;
						}
					}
					if (count > big)
						big = count;
				}
			}
		}
		return big;
	}
}
