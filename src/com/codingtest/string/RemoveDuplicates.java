package com.codingtest.string;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String input = "bananas";
		String output = removeDuplicates(input);
		System.out.println(input+" - "+output);
	}

	private static String removeDuplicates(String input) {
		int len = input.length();

		for (int i = 0, j = i + 1; i < len - 1; j++) {
			if (j == len) {
				i++; j = i + 1;
			}

			if (j != len && input.charAt(i) == input.charAt(j)) {
				input = input.substring(0, j) + input.substring(j + 1, len);
				len = input.length();
			}
		}
		return input;
	}

}
