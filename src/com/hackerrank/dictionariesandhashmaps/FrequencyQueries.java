package com.hackerrank.dictionariesandhashmaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FrequencyQueries {

	public static void main(String[] args) {
		Integer[][] intArrs = { { 1, 1 }, { 2, 2 }, { 3, 2 }, { 1, 1 }, { 1, 1 }, { 2, 1 }, { 3, 2 } };

		List<List<Integer>> queries = new ArrayList<List<Integer>>();
		for (Integer[] intArr : intArrs) {
			List<Integer> integerList = Arrays.asList(intArr);
			queries.add(integerList);
		}
		System.out.println(freqQuery(queries));
	}

	static List<Integer> freqQuery(List<List<Integer>> queries) {

		List<Integer> returnList = new ArrayList<Integer>();
		Map<Integer, Integer> queryMap = new HashMap<Integer, Integer>();

		queries.stream().forEach(query -> {

			final Integer ONE = 1;
			final Integer TWO = 2;
			final Integer THREE = 3;
			final Integer ZERO = 0;

			Integer command = query.get(0);
			Integer number = query.get(1);

			if (command == ONE) {
				if (queryMap.containsKey(number))
					queryMap.put(number, queryMap.get(number) + 1);
				else
					queryMap.put(number, 1);

			} else if (command == TWO && queryMap.containsKey(number)) {
				if (queryMap.get(number) <= ONE)
					queryMap.remove(number);
				else
					queryMap.put(number, queryMap.get(number) - 1);

			} else if (command == THREE) {
				if (queryMap.containsValue(number))
					returnList.add(ONE);
				else
					returnList.add(ZERO);

			}

		});
		return returnList;
	}

}
