package streamApiInterview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortString {
	public static void main(String[] args) {
		List<String> strList = Arrays.asList("asfar","moazzam","khurshid","ali");
		List<String> ascending = strList.stream().sorted().collect(Collectors.toList());
		List<String> descending = strList.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());

		System.out.println("sortedList ascending::"+ascending);
		System.out.println("sortedList descending::"+descending);
	}
}
