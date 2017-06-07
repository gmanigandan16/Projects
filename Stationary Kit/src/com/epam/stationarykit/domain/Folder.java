package com.epam.stationarykit.domain;

public class Folder extends NonWritingItems {

	@Override
	public String name() {
		return "Folder";
	}

	@Override
	public float price() {
		return 12.5f;
	}

}
