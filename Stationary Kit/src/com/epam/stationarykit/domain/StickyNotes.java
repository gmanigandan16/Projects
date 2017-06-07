package com.epam.stationarykit.domain;

public class StickyNotes extends NonWritingItems {

	@Override
	public String name() {
		return "Sticky Notes";
	}

	@Override
	public float price() {
		return 5f;
	}
}
