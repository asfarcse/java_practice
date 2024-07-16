package mapInterface;

import java.util.*;

public class IterateHashmap {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<>();
		for(int i=0;i<=5;i++) {
			map.put("key"+i, "value"+i);
		}
		System.out.println(map);
		
//		for(Map.Entry<String, String> entry:map.entrySet()) {
//			System.out.println("key is "+entry.getKey());
//			System.out.println("value is "+entry.getValue());
//		}
		
		for(Map.Entry<String, String> entry:map.entrySet()) {
			System.out.println("key is:::"+entry.getKey());
			System.out.println("value is:::"+entry.getValue());
		}
	}
}
