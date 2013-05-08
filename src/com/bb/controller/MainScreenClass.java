package com.bb.controller;

import net.rim.device.api.system.Bitmap;
import net.rim.device.api.ui.Color;
import net.rim.device.api.ui.Field;
import net.rim.device.api.ui.XYEdges;
import net.rim.device.api.ui.container.MainScreen;
import net.rim.device.api.ui.container.VerticalFieldManager;
import net.rim.device.api.ui.decor.BackgroundFactory;
import net.rim.device.api.ui.decor.Border;
import net.rim.device.api.ui.decor.BorderFactory;

import com.bb.customFields.CustomTitlebar;

public class MainScreenClass extends MainScreen {
	
	protected Border roundedBorder;

	public MainScreenClass() {		
		
		Bitmap borderBitmap = Bitmap.getBitmapResource("rounded-border.png");
		XYEdges padding = new XYEdges(12, 12, 12, 12);
		roundedBorder = BorderFactory.createBitmapBorder(padding, borderBitmap);
		
		this.getMainManager().setBackground(
				BackgroundFactory.createLinearGradientBackground(0x00FFFFFF, 0x00FFFFFF, 0x00219AF7, 0x0095C9F8));
		
		VerticalFieldManager vfm = new VerticalFieldManager(USE_ALL_WIDTH);

		Bitmap titleBitmap = Bitmap.getBitmapResource("logo.PNG");
		
		CustomTitlebar titleBarField = new CustomTitlebar("", Color.WHITE, 0x000072BC, titleBitmap, Field.USE_ALL_WIDTH);
		vfm.add(titleBarField);		
		setTitle(vfm);		
	}
}
