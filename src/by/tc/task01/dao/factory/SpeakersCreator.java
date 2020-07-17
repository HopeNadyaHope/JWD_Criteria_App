package by.tc.task01.dao.factory;

import java.util.List;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Speakers;

public class SpeakersCreator implements ApplianceCreator {

	@Override
	public Appliance create(String line) {
		
		Parser parser = Parser.getInstance();
		List<String> parameters = parser.getParameters(line);
		
		Speakers speakers  = new Speakers();
		
		speakers.setPowerConsumption(Integer.parseInt(parameters.get(0)));
		speakers.setNumberOfSpeakers(Integer.parseInt(parameters.get(1)));
		speakers.setFrequencyRange(parameters.get(2));	
		speakers.setCordLength(Double.parseDouble(parameters.get(3)));
		
		return speakers;
	}
}
	
