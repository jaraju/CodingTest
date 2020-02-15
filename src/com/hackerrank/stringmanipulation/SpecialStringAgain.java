package com.hackerrank.stringmanipulation;

public class SpecialStringAgain {

	public static void main(String[] args) {
		System.out.println(substrCount(5, "asasd"));
		System.out.println(substrCount(7, "abcbaba"));
		System.out.println(substrCount(4, "aaaa"));
	}

	
	static long substrCount(int n, String s) {
	    long count = 0;
	    for (int i = 0; i < s.length(); i++) {
	        int innerCounter = 1;

	        int counterDown = 0;
	        int counterUp = 1;
	        while (i - innerCounter >= 0 && i + innerCounter < s.length()
	                && s.charAt(i - innerCounter) == s.charAt(i - 1) && s.charAt(i + innerCounter) == s.charAt(i - 1)) {
	            count++;
	            innerCounter++;
	        }

	        while (i - counterDown >= 0 && i + counterUp < s.length() && s.charAt(i - counterDown) == s.charAt(i)
	                && s.charAt(i + counterUp) == s.charAt(i)) {
	            count++;
	            counterDown++;
	            counterUp++;
	        }
	    }

	    return count + s.length();
	}
	
	//below my code
	/*
	static long substrCount(int n, String s) {
		long substrCount = n;

		for (int charCount = 2; charCount <= s.length(); charCount++) {
			for (int i = 0; i <= s.length() - charCount; i++) {
				substrCount = substrCount + getSubstringCount(s.substring(i, i + charCount));
				System.out.print(s.substring(i, i + charCount) + ":" + substrCount + " ");

			}
		}

		return substrCount;
	}

	public static long getSubstringCount(String subString) {

		int middle = subString.length() / 2;
		char compareChar = subString.charAt(0);

		for (int first = 0, last = subString.length() - 1; first < middle && last >= middle; first++, last--) {
			if ((subString.charAt(first) != compareChar) || (compareChar != subString.charAt(last)))
				return 0;
		}

		return 1;
	}
*/
}
