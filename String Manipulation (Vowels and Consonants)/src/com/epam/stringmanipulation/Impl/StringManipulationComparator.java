package com.epam.stringmanipulation.Impl;

public class StringManipulationComparator {

	public static void comparator(int vowelsCount, int ConsonantsCount) {
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
