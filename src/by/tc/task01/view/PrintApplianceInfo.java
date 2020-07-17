package by.tc.task01.view;

import java.util.List;

import by.tc.task01.entity.Appliance;


public class PrintApplianceInfo {
	private final PrinterProvider printers = new PrinterProvider();
	
	public void print(List<Appliance> appliances) {
		if(appliances.isEmpty()) {
			System.out.println("No such appliances");
			return;
		}

		Printer printer;
		printer = printers.getPrinter(appliances.get(0).getClass().getSimpleName());
		
		for(Appliance appliance: appliances) {
			printer.print(appliance);
		}
	}	
}