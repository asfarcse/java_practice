package main;

import java.util.HashSet;
import java.util.Set;

public class GetNextDays {
	public static void main(String[] args) {
		Set<String> dateSet = new HashSet<>();
		String str = "2023-03-25=Non_Working_Day, 2023-03-12=Non_Working_Day, 2023-03-11=Non_Working_Day, 2023-03-18=Non_Working_Day, 2023-03-05=Non_Working_Day, 2023-03-04=Non_Working_Day, 2023-03-26=Non_Working_Day, 2023-03-19=Non_Working_Day";
		String[] arr = str.toString().replace("{", "").replace("}", "").split("=");
//		for (String obj : arr) {
//			String[] newArr = obj.split("=");
//			dateSet.add(newArr[0]);
//		}
		
		System.out.println(dateSet);
	}
}
