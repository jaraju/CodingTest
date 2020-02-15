package com.interview.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VowelCounter {

	public static void main(String[] args) {
		new VowelCounter().printTop3("A tournament is a competition involving many teams.");
	}

	public void printTop3(String in) {
		
		List<String> words = Arrays.asList(in.split(" "));
		String vowelString = "aeiouAEIOU";
		
		Map<String, Integer> vowelMap = new HashMap<>();
		
		words.stream().forEach(word -> {
			vowelMap.put(word, 0);
			for (char c : word.toCharArray()) {
				if (vowelString.indexOf(c) >= 0) {
					vowelMap.put(word, vowelMap.get(word) + 1);
				}
			}
		});

		vowelMap.entrySet()
			.stream()
			.sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
			.limit(3)
			.forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));

	}

}
