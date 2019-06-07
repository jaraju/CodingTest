package com.codingtest.string;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {
		System.out.println(firstNonRepeatingChar("stredssterd"));
		System.out.println(firstNonRepeatingChar("razzmatazz"));
		System.out.println(firstNonRepeatingChar("whizzbangs"));
		System.out.println(firstNonRepeatingChar("bemuzzling"));
		System.out.println(firstNonRepeatingChar("puzzlingly"));
		System.out.println(firstNonRepeatingChar("unmuzzling"));
		System.out.println(firstNonRepeatingChar("unpuzzling"));
		System.out.println(firstNonRepeatingChar("embezzling"));
		System.out.println(firstNonRepeatingChar("puzzlement"));
		System.out.println(firstNonRepeatingChar("blackjacks"));
		System.out.println(firstNonRepeatingChar("scuzzballs"));
		System.out.println(firstNonRepeatingChar("zigzagging"));
		System.out.println(firstNonRepeatingChar("dizzyingly"));
		System.out.println(firstNonRepeatingChar("bedazzling"));
		System.out.println(firstNonRepeatingChar("showbizzes"));
		System.out.println(firstNonRepeatingChar("pozzolanic"));
		System.out.println(firstNonRepeatingChar("dazzlingly"));
	}

	private static char firstNonRepeatingChar(String s) {
		System.out.print(s + " - ");
		char chars[] = s.toCharArray();
		Map<Character, Integer> nonRepeatMap = new HashMap<Character, Integer>();
		for (char c : chars) {
			Character lowerChar = Character.toLowerCase(c);
			if (nonRepeatMap.containsKey(lowerChar)) {
				nonRepeatMap.put(lowerChar, nonRepeatMap.get(lowerChar) + 1);
			} else {
				nonRepeatMap.put(lowerChar, 1);
			}
		}

		for (char c : chars) {
			if (nonRepeatMap.get(c) == 1) {
				return c;
			}
		}
		return ' ';
	}
}
