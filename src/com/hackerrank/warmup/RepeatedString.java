package com.hackerrank.warmup;

public class RepeatedString {

	static long repeatedString(String s, long n) {

		long count = 0;
		long inputlength = s.length();
		for (int i = 0; i < inputlength; i++) {
			if (s.charAt(i) == 'a')
				count = count + 1;
		}

		long times =  n / inputlength;
		long rem = n % inputlength;
		count = count * times;

		if (rem > 0) {
			s = s.substring(0, (int)rem);
			inputlength = s.length();

			for (int i = 0; i < inputlength; i++) {
				if (s.charAt(i) == 'a')
					count = count + 1;
			}
		}

		return count;
	}

	public static void main(String[] args) {
		
		String s = "abc";
		long n = 10;
			
		
		System.out.println(repeatedString(s, n));
	}

}
