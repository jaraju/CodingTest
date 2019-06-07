package com.codingtest.string;

public class StringReverse {
	public static void main(String[] args) {
		String input = "string";
		String output = stringReverse(input);
	}

	private static String stringReverse(String input) {
		int length = input.length();
		char[] charArray = input.toCharArray();
		
		for (int i=0;i<length;i++,length--) {
			char temp = charArray[i];
			charArray[i] = charArray[length-1];
			charArray[length-1] = temp;
		}
		String output = String.valueOf(charArray);
		
		System.out.println(input);
		System.out.println(output.toString());
		
		return output;
	}
}
