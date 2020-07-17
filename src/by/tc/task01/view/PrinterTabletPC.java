package by.tc.task01.view;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.TabletPC;

public class PrinterTabletPC implements Printer{

	public void print(Appliance appliance) {
		TabletPC tabletPC;
		tabletPC = (TabletPC)appliance;
		String printString;
		printString = "TabletPC: batteryCapacity=" + tabletPC.getBatteryCapacity()
						+ ", displayInch=" + tabletPC.getDisplayInch() 
						+ ", memoryROM=" + tabletPC.getMemoryROM() 
						+ ", flashMemoryCapacity=" + tabletPC.getFlashMemoryCapacity()
						+ ", color=" + tabletPC.getColor();
		System.out.println(printString);
	}
}