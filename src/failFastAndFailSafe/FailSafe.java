package failFastAndFailSafe;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafe {
	public static void main(String[] args) {
		Map<Integer,String> map = new ConcurrentHashMap<>();
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.put(4, "four");
//		map.put(null, null);
		
		for(Map.Entry<Integer, String> entry:map.entrySet()) {
			map.put(5, "five");
			System.out.println(entry);
			System.out.println("key:::"+entry.getKey()+"--->Value:::"+entry.getValue());
		}
	}
}
