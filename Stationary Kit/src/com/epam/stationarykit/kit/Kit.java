package com.epam.stationarykit.kit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.epam.stationarykit.comparators.NameComparator;
import com.epam.stationarykit.comparators.PriceComparator;
import com.epam.stationarykit.domain.StationaryItems;

public class Kit {
	private List<StationaryItems> items = new ArrayList<>();

	public void addItem(StationaryItems item) {
		items.add(item);
	}

	public float getCost() {
		float cost = 0.0f;
		for (StationaryItems item : items) {
			cost += item.price();
		}
		return cost;
	}

	public void sortByName() {
		Collections.sort(items, new NameComparator());
	}

	public void sortByPrice() {
		Collections.sort(items, new PriceComparator());
	}

	public void showItems() {
		for (StationaryItems item : items) {
			System.out.print("Item : " + item.name());
			System.out.print(", Type : " + item.typeOfItem());
			System.out.println(", Price : " + item.price());
		}
	}
}
