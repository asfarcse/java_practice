package interviewAsked;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**Asked in Access Infinity Hyderabad*/
public class DuplicateWord {
	public static void main(String[] args) {
		String str= "asfar mohd asfar mohd";
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
