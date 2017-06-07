package com.epam.stationarykit.domain;

public class Pen extends WritingItems {

	@Override
	public String name() {
		return "Pen";
	}

	@Override
	public float price() {
		return 10f;
	}

}
