package com.hackerrank.dictionariesandhashmaps;

public class TwoStrings {

	public static void main(String[] args) {
		String s1="hellow";
		String s2="world";
		System.out.println(twoStrings(s1,s2));
		String s3="hi";
		String s4="world";
		System.out.println(twoStrings(s3,s4));
	}
    static String twoStrings(String s1, String s2) {
    	return s1.length()>s2.length()?performCheck(s2,s1):performCheck(s1,s2);
    }
    
    static String performCheck(String s1, String s2) {
    	for(char c :s1.toCharArray())
    		if(s2.indexOf(c)>-1) 
    			return "YES";
    	return "NO";
    }
}
