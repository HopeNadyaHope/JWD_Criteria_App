package by.tc.task01.view;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;

public class LaptopPrinter implements Printer{

	public void print(Appliance app) {
		Laptop laptop;
		laptop = (Laptop)app;
		String printString;
		printString = "Laptop: batteryCapacity=" + laptop.getBatteryCapacity()
						+ ", OS=" + laptop.getOS()
						+ ", memoryROM=" + laptop.getMemoryROM()
						+ ", systemMemory=" + laptop.getSystemMemory()
						+ ", SPU=" + laptop.getSPU()
						+ ", displayInch=" + laptop.getDisplayInch();
		System.out.println(printString);
		
	}
}