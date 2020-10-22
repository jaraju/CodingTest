package com.hackerrank.arrays;

import java.util.HashMap;
import java.util.Map;

public class FindPairWithGivenSum {

	public static void main(String[] args) {
		int arr[] = { 2, 3, 7, 4, 8 };
		int target = 7;

		findPair(arr, target);
	}

	private static void findPair(int[] arr, int target) {

		Map<Integer, Integer> indexMap = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= target)
				indexMap.put(target - arr[i], i);
		}

		for (int i = 0; i < arr.length; i++) {
			if (indexMap.containsKey(arr[i])) {
				System.out.println("(" + arr[i] + " , " + arr[indexMap.get(arr[i])] + ")");
				break;
			}
		}

	}

}
