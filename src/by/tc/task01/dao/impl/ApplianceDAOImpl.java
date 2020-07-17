package by.tc.task01.dao.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.DAOException;
import by.tc.task01.dao.factory.ApplianceCreator;
import by.tc.task01.dao.factory.ApplianceCreatorProvider;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

public class ApplianceDAOImpl implements ApplianceDAO{

	@Override
	public List<Appliance> find(Criteria criteria) throws DAOException {
		FileReader fr;
		try {
			fr = new FileReader(System.getProperty("user.dir") + "\\resources\\appliances_db.txt");
		}catch (FileNotFoundException e){
			throw new DAOException(e);
		}
		
		BufferedReader reader = new BufferedReader(fr);   
		
		List<Appliance> appliances = new ArrayList<Appliance>();    	
		Appliance appliance;
    	
		String line;
    	
		String searchName;
		searchName = criteria.getGroupSearchName(); 
    	
		ApplianceCreatorProvider provider = ApplianceCreatorProvider.getInstance();
		ApplianceCreator creator =  provider.getCreator(searchName);
    	
		try {
			while((line = reader.readLine()) != null) {
				if( (line.contains(searchName)) && (match(line, criteria.getCriteriaMap()))) {    				
					appliance = creator.create(line);
					appliances.add(appliance);				
				}
			}
		}catch( IOException e) {
			throw new DAOException(e);
		}finally {
			if(reader != null) {
				try {
					reader.close();
				}catch (IOException e) {
					//log-err
					System.err.println(e);
				}
			}		
		}
		
		return appliances;
	}
	
	////////////////////////////////////////////////////////////
	
	private boolean match(final String line, Map<String,Object> criteria) {
		String lineForSearch;
		lineForSearch = (line.trim() + ",").toUpperCase();
		String findCriteria;
		for (String key : criteria.keySet()) {       
	        findCriteria = (key + "=" + criteria.get(key) + ",").toUpperCase();
	        if(!(lineForSearch.contains(findCriteria))) {
	        	return false;
	        }
		}
		
		return true;
	}
}