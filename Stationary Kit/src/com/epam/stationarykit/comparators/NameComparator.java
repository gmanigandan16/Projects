package com.epam.stationarykit.comparators;

import java.util.Comparator;

import com.epam.stationarykit.domain.StationaryItems;

public class NameComparator implements Comparator<StationaryItems> {
	public int compare(StationaryItems item1, StationaryItems item2) {
		return item1.name().compareTo(item2.name());
	}
}
