package by.tc.task01.view;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.VacuumCleaner;

public class VacuumCleanerPrinter implements Printer{

	public void print(Appliance appliance) {
		VacuumCleaner vacuumCleaner;
		vacuumCleaner = (VacuumCleaner)appliance;
		String printString;
		printString = "VacuumCleaner: powerConsumption=" + vacuumCleaner.getPowerConsumption()
						+ ", filterType=" + vacuumCleaner.getFilterType() 
						+ ", bagType=" + vacuumCleaner.getBagType()
						+ ", wandType=" + vacuumCleaner.getWandType()
						+ ", motorSpeedRegulation=" + vacuumCleaner.getMotorSpeedRegulation()
						+ ", cleaningWidth=" + vacuumCleaner.getCleaningWidth();
		System.out.println(printString);
	}
}