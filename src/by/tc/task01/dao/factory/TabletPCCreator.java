package by.tc.task01.dao.factory;

import java.util.List;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.TabletPC;

public class TabletPCCreator implements ApplianceCreator {

	@Override
	public Appliance create(String line) {
		
		Parser parser = Parser.getInstance();
		List<String> parameters = parser.getParameters(line);
		
		TabletPC tabletPC = new TabletPC();
		
		tabletPC.setBatteryCapacity(Double.parseDouble(parameters.get(0)));
		tabletPC.setDisplayInch(Double.parseDouble(parameters.get(1)));
		tabletPC.setMemoryROM (Integer.parseInt(parameters.get(2)));
		tabletPC.setFlashMemoryCapacity(Integer.parseInt(parameters.get(3)));
		tabletPC.setColor(parameters.get(4));
		
		return tabletPC;
	}
}
