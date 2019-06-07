package com.hackerrank.warmup;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SockMerchant {

	static int sockMerchant(int n, int[] ar) {
		int sockCount = 0;
		if (ar.length > 1) {
			Map<Integer, Integer> sockMap = new HashMap<Integer, Integer>();
			for (int i : ar) {
				if (sockMap.containsKey(i)) {
					sockMap.put(i, sockMap.get(i) + 1);
				} else {
					sockMap.put(i, 1);
				}
			}

			for (Map.Entry me : sockMap.entrySet()) {
				int value = (int) me.getValue();

				if (value > 1)
					sockCount = sockCount + value / 2;
				
				/* Below is another way
				 * while(value - 2 >= 0) { sockCount++; value = value-2; }
				 */

			}
		}

		return sockCount;
	}

	public static void main(String[] args) throws IOException {
		int[] intArray = { 1, 7, 2, 7, 1, 10, 2, 7, 1, 10, 3, 7, 2, 10, 7 };
		int n = intArray.length;
		int total = sockMerchant(n, intArray);
		System.out.println(total);
	}
}
