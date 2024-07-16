package stringExample;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {
	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("pwwkew"));
	}
	
	public static int lengthOfLongestSubstring(String str) {
		Map<Character, Integer> map = new HashMap<>();
		int maxLength = 0;
		int start = 0;
		for(int end=0;end<str.length();end++) {
			char rightChar = str.charAt(end);
			if(map.containsKey(rightChar)) {
				start = Math.max(start, map.get(rightChar)+1);
			}
			map.put(rightChar, end);
			maxLength = Math.max(maxLength, end-start+1);
		}
		return maxLength;
	}
}
