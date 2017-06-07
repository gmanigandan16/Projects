package com.epam.stationarykit.domain;

public class Pin extends NonWritingItems {

	@Override
	public String name() {
		return "Pin";
	}

	@Override
	public float price() {
		return 3f;
	}

}
