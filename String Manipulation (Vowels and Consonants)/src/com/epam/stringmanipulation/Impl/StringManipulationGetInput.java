package com.epam.stringmanipulation.Impl;

import java.util.Scanner;

public class StringManipulationGetInput {

	private static Scanner scr = new Scanner(System.in);

	public static String getInputFromConsole() {
		System.out.println("Enter String: ");
		return scr.nextLine();
	}
}
