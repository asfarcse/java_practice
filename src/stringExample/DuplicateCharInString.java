package stringExample;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicateCharInString {
	public static void main(String[] args) {
		String str= "asfar asfar rashid rashid";
		Map<String,Integer> map = new HashMap<>();
		List<String> nameList = Arrays.asList(str.split(" "));
		for(String charr:nameList) {
			if(!map.containsKey(charr)) {
				map.put(charr, 1);
			} else{
				map.put(charr, map.get(charr)+1);
			}
		}
		System.out.println(map);
	}
}
