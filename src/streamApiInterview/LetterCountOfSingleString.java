package streamApiInterview;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LetterCountOfSingleString {
	public static void main(String[] args) {
		
		List<String> strList = Arrays.asList("apple".split(""));
		Map<String, Long> collect = strList.stream().filter(p->Collections.frequency(strList, p)>0).collect(Collectors.groupingBy(p->p,LinkedHashMap::new,Collectors.counting()));
		System.out.println(collect);

	}
}
