package com.hackerrank.dictionariesandhashmaps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountTriplets {

	public static void main(String[] args) {
		/*
		long[] tripletArray = {1,4,16,64};
		List<Long> tripletList = Arrays.stream(tripletArray).boxed().collect(Collectors.toList());
		long ratio = 4;
		System.out.println(countTriplets(tripletList, ratio));
		*/
		/*
		long[] tripletArray = {1,2,2,4};
		List<Long> tripletList = Arrays.stream(tripletArray).boxed().collect(Collectors.toList());
		long ratio = 2;
		System.out.println(countTriplets(tripletList, ratio));
		*/
		/*
		long[] tripletArray = { 1, 3, 9, 9, 27, 81 };
		List<Long> tripletList = Arrays.stream(tripletArray).boxed().collect(Collectors.toList());
		long ratio = 3;
		System.out.println(countTriplets(tripletList, ratio));
		*/
		/*
		long[] tripletArray = { 1, 5, 5, 25, 125 };
		List<Long> tripletList = Arrays.stream(tripletArray).boxed().collect(Collectors.toList());
		long ratio = 5;
		System.out.println(countTriplets(tripletList, ratio));
		*/
	}
	
	static long countTriplets(List<Long> arr, long r) {
		Map<Long, Long> v2 = new HashMap<>();
		Map<Long, Long> v3 = new HashMap<>();
		Long count = 0L;
		for (Long k : arr) {
			count += v3.get(k) == null ? 0 : v3.get(k);
			if (v2.get(k) != null)
				v3.compute(k * r, (key, value) -> value != null ? value + v2.get(k) : v2.get(k));
			v2.compute(k * r, (key, value) -> value == null ? 1 : value + 1);
		}
		return count;
	}
	
	
	/*  Slow performance 
	static long countTriplets(List<Long> arr, long r) {
		int tripletCount = 0;
		int index=0;
		int arrSize = arr.size();
		while(index<arrSize-2) {
			long first = arr.get(index);
			for(int i=index+1;i<arrSize-1;i++) {
				long second = arr.get(i);
				if(first*r==second) {
					for(int j=i+1;j<arrSize;j++) {
						long third = arr.get(j);
						if(second*r==third) {
							tripletCount++;
						}
					}
				}
			}
			index++;
		}
		return tripletCount;
	}
	 */
}
