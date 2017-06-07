package com.epam.stationarykit.domain;

public class Pencil extends WritingItems {

	@Override
	public String name() {
		return "Pencil";
	}

	@Override
	public float price() {
		return 4f;
	}
}
