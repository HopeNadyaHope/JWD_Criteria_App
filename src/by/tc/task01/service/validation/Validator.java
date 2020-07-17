package by.tc.task01.service.validation;

import java.util.Map;

import by.tc.task01.dao.factory.GroupName;
import by.tc.task01.entity.criteria.Criteria;

public class Validator {
	
	public static boolean criteriaValidator(Criteria criteria) {
		GroupName type;
		try {
			type = GroupName.valueOf(criteria.getGroupSearchName().toUpperCase());
		}catch(Exception e) {
			return false;
		}
		return ValidateParametres(criteria); 
	}

	private static boolean ValidateParametres(Criteria criteria) {
		Map<String,Object> criteriaMap = criteria.getCriteriaMap();		
		for(String key: criteriaMap.keySet()) {
			if(criteriaMap.get(key) == null) {
				return false;
			}
		}
		return true;
	}	
}