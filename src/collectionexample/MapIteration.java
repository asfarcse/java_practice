package collectionexample;

import java.util.HashMap;
import java.util.Map;

public class MapIteration {
	public static void main(String[] args) {
		Map<String, Integer> myMap = new HashMap<>();
		myMap.put("key1", 100);
		myMap.put("key2", 200);

		for (Map.Entry<String, Integer> entry : myMap.entrySet()) {
		    String key = entry.getKey();
		    Integer value = entry.getValue();
		    System.out.println(key + " = " + value);
		}

	}

}
