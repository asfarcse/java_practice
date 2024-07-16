package streamAPIBasic;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MaxAndMinNumber {
	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(2,22,23,44,33,1,665,34,20,55,90);
		
		List<Integer> numList1 = Arrays.asList(2,22,23,20,55,90);
		
		numList.stream().filter( a-> numList1.stream().anyMatch(arg -> a==arg)).forEach(System.out::println);;
		
		/**1st way*/
//		Integer minNumber = numList.stream().min(Comparator.comparing(Integer::valueOf)).get();
//		Integer maxNumber = numList.stream().max(Comparator.comparing(Integer::valueOf)).get();
//		System.out.println("minNumber::::"+minNumber+"\nmaxNumber:::"+maxNumber);
//		System.out.println("**************************************************");
//		
//		/**2st way*/
//		Integer min = numList.stream().min(Integer::compareTo).get();
//		Integer max = numList.stream().max(Integer::compareTo).get();
//		System.out.println("minNumber::::"+min+"\nmaxNumber:::"+max);
//		System.out.println("**************************************************");
//		
//		/**3rd way*/
//		int minn = numList.stream().mapToInt(p->p).min().getAsInt();
//		int maxx = numList.stream().mapToInt(p->p).max().getAsInt();
//		System.out.println("minNumber::::"+minn+"\nmaxNumber:::"+maxx);
		
	}
}
