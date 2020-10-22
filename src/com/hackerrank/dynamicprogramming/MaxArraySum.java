package com.hackerrank.dynamicprogramming;

public class MaxArraySum {

	public static void main(String[] args) {
		int[] arr = { -2, 1, 3, -4, 5 };
		int[] arr1 = { 3, 7, 4, 6, 5 };
		maxSubsetSum(arr1);

	}
/*
	static int maxSubsetSum(int[] arr) {
		int maxSubsetSum = 0;
		for (int i = 0; i < arr.length - 2; i++) {
			for (int startIndex = i + 2; startIndex < arr.length; startIndex++) {
				int endIndex = startIndex;
				while (endIndex < arr.length) {
					int sum = arr[i];
					for (int k = startIndex; k <= endIndex; k += 2) {
						sum = sum + arr[k];
					}
					if (sum > maxSubsetSum)
						maxSubsetSum = sum;
					endIndex += 2;
				}
			}
		}
		return maxSubsetSum;
	}
	*/
	
	public static int maxSubsetSum(int[] arr) {
		display(arr);
		if (arr.length == 0)
			return 0;
		arr[0] = Math.max(0, arr[0]);
		if (arr.length == 1)
			return arr[0];
		arr[1] = Math.max(arr[0], arr[1]);
		for (int i = 2; i < arr.length; i++) {
			arr[i] = Math.max(arr[i - 1], arr[i] + arr[i - 2]);
			display(arr);
		}
		return arr[arr.length - 1];
	}
	
	private static void display(int[] array) {
		for (int i : array)
			System.out.print(i + " ");
		System.out.println();
	}

}
