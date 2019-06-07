package com.hackerrank.arrays;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class NewYearChaos {
	
	 // This did not work needs iporovement. //this is my method 
	/*
	static void minimumBribess(int[] q) {
		boolean breakloop = true;
		int reqNumBribes = 0;
		for (int i = 0; i < q.length && breakloop; i++) {
			int actualValue = q[i];
			int expectedValue = i + 1;
			int diff = expectedValue - actualValue;
			if (diff < 0)
				diff *= -1;
			if (diff > 2 && actualValue > expectedValue) {
				System.out.println("Too chaotic");
				breakloop = false;
			} else {
				if (actualValue < expectedValue)
					reqNumBribes = reqNumBribes + diff;
			}
		}
		if (breakloop)
			System.out.println(reqNumBribes);
	}
	*/
	
	static void minimumBribes(int[] q) {
		int solution = solve(q);
		System.out.println(solution >= 0 ? solution : "Too chaotic");

	}

	static int solve(int[] q) {
		if (!isValid(q)) {
			return -1;
		}

		int swapNum = 0;
		LinkedList<Integer> target = new LinkedList<>(Arrays.stream(q).sorted().boxed().collect(Collectors.toList()));
		for (int number : q) {
			int index = target.indexOf(number);
			if (index >= 3) {
				return -1;
			}

			swapNum += index;
			target.remove(index);
		}
		return swapNum;
	}

	static boolean isValid(int[] q) {
		return Arrays.stream(q).min().getAsInt() == 1 && Arrays.stream(q).max().getAsInt() == q.length
				&& Arrays.stream(q).distinct().count() == q.length;
	}

	public static void main(String[] args) {
		// int[] q = {5, 1, 2, 3, 7, 8, 6, 4};
		int[] q = { 2, 1, 5, 3, 4 };
		minimumBribes(q);
		int[] q2 = { 2, 5, 1, 3, 4 };
		minimumBribes(q2);
		System.out.println("----------------");
		int[] q3 = { 5, 1, 2, 3, 7, 8, 6, 4 };
		minimumBribes(q3);
		int[] q4 = { 1, 2, 5, 3, 7, 8, 6, 4 };
		minimumBribes(q4);
		System.out.println("----------------");
		int[] q5 = { 1, 2, 5, 3, 4, 7, 8, 6 };
		minimumBribes(q5);
	}

}
