package interviewQuestion;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateWords {
	public static void main(String[] args) {
		String str = "welcome to asfar world and asfar welcome you";
//		List<String> list = Arrays.asList(str.split(" "));
//		Map<String,Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//		System.out.println(map);
		String[] strArray = str.split(" ");
		Map<String,Integer> map = new HashMap<>();
		for(String strr:strArray) {
			if(!map.containsKey(strr)) {
				map.put(strr,1);
			} else {
				map.put(strr, map.get(strr)+1);
			}
		}
		System.out.println(map);
	}
}
