package com.hackerrank.warmup;

public class CountingValleys {

	static int countingValleys(int n, String s) {
		int valleyCount = 0;
		
		if (n > 0) {
			int seeLevel = 0;
			boolean valleyCountable = false;
			for (int index = 0; index < n; index++) {
				char c = s.charAt(index);
				if (c == 'U') {
					seeLevel = seeLevel + 1;
					if (seeLevel == 0 && valleyCountable) {
						valleyCount = valleyCount + 1;
						valleyCountable = false;
					}
					
				} else if (c == 'D') {
					if (seeLevel == 0) {
						valleyCountable = true;
					}
					seeLevel = seeLevel - 1;
				} else {
					return valleyCount;
				}
				
			}
		}

		return valleyCount;
	}
	
	public static void main(String[] args) {
		int n = 8;
		String s = "UDDDUDUU";
		
		System.out.println("Valley Count :"+countingValleys(s.length(),s));
	}

}
