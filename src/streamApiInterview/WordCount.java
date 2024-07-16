package streamApiInterview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordCount {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("asfar","moazzam","asfar","mehdi");
		Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(p->p,Collectors.counting()));
		System.out.println(collect);
	}
}
