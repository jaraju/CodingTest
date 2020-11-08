package com.java8.streams.parallelstreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreams {

	public static void main(String[] args) {
		performaceTest();
	}

	public static void parallelToSequential() {
		List<Integer> numbers = Arrays.asList(3, 1, 4, 1, 5, 9);
		List<Integer> nums = numbers.parallelStream().map(n -> n * 2)
				.peek(n -> System.out.printf("%s Processing %d%n", Thread.currentThread().getName(), n)).sequential()
				.sorted().collect(Collectors.toList());

		System.out.println(nums);
	}

	public static void performaceTest() {

		List<Integer> myList_one = new ArrayList<>();
		List<Integer> myList_two = new ArrayList<>();

		for (int i = 0; i < 1000000; i++) {
			myList_one.add(i);
		}
		long startTime = System.currentTimeMillis();
		myList_one.stream().forEach(num -> myList_two.add(num));
		long endTime = System.currentTimeMillis();
		System.out.println("Total Time with Sequential Streams: " + (endTime - startTime));

		myList_two.clear();

		startTime = System.currentTimeMillis();
		myList_one.parallelStream().forEach(num -> myList_two.add(num));
		endTime = System.currentTimeMillis();
		System.out.println("Total Time with Parallel Streams: " + (endTime - startTime));
	}

}
