package com.codingtest.interview;

public class SwapIntegersWithoutThirdVariable {

	public static void main(String[] args) {
		swap(3, 4);
		System.out.println();
		swap(-4, 3);
	}

	private static void swap(int x, int y) {
		System.out.println("Before : x = "+x+", y = "+y);
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("Before : x = "+x+", y = "+y);
	}

}
