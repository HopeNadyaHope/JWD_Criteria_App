package by.tc.task01.dao.factory;

import java.util.List;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;

public class LaptopCreator implements ApplianceCreator{

	@Override
	public Appliance create(String line) {
		
		Parser parser = Parser.getInstance();
		List<String> parameters = parser.getParameters(line);
		
		Laptop laptop = new Laptop();
		
		laptop.setBatteryCapacity(Double.parseDouble(parameters.get(0)));
		laptop.setOS(parameters.get(1));
		laptop.setMemoryROM(Integer.parseInt(parameters.get(2)));
		laptop.setSystemMemory(Integer.parseInt(parameters.get(3)));
		laptop.setSPU(Double.parseDouble(parameters.get(4)));
		laptop.setDisplayInch(Double.parseDouble(parameters.get(5)));
		
		return laptop;
	}
}