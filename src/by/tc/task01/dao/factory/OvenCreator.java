package by.tc.task01.dao.factory;

import java.util.List;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Oven;

public class OvenCreator implements ApplianceCreator {
	
	@Override
	public Appliance create(String line) {
		
		Parser parser = Parser.getInstance();
		List<String> parameters = parser.getParameters(line);
		
		Oven oven = new Oven();
		
		oven.setPowerConsumption(Integer.parseInt(parameters.get(0)));
		oven.setWeight(Double.parseDouble(parameters.get(1)));
		oven.setCapacity(Integer.parseInt(parameters.get(2)));
		oven.setDepth(Double.parseDouble(parameters.get(3)));	
		oven.setHeight(Double.parseDouble(parameters.get(4)));
		oven.setWidth(Double.parseDouble(parameters.get(5)));	
		
		return oven;
	}
}
