package com.hackerrank.sorting;

import java.util.Arrays;

public class MarkAndToys {

	public static void main(String[] args) {
		int[] prices = { 1, 12, 5, 111, 200, 1000, 10 };
		int k = 50;
		System.out.println(maximumToys(prices, k));
		 
		int[] prices2 = {33324560, 77661073, 31948330, 21522343, 97176507, 5724692, 24699815, 12079402, 
				6479353, 28430129, 42427721, 57127004, 26256001, 29446837, 65107604, 9809008, 65846182, 
				8470661, 13597655, 360};
		k = 100000;
		System.out.println(maximumToys(prices2, k));  
	}

	static int maximumToys(int[] prices, int k) {
		int i = 0;
		Arrays.sort(prices);
		while (k - prices[i] >= 0) {
			k = k - prices[i];
			i++;
		}
		return i;
	}
	
}
