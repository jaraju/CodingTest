package com.hackerrank.arrays;

public class MinimumSwaps2 {
	private static void printArray(int[] arr) {
		for(int element : arr) {
			System.out.print(element+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = {7, 1, 3, 2, 4, 5, 6};
		printArray(arr);
		int numOfSwaps = minimumSwaps(arr);
		System.out.println(numOfSwaps);
	}

	private static int minimumSwaps(int[] arr) {
		int swaps = 0;
		for(int current = 0;current<arr.length;) {
			if(arr[current]!=current+1) {
				int newIndex = arr[current]-1;
				int temp = arr[newIndex];
				arr[newIndex] = arr[current];
				arr[current]=temp;
				++swaps;
			}else {
				++current;
			}
			printArray(arr);
		}
		return swaps;
	}
}
