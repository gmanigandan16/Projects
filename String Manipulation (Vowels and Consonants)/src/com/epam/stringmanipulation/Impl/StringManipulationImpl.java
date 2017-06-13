package com.epam.stringmanipulation.Impl;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringManipulationImpl {

	private static final String VOWELS_REGEX = "(?i)([a-z&&[aeiou]])";
	private static final String CONSONANTS_REGEX = "(?i)([a-z&&[^aeiou]])";
	private Scanner scr = new Scanner(System.in);

	public String getInput() {
		System.out.println("Enter String: ");
		return scr.nextLine();
	}

	public int countMatchesRegex(Pattern pattern, String text) {
		int count = 0;
		Matcher matcher = pattern.matcher(text);
		while (matcher.find())
			count++;
		return count;
	}

	public String[] parseText(StringBuilder text) {
		return text.toString().split("\\.");
	}

	public int vowelsMatcher(String sentence) {
		Pattern pattern = Pattern.compile(VOWELS_REGEX);
		return countMatchesRegex(pattern, sentence);
	}

	public int consonantsMatcher(String text) {
		Pattern pattern = Pattern.compile(CONSONANTS_REGEX);
		return countMatchesRegex(pattern, text);
	}

	public void comparator(int vowelsCount, int ConsonantsCount) {
		if (vowelsCount > ConsonantsCount) {
			System.out.println("No of Vowles are greater. Vowels Count : " + vowelsCount + " Consonants Count: "
					+ ConsonantsCount);
		} else if (vowelsCount < ConsonantsCount) {
			System.out.println("No of Consonants are greater. Vowels Count : " + vowelsCount + " Consonants Count: "
					+ ConsonantsCount);
		} else {
			System.out.println("No of Vowles and Consonants are equal. Vowels Count : " + vowelsCount
					+ " Consonants Count: " + ConsonantsCount);
		}

	}

}
