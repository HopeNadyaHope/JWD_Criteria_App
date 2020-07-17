package by.tc.task01.view;

import java.util.HashMap;
import java.util.Map;

import by.tc.task01.dao.factory.GroupName;

public class PrinterProvider {

	private Map<GroupName, Printer> printers = new HashMap<GroupName, Printer>();
	
	public PrinterProvider() {
		printers.put(GroupName.OVEN, new OvenPrinter());
		printers.put(GroupName.LAPTOP, new LaptopPrinter());
		printers.put(GroupName.REFRIGERATOR, new RefrigeratorPrinter());
		printers.put(GroupName.VACUUMCLEANER, new VacuumCleanerPrinter());
		printers.put(GroupName.TABLETPC, new PrinterTabletPC());
		printers.put(GroupName.SPEAKERS, new SpeakersPrinter());
	}
	
	public Printer getPrinter(String type) {
		GroupName typeName;
		typeName = GroupName.valueOf(type.toUpperCase());
		
		Printer printer;
		printer = printers.get(typeName);
		
		return printer;
	}
}