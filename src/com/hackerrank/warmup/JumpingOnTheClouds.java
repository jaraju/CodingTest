package com.hackerrank.warmup;

public class JumpingOnTheClouds {
	
	static int jumpingOnClouds(int[] c) {
		int count = 0;
		for (int i = 0; i < c.length; i++) {
			int next = i + 1;
			int afterNext = i + 2;
			if (next < c.length && c[next] == 0) {
				if (afterNext < c.length && c[afterNext] == 0) {
					count++;
					i++;
				} else {
					count++;
				}
			} else if (next < c.length) {
				count++;
				i++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] c = {0,1,0,0,0,1,0};
		System.out.println(jumpingOnClouds(c));
		int[] d = {0,0,1,0,0,1,0};
		System.out.println(jumpingOnClouds(d));
		int[] e = {0,0,0,0,1,0};
		System.out.println(jumpingOnClouds(e));
	}
}
