package com.codingtest.string;

import java.util.HashMap;
import java.util.Map;

public class AnagramStrings {
	public static void main(String args[]) {
		System.out.println(isAnagram("tar", "rat"));
		System.out.println(isAnagram("arc", "car"));
		System.out.println(isAnagram("elbow", "below"));
		System.out.println(isAnagram("state", "taste"));
		System.out.println(isAnagram("cider", "cried"));
		System.out.println(isAnagram("dusty", "study"));
		System.out.println(isAnagram("night", "thing"));
		System.out.println(isAnagram("inch", "chin"));
		System.out.println(isAnagram("brag", "grab"));
		System.out.println(isAnagram("cat", "act"));
		System.out.println(isAnagram("bored", "robed"));
		System.out.println(isAnagram("save", "vase"));
		System.out.println(isAnagram("angel", "glean"));
		System.out.println(isAnagram("stressed", "desserts"));
		System.out.println("-------------------------------");
		System.out.println(isAnagram("tar", "ratt"));
		System.out.println(isAnagram("darc", "car"));
		System.out.println(isAnagram("elebow", "below"));
		System.out.println(isAnagram("statett", "taste"));
		System.out.println(isAnagram("cider", "curied"));
		System.out.println(isAnagram("dusty", "stuudy"));
		System.out.println(isAnagram("nnight", "thing"));
		System.out.println(isAnagram("inchinch", "chin"));
		System.out.println(isAnagram("brag", "grablijs"));
		System.out.println(isAnagram("cat", "actact"));
		System.out.println(isAnagram("utbbored", "robed"));
		System.out.println(isAnagram("savde", "vase"));
		System.out.println(isAnagram("anvvvgel", "glean"));
		System.out.println(isAnagram("stressed", "dessertsk"));
	}
	
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
	/*
	public static boolean  isAnagram(String s1, String s2) {
		System.out.print(s1+" - "+s2+ " : ");
		int len1 = s1.length();
		int len2 = s2.length();
		Map<Character,Integer> anagramMap = new HashMap<Character,Integer>();
		
		if(len1==len2) {
			char[] charArray = s1.toCharArray();
			for(char c : charArray) {
				if(anagramMap.containsKey(c)) {
					
					anagramMap.put(c, anagramMap.get(c)+1);
				}else {
					anagramMap.put(c, 1);
				}
			}
			
			charArray = s2.toCharArray();
			for(char c : charArray) {
				if(anagramMap.containsKey(c)) {
					if(anagramMap.get(c)>1)
						anagramMap.put(c, anagramMap.get(c)-1);
					else
						anagramMap.remove(c);
				}else {
					return false;
				}
			}
			if(anagramMap.keySet().size()==0) return true;
		}
			return false;
	}
	*/
}
