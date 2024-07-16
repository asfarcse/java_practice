package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatChar {
	public static void main(String[] args) {
		String str = "aabbccdef";
		findFirstNonRepeatchar(str);
		
		List<String> asList = Arrays.asList(str.split(""));
		List<String> collect = asList.stream()
			.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
				.entrySet()
					.stream()
						.filter(p->p.getValue() == 1)
							.limit(1)
								.map(p->p.getKey())
									.collect(Collectors.toList());
		System.out.println("collect:::::::"+collect);
	}

	private static void findFirstNonRepeatchar(String str) {
		Map<Character,Integer> map = new LinkedHashMap<>();
		for(Character ch:str.toCharArray()) {
			if(!map.containsKey(ch)) {
				map.put(ch, 1);
			} else {
				map.put(ch, map.get(ch)+1);
			}
		}
		
		for(Map.Entry<Character, Integer> entry:map.entrySet()) {
			if(entry.getValue() == 1) {
				System.out.println(entry.getKey());
				break;
			}
		}
	}
}
