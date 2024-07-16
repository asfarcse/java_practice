package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExampleInStream {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2,3,4,5,6,7,8);
//		list.stream().map(s -> s*s).forEach(System.out::println);
		list = list.stream().map(s -> s*s).collect(Collectors.toList());
		list.forEach(System.out::println);
	}
}
