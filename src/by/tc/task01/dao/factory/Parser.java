package by.tc.task01.dao.factory;

import java.util.ArrayList;
import java.util.List;

public class Parser {

	private static final Parser instance = new Parser();
	
	private Parser() {}
	
	public static Parser getInstance() {
		return instance;
	}
	
	public List<String> getParameters(String line){
		List<String> parameters = new ArrayList<String>();
		
		int start;
		int end;
		start = line.indexOf("=");
		end = line.indexOf(",");
		
		while(end != -1) {
			parameters.add(line.substring(start + 1, end));
			start = line.indexOf("=",end + 1);
			end = line.indexOf(",", end + 1);
		}
		
		end = line.length();
		parameters.add(line.substring(start + 1, end));
		
		return parameters;
	}	
}