package by.tc.task01.view;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Oven;

public class OvenPrinter implements Printer {
	public void print(Appliance appliance) {
		Oven oven = (Oven)appliance;
		String printString;
		printString = "Oven: powerConsumption=" + oven.getPowerConsumption()
						+ ", weight=" + oven.getWeight()
						+ ", capacity=" + oven.getCapacity()
						+ ", depth=" + oven.getDepth()
						+ ", height=" + oven.getHeight()
						+ ", width=" + oven.getWidth();
		System.out.println(printString);
	}
}