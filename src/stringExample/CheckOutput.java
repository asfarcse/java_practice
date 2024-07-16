package stringExample;

import java.util.HashMap;

public class CheckOutput {
	public static void main(String[] args) {
		HashMap<String, Integer> hashmap = new HashMap<>();
		hashmap.put("asfar", 2014);
		hashmap.put("Asfar", 2014);
		hashmap.put("AsfaR", 2014);
		
		System.out.println(hashmap);
	}
}
