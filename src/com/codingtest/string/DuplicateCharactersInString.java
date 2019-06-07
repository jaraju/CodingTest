package com.codingtest.string;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharactersInString {

	public static void main(String[] args) {
		printDulicates("Programming");
        printDulicates("Combination");
        printDulicates("Java");
	}

	private static void printDulicates(String input) {
		Map<Character, Integer> duplicateMap = new HashMap<Character, Integer>();
		int strLen = input.length();
		if (strLen > 1) {
			char[] characters = input.toCharArray();
			for (Character ch : characters) {
				if(duplicateMap.containsKey(ch)) {
					duplicateMap.put(ch,duplicateMap.get(ch)+1);
				}else {
					duplicateMap.put(ch,1);
				}
			}
		}
		System.out.println("*********** "+input+" *************");
		duplicateMap.forEach((c,i)->{
			if(i>1) {
				System.out.println(c+": "+i);
			}
		});
	}

}
