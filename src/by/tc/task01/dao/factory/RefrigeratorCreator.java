package by.tc.task01.dao.factory;

import java.util.List;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Refrigerator;

public class RefrigeratorCreator implements ApplianceCreator{
	
	@Override
	public Appliance create(String line) {
		
		Parser parser = Parser.getInstance();
		List<String> parameters = parser.getParameters(line);
		
		Refrigerator refrigerator = new Refrigerator();
		
		refrigerator.setPowerConsumption(Integer.parseInt(parameters.get(0)));
		refrigerator.setWeight(Double.parseDouble(parameters.get(1)));
		refrigerator.setFreezerCapacity(Double.parseDouble(parameters.get(2)));
		refrigerator.setOverallCapacity(Double.parseDouble(parameters.get(3)));
		refrigerator.setHeight(Double.parseDouble(parameters.get(4)));
		refrigerator.setWidth(Double.parseDouble(parameters.get(5)));	
		
		return refrigerator;
	}
}