package com.codingtest.string;

public class SortArrayOfStringsByLength {

	public static void main(String[] args) {
		String[] stringArr = {"GeeksforGeeeks", "I", "from", "am"};
		printArray(sortStringArray(stringArr));
		String[] stringArr2 = {"You", "are", "beautiful", "looking"};
		printArray(sortStringArray(stringArr2));
	}

	private static String[] sortStringArray(String[] stringArr) {
		int arrLen = stringArr.length;
		for (int i = 0; i < arrLen-1; i++) {
			for (int j = i + 1; j < arrLen; j++) {
				if (stringArr[i].length() > stringArr[j].length()) {
					String tempString = stringArr[j];
					stringArr[j] = stringArr[i];
					stringArr[i] = tempString;
				}
			}
		}
		return stringArr;
	}
	
	public static void printArray(String[] stringArr) {
		for (int i = 0; i < stringArr.length; i++) {
			System.out.println(stringArr[i]);
		}
	}

}
