package com.epam.stringmanipulation.main;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConsoleApp {
	private static final String VOWELS_REGEX = "(?i)([a-z&&[aeiou]])";
	private static final String CONSONANTS_REGEX = "(?i)([a-z&&[^aeiou]])";
	private static final String SPLIT_TYPE_PERIOD = "\\.";
	private static Scanner scr = new Scanner(System.in);

	public static void main(String[] args) {

		int vowelsCount = 0;
		int ConsonantsCount = 0;
		String[] sentences = null;
		StringBuilder text;
		Pattern regexPattern;
		ConsoleApp consoleApplication = new ConsoleApp();

		text = new StringBuilder(consoleApplication.getInputFromConsole());
		if (text.length() > 0) {
			sentences = consoleApplication.parseText(text, SPLIT_TYPE_PERIOD);
			for (String sentence : sentences) {
				System.out.println("In sentence : " + sentence);
				regexPattern = consoleApplication.patternCreator(VOWELS_REGEX);
				vowelsCount = consoleApplication.countWordsMatchesRegex(regexPattern, sentence);
				regexPattern = consoleApplication.patternCreator(CONSONANTS_REGEX);
				vowelsCount = consoleApplication.countWordsMatchesRegex(regexPattern, sentence);

				consoleApplication.compareVowelsAndConsonantsCount(vowelsCount, ConsonantsCount);
			}
		} else {
			System.out.println("Entered String is Empty");
		}
	}

	public void compareVowelsAndConsonantsCount(int vowelsCount, int ConsonantsCount) {
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

	public int countWordsMatchesRegex(Pattern pattern, String text) {
		int count = 0;
		Matcher matcher = pattern.matcher(text);
		while (matcher.find())
			count++;
		return count;
	}

	public String getInputFromConsole() {
		System.out.println("Enter String: ");
		return scr.nextLine();
	}

	public Pattern patternCreator(String regexType) {
		return Pattern.compile(regexType);
	}

	public String[] parseText(StringBuilder text, String splitType) {
		return text.toString().split(splitType);
	}
}
