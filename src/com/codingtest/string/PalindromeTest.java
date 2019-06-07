package com.codingtest.string;

public class PalindromeTest {

	public static void main(String[] args) {

		String[] inputs = { "anna", "civic", "kayak", "level", "madam", "mom", "noon", "racecar", "radar", "redder",
				"refer", "repaper", "rotator", "rotor", "sagas", "solos", "stats", "tenet", "wow" };
		for (String input : inputs) {
			System.out.println(input + " - is Palindrome? :" + testIfPalindrome(input));
		}

/*		String[] Otherinputs = { "Anna", "Civic", "Kayak", "Level", "Madam", "Mom", "Noon", "Racecar", "Radar",
				"Redder", "Refer", "Repaper", "Rotator", "Rotor", "Sagas", "Solos", "Stats", "Tenet", "Wow" };
		for (String input : Otherinputs) {
			System.out.println(input + " - is Palindrome? :" + testIfOtherInputsPalindrome(input));
		}
		*/
		
		String[] negativeInputs = { "anasna", "ciavic", "kayakk", "levvel", "maddam", "momm", "nouuon", "racecard", "raddar", "redderr",
				"refyer", "repaper", "rotator", "roptor", "sagpas", "solops", "stats", "teunet", "ttwow" };
		for (String input : negativeInputs) {
			System.out.println(input + " - is Palindrome? :" + testIfPalindrome(input));
		}
	}

	private static boolean testIfOtherInputsPalindrome(String input) {
		int length = input.length();
		for (int i = 0, j = length - 1; i < length / 2; i++, j--)
			if (Character.toLowerCase(input.charAt(i)) != Character.toLowerCase(input.charAt(j)))
				return false;
		return true;
	}

	private static boolean testIfPalindrome(String input) {
		int length = input.length();
		for (int i = 0, j = length - 1; i < length / 2; i++, j--)
			if (input.charAt(i) != input.charAt(j))
				return false;
		return true;
	}

}
