package com.codingtest.string;

public class VowelsAndConsonants {

	public static void main(String[] args) {
		String vowelString = "aeiou";
		String input = "Java";
		//String input = "rhythm";

		int vowelCount = 0;
		int constCount = 0;
		
		char[] inputChars = input.toCharArray();
		for(char chr : inputChars) 
			if(vowelString.indexOf(Character.toLowerCase(chr))>-1) 
				vowelCount++;
			else
				constCount++;
		
		System.out.printf("Vowel Count : %d, Constant Count : %d",vowelCount,constCount);
	}

}
