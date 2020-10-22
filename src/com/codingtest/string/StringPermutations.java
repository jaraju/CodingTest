package com.codingtest.string;

public class StringPermutations {

	public static void main(String[] args) {
		String s = "abc"; 
        printPermutn(s, ""); 
	}

	public static void printPermutn(String str, String ans) {
		if (str.length() == 0) {
			System.out.println(ans + " ");
			return;
		}

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			String ros = str.substring(0, i) + str.substring(i + 1);
			printPermutn(ros, ans + ch);
		}
	}
}
