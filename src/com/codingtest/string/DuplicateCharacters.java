package com.codingtest.string;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters {

	public static void main(String[] args) {

/*		String[] nonRepeating = { "abductions", "abridgment", "admixtures", "afterglows", "aftershock", "algorithms",
				"amplitudes", "anchorites", "angiosperm", "angleworms", "artichokes", "atrophying", "authorized",
				"authorizes" };*/

		String[] repeating = { "California", "Aboveboard", "Washington", "Basketball", "Weathering",
				"Characters", "Literature", "Perfection", "Volleyball", "Depression", "Homecoming", "Technology",
				"Maleficent" };
		
		//findDuplicates(nonRepeating);
		findDuplicates(repeating);

	}

	private static void findDuplicates(String[] inputArray) {
		
		for(String input : inputArray) {
			Map<Character, Integer> dupMap = new HashMap<Character, Integer>();
			char[] inputChars = input.toCharArray();
			
			for(char chr : inputChars) {
				if(dupMap.containsKey(chr)) {
					dupMap.put(chr, dupMap.get(chr)+1);
				}else {
					dupMap.put(chr, 1);
				}
			}
			System.out.println(input+"");
			dupMap.forEach((chr,cnt)->{
				if(cnt>1) System.out.println(chr+" - "+cnt);
			});
			
		}
		
	}
	
	
	

}
