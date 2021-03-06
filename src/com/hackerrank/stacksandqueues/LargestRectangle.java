package com.hackerrank.stacksandqueues;

import java.util.Deque;
import java.util.LinkedList;

public class LargestRectangle {

	public static void main(String[] args) {
		//int input[] = { 2, 1, 2 };
		//System.out.println(largestRectangle(input));

		int input2[] = { 6, 2, 5, 4, 5, 1, 6 };
		System.out.println(largestRectangle(input2));
	}

	static long largestRectangle(int[] h) {
		Deque<Integer> stack = new LinkedList<>();
		long maxArea = 0;
		long area = 0;
		int i;

		for (i = 0; i < h.length;) {
			if (stack.isEmpty() || h[stack.peekFirst()] <= h[i]) {
				stack.offerFirst(i++);
			} else {
				int top = stack.pollFirst();
				if (stack.isEmpty()) {
					area = h[top] * i;
				} else {
					area = h[top] * (i - stack.peekFirst() - 1);
				}
				if (area > maxArea) {
					maxArea = area;
				}
			}
		}

		while (!stack.isEmpty()) {
			int top = stack.pollFirst();
			if (stack.isEmpty()) {
				area = h[top] * i;
			} else {
				area = h[top] * (i - stack.peekFirst() - 1);
			}
			if (area > maxArea) {
				maxArea = area;
			}
		}

		return maxArea;
	}
}
