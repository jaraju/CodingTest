package com.crackingthecodinginterview.arraysandstrings;

/*
 * Implement an algorithm to determine if a string has all unique characters. 
 * What if you can not use additional data structures?
 * */

public class CheckIfStringHasAllUniqueCharacters {

	public static void main(String[] args) {
		String input1 = "sargent";
		String input2 = "chiranjeevi";
		System.out.println(input1 + ": " + isUniqueChars(input1));
		System.out.println(input2 + ": " + isUniqueChars(input2 + ": " + input2));
	}

	private static boolean isUniqueChars(String input) {
		boolean charSet[] = new boolean[26];
		for (char c : input.toCharArray()) {
			int ascii = c;
			int index = ascii - 97;
			if (charSet[index])
				return false;
			else
				charSet[index] = true;
		}
		return true;
	}

	private static boolean isUniqueChars2(String input) {
		boolean charSet[] = new boolean[256];
		for (char c : input.toCharArray()) {
			int intVal = c;
			if (charSet[intVal])
				return false;
			else
				charSet[intVal] = true;
		}
		return true;
	}

}
