package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import siteforge.DeployDashboardWrapper;

public class Main {
	public static void main(String[] args) {
		List<String> categoryList = new ArrayList<>();
			categoryList.add("Total");
			Map<String, Integer> gdcMap = new HashMap<>();
//	        for(DeployDashboardWrapper oneMap:wrapper) {
//	        		String name = oneMap.getType();
//	        		if(StringUtils.isNotBlank(name)) {
//	        			Integer count = 0;
//	        			if(gdcMap.get(name)!=null){
//	        				count = gdcMap.get(name);
//	        			}
//	        			count = count+(oneMap.getCount());
//	        			gdcMap.put(name, count);
//	        		}
//	        	}
	        List<Map.Entry<String, Integer>> list = new ArrayList<>(gdcMap.entrySet());
	        list.sort(Collections.reverseOrder(Map.Entry.comparingByValue()));
	        for(Map.Entry<String, Integer> oneMap:list) {
	        		categoryList.add(oneMap.getKey());
	        }
	}
}

