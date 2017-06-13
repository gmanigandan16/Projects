package com.epam.stringmanipulation.main;

import com.epam.stringmanipulation.Impl.StringManipulationImpl;

public class ConsoleApp {

	public static void main(String[] args) {
		int vowelsCount = 0;
		int ConsonantsCount = 0;
		String[] sentences = null;
		StringBuilder text;
		StringManipulationImpl smi = new StringManipulationImpl();
		text = new StringBuilder(smi.getInput());
		if (text.length() > 0) {
			sentences = smi.parseText(text);
			for (String sentence : sentences) {
				System.out.println("In sentence : " + sentence);
				vowelsCount = smi.vowelsMatcher(sentence);
				ConsonantsCount = smi.consonantsMatcher(sentence);
				smi.comparator(vowelsCount, ConsonantsCount);
			}
		} else {
			System.out.println("Entered String is Empty");
		}
	}
}
