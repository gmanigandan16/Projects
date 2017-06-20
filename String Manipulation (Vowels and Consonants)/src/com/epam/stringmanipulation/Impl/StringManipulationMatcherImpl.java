package com.epam.stringmanipulation.Impl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringManipulationMatcherImpl {

	public static int countMatchesRegex(Pattern pattern, String text) {
		int count = 0;
		Matcher matcher = pattern.matcher(text);
		while (matcher.find())
			count++;
		return count;
	}

	public static int Matcher(String sentence, String regexType) {
		Pattern pattern = Pattern.compile(regexType);
		return countMatchesRegex(pattern, sentence);
	}

}
