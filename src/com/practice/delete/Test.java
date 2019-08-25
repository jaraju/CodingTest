package com.practice.delete;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		
		Set<String> setOfStrings = new TreeSet<String>(Arrays.asList("ab","zfg","dd","cat","rat","xvc","don","dd"));
		List<String> listOfStrings = setOfStrings.stream().collect(Collectors.toList());
		System.out.println(listOfStrings);
	}

}
