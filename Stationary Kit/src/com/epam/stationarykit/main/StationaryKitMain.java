package com.epam.stationarykit.main;

import com.epam.stationarykit.kit.Kit;
import com.epam.stationarykit.kit.KitBuilder;

public class StationaryKitMain {

	public static void main(String[] args) {
		KitBuilder kitBuilder = new KitBuilder();
		Kit starterKit = kitBuilder.starterKit();
		System.out.println("Starter Kit: ");
		starterKit.showItems();
		System.out.println("Total Cost: " + starterKit.getCost());

		System.out.println("\nAfter sorting by Name: ");
		starterKit.sortByName();
		starterKit.showItems();

		System.out.println("\nAfter sorting by Price: ");
		starterKit.sortByPrice();
		starterKit.showItems();

		Kit expertKit = kitBuilder.expertKit();
		System.out.println("\n\nExpert Kit: ");
		expertKit.showItems();
		System.out.println("Total Cost: " + expertKit.getCost());

		System.out.println("\nAfter sorting by Name: ");
		expertKit.sortByName();
		expertKit.showItems();

		System.out.println("\nAfter sorting by Price: ");
		expertKit.sortByPrice();
		expertKit.showItems();

	}
}
