package com.subd.pharmacy;

import org.eclipse.swt.widgets.Display;

public class MainClass {

	public static void main(String[] args) {

		Display display = new Display();
		
		DrawGUIInformationScreen infoScreenGUI = new DrawGUIInformationScreen(display);
		
		display.dispose();
		
	}

}
