package by.tc.task01.dao.factory;

import java.util.List;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.VacuumCleaner;

public class VacuumCleanerCreator implements ApplianceCreator {

	@Override
	public Appliance create(String line) {
		
		Parser parser = Parser.getInstance();
		List<String> parameters = parser.getParameters(line);
		
		VacuumCleaner vacuumCleaner = new VacuumCleaner();
		
		vacuumCleaner.setPowerConsumption(Integer.parseInt(parameters.get(0)));
		vacuumCleaner.setFilterType(parameters.get(1));		
		vacuumCleaner.setBagType(parameters.get(2));
		vacuumCleaner.setWandType(parameters.get(3));	
		vacuumCleaner.setMotorSpeedRegulation(Integer.parseInt(parameters.get(4)));
		vacuumCleaner.setCleaningWidth(Double.parseDouble(parameters.get(5)));
		
		return vacuumCleaner;
	}
}
