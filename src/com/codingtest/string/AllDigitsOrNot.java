package com.codingtest.string;

public class AllDigitsOrNot {

	public static void main(String[] args) {
		System.out.println(AllDigitsOrNot("1823479012834"));
	}

	private static boolean AllDigitsOrNot(String input) {
		for (int index = 0; index < input.length(); index++) {
			if (!Character.isDigit(input.charAt(index)))
				return false;
		}
		return true;
	}

}
