package streamApiJavaTechie;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElementOfString {
	public static void main(String[] args) {
		String input = "asfar";
		String[] result = input.split("");
		List<String> collect = Arrays.stream(result)
			  .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
			  .entrySet().stream().filter(p->p.getValue()>1).map(Map.Entry::getKey)
			  .collect(Collectors.toList());
		System.out.println(collect);
	}
}
