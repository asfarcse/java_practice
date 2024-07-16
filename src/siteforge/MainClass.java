package siteforge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainClass {
	public static void main(String[] args) {
		List<DeployDashboardWrapper> wrapperList1=new ArrayList<>();
		DeployDashboardWrapper wrapperObj1 = new DeployDashboardWrapper();
		wrapperObj1.setType("User");
		wrapperObj1.setCount(10);
		wrapperObj1.setStatus("Completed");
		wrapperList1.add(wrapperObj1);
		DeployDashboardWrapper wrapperObj2 = new DeployDashboardWrapper();
		wrapperObj2.setType("Role");
		wrapperObj2.setCount(10);
		wrapperObj2.setStatus("Completed");
		wrapperList1.add(wrapperObj2);
		DeployDashboardWrapper wrapperObj3 = new DeployDashboardWrapper();
		wrapperObj3.setType("Role");
		wrapperObj3.setCount(96);
		wrapperObj3.setStatus("YetToStart");
		wrapperList1.add(wrapperObj3);
		DeployDashboardWrapper wrapperObj4 = new DeployDashboardWrapper();
		wrapperObj4.setType("Task");
		wrapperObj4.setCount(10);
		wrapperObj4.setStatus("Completed");
		wrapperList1.add(wrapperObj4);
		DeployDashboardWrapper wrapperObj5 = new DeployDashboardWrapper();
		wrapperObj5.setType("Task");
		wrapperObj5.setCount(96);
		wrapperObj5.setStatus("YetToStart");
		wrapperList1.add(wrapperObj5);
		dataForGraph(wrapperList1,"GDC");
	}
	
	private static void dataForGraph(List<DeployDashboardWrapper> wrapper, String cardType) {
		try {
			List<String> categoryList = new ArrayList<>();
			if(cardType.equalsIgnoreCase("GDC")) {
				categoryList.add("Total");
				Map<String, Integer> gdcMap = new HashMap<>();
		        for(DeployDashboardWrapper oneMap:wrapper) {
		        	String name = oneMap.getType();
	        			Integer count = 0;
	        			if(gdcMap.get(name)!=null){
	        				count = gdcMap.get(name);
	        			}
	        			count = count+(oneMap.getCount());
	        			gdcMap.put(name, count);
		        }
		        List<Map.Entry<String, Integer>> list = new ArrayList<>(gdcMap.entrySet());
		        list.sort(Collections.reverseOrder(Map.Entry.comparingByValue()));
		        for(Map.Entry<String, Integer> oneMap:list) {
		        		categoryList.add(oneMap.getKey());
		        }
			}
			Integer arraySizeList = categoryList.size();
			Integer[] arrayToUpdate = new Integer[arraySizeList];
			List<Integer> yetToStartList = new ArrayList<>(Arrays.asList(arrayToUpdate));
	        List<Integer> onTrackList = new ArrayList<>(Arrays.asList(arrayToUpdate));
	        List<Integer> completedList = new ArrayList<>(Arrays.asList(arrayToUpdate));
	        for(DeployDashboardWrapper oneMap:wrapper) {
	        	String type = oneMap.getType();
	        	Integer typeIndex = categoryList.indexOf(type);
	        	String status = oneMap.getStatus();
        		Integer count = oneMap.getCount();
        		if(status.equalsIgnoreCase("Yet_To_Start") || status.equalsIgnoreCase("YetToStart")) {
        			yetToStartList.set(typeIndex, count);
        		}
        		else if(status.equalsIgnoreCase("Completed")) {
        			completedList.set(typeIndex, count);
        		}
        		else  {
        			Integer tempCount = onTrackList.get(typeIndex);
        			tempCount = tempCount == null?0:tempCount;
        			tempCount=tempCount+count;
        			onTrackList.set(typeIndex, tempCount);
        		}
	        }
	        System.out.println("yetToStartList :: {}"+yetToStartList);
	        System.out.println("onTrackList :: {}"+onTrackList);
	        System.out.println("completedList ::{} "+completedList);
		}catch (Exception e) {
			e.getMessage();
		}
	}
}
