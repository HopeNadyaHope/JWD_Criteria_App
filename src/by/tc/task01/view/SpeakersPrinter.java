package by.tc.task01.view;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Speakers;

public class SpeakersPrinter implements Printer {
	
	public void print(Appliance appliance) {
		Speakers speakers;
		speakers = (Speakers)appliance;
		String printString;
		printString = "Speakers: powerConsumption=" + speakers.getPowerConsumption()
						+ ", numberOfSpeakers=" + speakers.getNumberOfSpeakers()
						+ ", frequencyRange=" + speakers.getFrequencyRange()
						+ ", cordLength=" + speakers.getCordLength();
		System.out.println(printString);
	}
}