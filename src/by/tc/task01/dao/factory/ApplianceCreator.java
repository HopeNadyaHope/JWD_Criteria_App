package by.tc.task01.dao.factory;

import by.tc.task01.entity.Appliance;

public interface ApplianceCreator {
	
	Appliance create(String line);
}