package impetus;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SpecialCharSplit {
	public static void main(String[] args) {
		String str = "Tarun.1{Sumit.2{Ankit.3";
		String[] split = str.split("\\{");
		
		System.out.println("split::::"+Arrays.toString(split));
		
		Map<String,String> map = new HashMap<>();
		for(String strr:split) {
			String[] keyValue = strr.split("\\.");
			System.out.println("check key and value:::"+Arrays.toString(keyValue));
			map.put(keyValue[0], keyValue[1]);
		}
		
		System.out.println(map);
	}
}
