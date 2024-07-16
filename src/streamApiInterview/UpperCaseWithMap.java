package streamApiInterview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCaseWithMap {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("mohd","asfar","java","developer");
		List<String> collect = names.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(collect);
	}
}
