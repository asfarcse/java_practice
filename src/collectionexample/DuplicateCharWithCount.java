package collectionexample;

import java.util.HashMap;
import java.util.Map;

class GetCharWithCount {
	public static Map<Character, Integer> getCharWithCount(String str) {
		char[] charArray = str.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for (Character c : charArray) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
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
