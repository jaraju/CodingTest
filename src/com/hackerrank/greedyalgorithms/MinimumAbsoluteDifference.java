package com.hackerrank.greedyalgorithms;

import java.util.Arrays;

public class MinimumAbsoluteDifference {

	public static void main(String[] args) {
		int[] input1 = {3, -7, 0};
		int[] input2 = {-59, -36, -13, 1, -53, -92, -2, -96, -54, 75};
		int[] input3 = {1, -3, 71, 68, 17};
		
		System.out.println(minimumAbsoluteDifference(input1));
		System.out.println(minimumAbsoluteDifference(input2));
		System.out.println(minimumAbsoluteDifference(input3));
		
	}
	static int minimumAbsoluteDifference(int[] arr) {
		int minAbsDiff = Integer.MAX_VALUE;
		Arrays.sort(arr);
	    for (int i = 0; i < arr.length - 1; i++) {  
	    	int diff = Math.abs(arr[i] - arr[i + 1]); 
	        if(diff<minAbsDiff) minAbsDiff = diff;
	    }  
		return minAbsDiff;
    }

}
