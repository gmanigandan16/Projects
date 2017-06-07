package com.epam.stationarykit.comparators;

import java.util.Comparator;

import com.epam.stationarykit.domain.StationaryItems;

public class PriceComparator implements Comparator<StationaryItems> {

	@Override
	public int compare(StationaryItems item1, StationaryItems item2) {
		return (int) (item1.price() - item2.price());
	}

}
