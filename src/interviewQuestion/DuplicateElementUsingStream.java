package interviewQuestion;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElementUsingStream {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,12,14,20,12,25,30,35,40,55,62,25);
		Set<Integer> set = new HashSet<>();
		list.stream().filter(a->!set.add(a)).collect(Collectors.toSet()).forEach(a->System.out.println(a));
	}
}
