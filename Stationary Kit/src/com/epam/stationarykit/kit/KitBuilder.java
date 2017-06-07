package com.epam.stationarykit.kit;

import com.epam.stationarykit.domain.File;
import com.epam.stationarykit.domain.Folder;
import com.epam.stationarykit.domain.Marker;
import com.epam.stationarykit.domain.Pen;
import com.epam.stationarykit.domain.Pencil;
import com.epam.stationarykit.domain.Pin;
import com.epam.stationarykit.domain.StaplerWithClips;
import com.epam.stationarykit.domain.StickyNotes;

public class KitBuilder {

	public Kit starterKit() {
		Kit starterKit = new Kit();
		starterKit.addItem(new Pen());
		starterKit.addItem(new Pencil());
		starterKit.addItem(new File());
		starterKit.addItem(new StickyNotes());
		starterKit.addItem(new Pin());
		return starterKit;
	}

	public Kit expertKit() {
		Kit expertKit = new Kit();
		expertKit.addItem(new Pen());
		expertKit.addItem(new Marker());
		expertKit.addItem(new StickyNotes());
		expertKit.addItem(new Folder());
		expertKit.addItem(new StaplerWithClips());
		expertKit.addItem(new File());
		return expertKit;
	}
}
