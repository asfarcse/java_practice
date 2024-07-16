package failFastAndFailSafe;

import java.util.HashMap;
import java.util.Map;

//Hashmap is failFast
public class FailFast {
	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.put(4, "four");
		map.put(null, null);
		
		for(Map.Entry<Integer, String> entry:map.entrySet()) {
			map.put(5, "five"); //this will throw concurrentModificationError
			System.out.println("key:::"+entry.getKey()+"--->Value:::"+entry.getValue());
		}
	}
}
