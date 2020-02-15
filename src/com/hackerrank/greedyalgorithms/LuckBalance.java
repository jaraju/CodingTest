package com.hackerrank.greedyalgorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LuckBalance {

	public static void main(String[] args) {
		int k = 3;
		int[][] contests = { { 5, 1 }, { 2, 1 }, { 1, 1 }, { 8, 1 }, { 10, 0 }, { 5, 0 } };
		System.out.println(luckBalance(k, contests));
	}

	static int luckBalance(int k, int[][] contests) {
		Integer luckBalance = 0;
		List<Integer> luckList = new ArrayList<>();

		for (int i = 0; i < contests.length; i++) {
			for (int j = 0; j < 1; j++) {
				if (contests[i][j + 1] == 1)
					luckList.add(contests[i][j]);
				else
					luckBalance += contests[i][j];
			}
		}
		if (luckList.size() > 0) {
			
			if(k>luckList.size()) k=luckList.size();
			
			List<Integer> luckListSorted = luckList.stream().sorted().collect(Collectors.toList());
			luckBalance -= luckListSorted.subList(0, luckListSorted.size() - k).stream().reduce(0,
					(subtotal, element) -> subtotal + element);

			luckListSorted.subList(0, luckListSorted.size() - k).clear();

			luckBalance += luckListSorted.stream().reduce(0, (subtotal, element) -> subtotal + element);
		}
		return luckBalance;
	}

}
