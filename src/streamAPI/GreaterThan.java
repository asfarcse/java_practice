package streamAPI;

import java.util.Arrays;
import java.util.List;

public class GreaterThan {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(5,10,15,25,30);
		list.stream().filter(s -> s >= 15).forEach(System.out::println);
	}
}
