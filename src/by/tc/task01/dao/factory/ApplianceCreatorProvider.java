package by.tc.task01.dao.factory;

import java.util.HashMap;
import java.util.Map;

public class ApplianceCreatorProvider {
	
	private static final ApplianceCreatorProvider instance = new ApplianceCreatorProvider();	
	private Map<GroupName, ApplianceCreator> creators  = new HashMap<GroupName, ApplianceCreator>();
	
	public static ApplianceCreatorProvider getInstance() {
		return instance;
	}
	
	public ApplianceCreatorProvider() {
		creators.put(GroupName.OVEN, new OvenCreator());
		creators.put(GroupName.LAPTOP, new LaptopCreator());
		creators.put(GroupName.REFRIGERATOR, new RefrigeratorCreator());
		creators.put(GroupName.VACUUMCLEANER, new VacuumCleanerCreator());
		creators.put(GroupName.TABLETPC, new TabletPCCreator());
		creators.put(GroupName.SPEAKERS, new SpeakersCreator());
	}

	public ApplianceCreator getCreator(String type) {
		GroupName typeName;
		typeName = GroupName.valueOf(type.toUpperCase());
		
		ApplianceCreator creator;
		creator = creators.get(typeName);
		
		return creator;
	}	
}