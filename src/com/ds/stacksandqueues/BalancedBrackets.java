package com.ds.stacksandqueues;

import java.util.Stack;

public class BalancedBrackets {

	public static void main(String[] args) {
		String input1 = "{[()]}";
		String input2 = "{[(])}";
		String input3 = "{{[[(())]]}}";
		System.out.println(isBalanced(input1));
		System.out.println(isBalanced(input2));
		System.out.println(isBalanced(input3));
	}

	static String isBalanced(String s) {

		Stack<Character> stack = new Stack<>();

		for (char c : s.toCharArray()) {

			switch (c) {
			case '[':
			case '(':
			case '{':
				stack.push(c);
				break;

			case ']':
				if (stack.empty() || !stack.peek().equals('[')) {
					return "NO";
				}
				stack.pop();
				break;
			case ')':
				if (stack.empty() || !stack.peek().equals('(')) {
					return "NO";
				}
				stack.pop();
				break;
			case '}':
				if (stack.empty() || !stack.peek().equals('{')) {
					return "NO";
				}
				stack.pop();
				break;
			}

		}

		return stack.empty() ? "YES" : "NO";
	}
}
