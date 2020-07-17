package by.tc.task01.main;

import static by.tc.task01.entity.criteria.SearchCriteria.*;

import java.util.List;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceException;
import by.tc.task01.service.ServiceFactory;
import by.tc.task01.view.PrintApplianceInfo;

public class Main {

	public static void main(String[] args) throws Exception {		
		List<Appliance> appliances;

		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();
		
		PrintApplianceInfo printer = new PrintApplianceInfo();

		//////////////////////////////////////////////////////////////////

		Criteria criteriaOven = new Criteria(Oven.class.getSimpleName());
		criteriaOven.add(Oven.POWER_CONSUMPTION.toString(), 2000);

		try {
			appliances = service.find(criteriaOven);
			printer.print(appliances);
		}catch(ServiceException e) {
			System.err.println("Something went wrong");
		}
	
		//////////////////////////////////////////////////////////////////

		criteriaOven = new Criteria(Oven.class.getSimpleName());
		criteriaOven.add(Oven.HEIGHT.toString(), 45.5);
		criteriaOven.add(Oven.DEPTH.toString(), 60);

		try {
			appliances = service.find(criteriaOven);
			printer.print(appliances);
		}catch(ServiceException e) {
			System.err.println("Something went wrong");
		}

		//////////////////////////////////////////////////////////////////
	
		Criteria criteriaTabletPC = new Criteria(TabletPC.class.getSimpleName());
		criteriaTabletPC.add(TabletPC.COLOR.toString(), "BLUE");
		criteriaTabletPC.add(TabletPC.DISPLAY_INCHES.toString(), 14);
		criteriaTabletPC.add(TabletPC.MEMORY_ROM.toString(), 8000);

		try {
			appliances = service.find(criteriaTabletPC);
			printer.print(appliances);
		}catch(ServiceException e) {
			System.err.println("Something went wrong");
		}
	}
}