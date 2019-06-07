package com.hackerrank.dictionariesandhashmaps;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
	static void checkMagazine(String[] magazine, String[] note) {
		Map<String, Integer> magazineMap = new HashMap<String, Integer>();
		for (String mag : magazine) {
			if (magazineMap.containsKey(mag)) {
				magazineMap.put(mag, magazineMap.get(mag) + 1);
			} else {
				magazineMap.put(mag, 1);
			}
		}
		boolean validNote = true;
		for (int i = 0; i < note.length && validNote; i++) {
			String nte = note[i];
			if (magazineMap.containsKey(nte)) {
				int cnt = magazineMap.get(nte);
				if (cnt > 0) {
					cnt--;
					magazineMap.put(nte, cnt);
				} else {
					validNote = false;
					magazineMap.remove(nte);
				}
			} else {
				validNote = false;
			}
		}
		if (validNote)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
	
	public static void main(String[] args) {
		String[] m1 = "give me one grand today night".split(" ");
		String[] m2 = "give one grand today".split(" ");
		checkMagazine(m1,m2);
		
		String[] n1 = "two times three is not four".split(" ");
		String[] n2 = "two times two is four".split(" ");
		checkMagazine(n1,n2);

		String[] o1 = "ive got a lovely bunch of coconuts".split(" ");
		String[] o2 = "ive got some coconuts".split(" ");
		checkMagazine(o1,o2);
	}
}
