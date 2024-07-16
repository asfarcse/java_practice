package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartWith {
	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(1,2,22,23,144,33,665,34,20,55,90);
		List<String> collect = numList
				.stream()
				.map(n->n.toString())
				.filter(s->s.startsWith("1"))
				.collect(Collectors.toList());
		System.out.println("collect:::::"+collect);
	}
}
