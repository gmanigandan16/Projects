package com.epam.stringmanipulation.Impl;

public class StringManipulationParser {
	public static String[] parseText(StringBuilder text, String splitType) {
		return text.toString().split(splitType);
	}
}
