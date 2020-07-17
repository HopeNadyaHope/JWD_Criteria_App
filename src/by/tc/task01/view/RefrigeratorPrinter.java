package by.tc.task01.view;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Refrigerator;

public class RefrigeratorPrinter implements Printer{

	public void print(Appliance appliance) {
		Refrigerator refrigerator;
		refrigerator = (Refrigerator)appliance;
		String printString;
		printString = "Refrigerator: powerConsumption=" + refrigerator.getPowerConsumption()
						+ ", weight=" + refrigerator.getWeight()
						+ ", freezerCapacity="+ refrigerator.getFreezerCapacity() 
						+ ", overallCapacity=" + refrigerator.getOverallCapacity() 
						+ ", height=" + refrigerator.getHeight()
						+ ", width=" + refrigerator.getWidth();
		System.out.println(printString);
	}	
}