package collectionexample;

import java.util.HashMap;
import java.util.Map;

class GetCharWithCount {
	public static Map<Character, Integer> getCharWithCount(String str) {
		HashMap<Character, Integer> map = new HashMap<>();
		for(Character ch:str.toCharArray()) {
			if(!map.containsKey(ch)) {
				map.put(ch, 1);
			} else {
				map.put(ch,map.get(ch)+1);
			}
		}
		return map;
	}
}

public class DuplicateCharWithCount extends GetCharWithCount {
	public static void main(String[] args) {
		String str = "aacdcdeea";
		Map<Character, Integer> map = GetCharWithCount.getCharWithCount(str);
		System.out.println(map);
//		DuplicateCharWithCount duplicateCharWithCount = new DuplicateCharWithCount();
//		Map<Character, Integer> map1 = duplicateCharWithCount.getCharWithCount("asfar");
//		System.out.println(map1);
	}
}
