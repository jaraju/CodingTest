package com.interview.test;

public class Encoder {

	public static void main(String[] args) {
		System.out.println(new Encoder().encode("APPLE"));
		System.out.println(new Encoder().encode("ZEBRA"));
	}

	private static final int SHIFT = 5;

	public String encode(String in) {
		StringBuilder output = new StringBuilder("");
		int first = 64, last = 90;
		for (int ascii : in.toCharArray()) {
			char shiftedChar;
			if (ascii + SHIFT <= last) {
				shiftedChar = (char) (ascii + SHIFT);
			} else {
				shiftedChar = (char) ((ascii + SHIFT) - last + first);
			}
			output.append(shiftedChar);
		}
		return output.toString();
	}
}
