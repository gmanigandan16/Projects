package com.epam.stationarykit.domain;

public class File extends NonWritingItems {

	@Override
	public String name() {
		return "File";
	}

	@Override
	public float price() {
		return 15f;
	}

}
