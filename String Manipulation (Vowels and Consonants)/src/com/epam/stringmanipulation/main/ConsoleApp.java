package com.epam.stringmanipulation.main;

import com.epam.stringmanipulation.Impl.StringManipulationGetInput;
import com.epam.stringmanipulation.Impl.StringManipulationComparator;
import com.epam.stringmanipulation.Impl.StringManipulationMatcherImpl;
import com.epam.stringmanipulation.Impl.StringManipulationParser;

public class ConsoleApp {
	private static final String VOWELS_REGEX = "(?i)([a-z&&[aeiou]])";
	private static final String CONSONANTS_REGEX = "(?i)([a-z&&[^aeiou]])";
	private static final String SPLIT_TYPE_PERIOD = "\\.";

	public static void main(String[] args) {
		int vowelsCount = 0;
		int ConsonantsCount = 0;
		String[] sentences = null;
		StringBuilder text;
		text = new StringBuilder(StringManipulationGetInput.getInputFromConsole());
		if (text.length() > 0) {
			sentences = StringManipulationParser.parseText(text, SPLIT_TYPE_PERIOD);
			for (String sentence : sentences) {
				System.out.println("In sentence : " + sentence);
				vowelsCount = StringManipulationMatcherImpl.Matcher(sentence, VOWELS_REGEX);
				ConsonantsCount = StringManipulationMatcherImpl.Matcher(sentence, CONSONANTS_REGEX);
				StringManipulationComparator.comparator(vowelsCount, ConsonantsCount);
			}
		} else {
			System.out.println("Entered String is Empty");
		}
	}
}
