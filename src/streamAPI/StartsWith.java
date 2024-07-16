package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StartsWith {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("asfar","mehdi","mayank","shivek","lokesh","Asif");
		List<String> listA = list.stream().filter(s->s.toLowerCase().startsWith("a")).collect(Collectors.toList());
		System.out.println("Starts with A::::"+listA);
		System.out.println(list.stream().count());
//		List<Integer> numList = Arrays.asList(1,3,5,7,9,2,4,6,8);
//		numList.stream().map(i->i*i).forEach(i->System.out.println(i));
//		long count = numList.stream().count();
//		System.out.println("count::::"+count);
//		List<Integer> sortedList = numList.stream().sorted().collect(Collectors.toList());
//		sortedList.forEach(i->System.out.print(i));
//		System.out.println("****************");
//		List<Integer> customizedSortedList = numList.stream().sorted((i1,i2) -> i2.compareTo(i1)).collect(Collectors.toList());
//		customizedSortedList.forEach(i->System.out.print(i));
		
//		int[] number = {1,3,5,7,9,2,4,6,8,10};
//		Arrays.stream(number).forEach(i->System.out.print(i));
		
	}
}
