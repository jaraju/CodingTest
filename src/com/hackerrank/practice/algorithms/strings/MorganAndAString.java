package com.hackerrank.practice.algorithms.strings;

public class MorganAndAString {

	public static void main(String[] args) {
		System.out.println(morganAndString("ACA", "BCF"));
	}

	static String morganAndString(String a, String b) {

		StringBuilder finalString = new StringBuilder("");
		int indexA = 0, indexB = 0;
		boolean loop = true;

		while (loop) {
			if (indexA >= a.length() - 1 && indexB < b.length() - 1) {
				finalString.append(b.substring(indexB));
				loop = false;
			} else if (indexB >= b.length() - 1 && indexA < a.length() - 1) {
				finalString.append(a.substring(indexA));
				loop = false;
			} else {
				if (Character.compare(a.charAt(indexA), b.charAt(indexB)) > 0) {
					finalString.append(b.charAt(indexB));
					indexB++;
				} else if (Character.compare(a.charAt(indexA), b.charAt(indexB)) == 0) {
					finalString.append(b.charAt(indexB));
					indexB++;
				}

				else {
					finalString.append(a.charAt(indexA));
					indexA++;
				}
			}
		}
		return finalString.toString();
	}
}
