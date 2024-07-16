package stringExample;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurencesOfWord {
	public static void main(String[] args) {
		Map<String, Long> result = new HashMap<>();
		String str = "welcome to code decode and code decode welcome you";
		result = findOccurrences(str);
		System.out.println("result findOccurrences:::"+result);
		
		result = findOccurrencesUsingStream(str);
		System.out.println("result findOccurrencesUsingStream:::"+result);
	}
	
	private static Map<String, Long> findOccurrencesUsingStream(String str) {
		List<String> strList = Arrays.asList(str.split(" "));
		return strList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	}

	public static Map<String,Long> findOccurrences(String str) {
		String[] wordArray = str.split(" ");
		Map<String,Long> map = new HashMap<>();
		for(String word:wordArray) {
			if(!map.containsKey(word)) {
				map.put(word, (long) 1);
			} else {
				map.put(word,map.get(word)+1);
			}
		}
		return map;
	}
}
