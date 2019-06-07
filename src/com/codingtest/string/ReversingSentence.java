package com.codingtest.string;

public class ReversingSentence {

	public static void main(String[] args) {
		String input = "Java Concept Of The Day";
		String output = reversingSentence(input);
	}

	private static String reversingSentence(String input) {
		String[] words = input.split("\\s+");
		String output = "";
		for (int i = words.length - 1; i >= 0; i--) {
			output = output + words[i] + (i > 0 ? " " : "");
		}
		return output;
	}

}
