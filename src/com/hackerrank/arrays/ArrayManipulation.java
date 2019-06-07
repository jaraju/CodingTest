package com.hackerrank.arrays;

public class ArrayManipulation {
	static long arrayManipulation(int n, int[][] queries) {
		long[] array = new long[n];
		printArray(array);
		long big = 0;
		for (int i = 0; i < queries.length; i++) {
			int startIndex = queries[i][0] - 1;
			int endIndex = queries[i][1];
			int increment = queries[i][2];

			for (int j = startIndex; j < endIndex; j++) {
				array[j] = array[j] + increment;
				if (array[j] > big)
					big = array[j];
			}
			printArray(array);
		}
		return big;
	}

	public static void main(String[] args) {

		int arrayLength = 5;

		int[][] queries = new int[3][3];
		queries[0][0] = 1;
		queries[0][1] = 2;
		queries[0][2] = 100;

		queries[1][0] = 2;
		queries[1][1] = 5;
		queries[1][2] = 100;

		queries[2][0] = 3;
		queries[2][1] = 4;
		queries[2][2] = 100;

		System.out.println(arrayManipulation(arrayLength, queries));
		System.out.println(arrayManipulation2(arrayLength, queries));
	}

	public static void printArray(long[] array) {
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
		System.out.println();
	}
	
	//below is the faster approach to pass hacker rank unit test cases.
	static long arrayManipulation2(int n, int[][] queries) {
		long outputArray[] = new long[n + 2];
		for (int i = 0; i < queries.length; i++) {
			int a = queries[i][0];
			int b = queries[i][1];
			int k = queries[i][2];
			outputArray[a] += k;
			outputArray[b+1] -= k;
		}
		long max = Long.MIN_VALUE;
		long sum = 0;
		for (int i = 0; i < outputArray.length; i++) {
			sum += outputArray[i];
			max = Math.max(max, sum);
		}
		return max;
	}
	
}
