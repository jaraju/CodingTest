package com.hackerrank.dictionariesandhashmaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SherlockAndAnagrams {

	public static void main(String[] args) {
		String s1 = "mom";
		String s2 = "abba";
		String s3 = "abcd";
		String s4 = "ifailuhkqq";
		String s5 = "kkkk";
		String s6 = "cdcd";
		String s7="abcdefgh";
	
		System.out.println(sherlockAndAnagrams(s1));System.out.println("------------------------------");
		System.out.println(sherlockAndAnagrams(s2));System.out.println("------------------------------");
		System.out.println(sherlockAndAnagrams(s3));System.out.println("------------------------------");
		System.out.println(sherlockAndAnagrams(s4));System.out.println("------------------------------");
		System.out.println(sherlockAndAnagrams(s5));System.out.println("------------------------------");
		System.out.println(sherlockAndAnagrams(s6));System.out.println("------------------------------");
		System.out.println(sherlockAndAnagrams(s7));System.out.println("------------------------------");
	}

	static int sherlockAndAnagrams(String s) {
		int inputLength = s.length();
		int anagramLength = 1;
		List<String> candidates = new ArrayList<String>();
		while (anagramLength < inputLength) {
			for (int i = 0; i+anagramLength < inputLength; i++) {
				String input = s.substring(i, i + anagramLength);
				for (int j = i+1; j+anagramLength <= inputLength; j++) {
					String target = s.substring(j, j + anagramLength);
				if(isAnagram(input,target)) {
						candidates.add(target);
					}
				}
			}
			anagramLength++;
		}
		return candidates.size();
	}

	private static boolean isAnagram(String input, String target) {
		if(input.length()==target.length()) {
			Map<Character,Integer> anagramMap = new HashMap<Character,Integer>();
			for(char c : target.toCharArray()) {
				if(anagramMap.containsKey(c)) {
					anagramMap.put(c, anagramMap.get(c)+1);
				}else {
					anagramMap.put(c, 1);
				}
			}
			for(char c : input.toCharArray()) {
				if(anagramMap.containsKey(c)) {
					if(anagramMap.get(c)<2) {
						anagramMap.remove(c);
					}else {
						anagramMap.put(c, anagramMap.get(c)-1);
					}
				}
			}
			if(anagramMap.isEmpty())
				return true;
		}
		return false;
	}

	
	
	/*
	 * //this is more expensive
	private static boolean isAnagram(String string, String string2) {

		if (string.length() == string2.length()) {
			char[] charArray1 = string.toCharArray();
			for (char ch : charArray1) {
				System.out.println(string2);
				int index = string2.indexOf(ch);
				if (index > -1) {
					string2 = string2.substring(0, index) + string2.substring(index + 1, string2.length());
				}else {
					return false;
				}
			}
			return string2.isEmpty();
		}
		return false;
	}
	*/
	/*
	//this is more expensive
	static boolean isAnagram(String a, String b) {
		if (a.length() != b.length())
			return false;
		a = a.toLowerCase();
		b = b.toLowerCase();

		int[] temp = new int[Character.MAX_VALUE];
		int summ = 0;

		for (int i = 0; i < a.length(); i++) {
			summ += ++temp[a.charAt(i)] <= 0 ? -1 : 1;
			summ += --temp[b.charAt(i)] >= 0 ? -1 : 1;
		}
		return summ == 0;

	}
	*/
}
