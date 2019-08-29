package com.hackerrank.sorting;

import java.util.Arrays;

public class FraudulentActivityNotifications {

	public static void main(String[] args) {
		int[] expenditure = { 2, 3, 4, 2, 3, 6, 8, 4, 5 };
		int d = 5;
		System.out.println(activityNotifications(expenditure, d));
	}

	static int activityNotifications(int[] expenditure, int d) {
		boolean evenDays = d % 2 == 0 ? true : false;
		int expLen = expenditure.length;
		int notices = 0;
		for (int i = 0, j = d; j < expLen; i++, j++) {
			int intMedian = 0;
			double doubleMedian = 0;
			int[] subArray = Arrays.copyOfRange(expenditure, i, j);
			Arrays.sort(subArray);
			if (!evenDays) {
				intMedian = subArray[d / 2];
				if (expenditure[j] >= intMedian) {
					notices++;
				}
			} else {
				doubleMedian = (double) (subArray[d / 2] + subArray[(d / 2) - 1]) / 2;
				if ((double) (expenditure[j]) >= doubleMedian) {
					notices++;
				}
			}
		}
		return notices;
	}
}
