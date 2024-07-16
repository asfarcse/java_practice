package streamAPIBasic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class mapAndFlatMap {
	public static void main(String[] args) {
		
		/**Map*/
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		List<Integer> collect = list.stream().map(p->p*p).collect(Collectors.toList());
		System.out.println(collect);
		
		/**FlatMap*/
		List<List<Integer>> listOfList = Arrays.asList(Arrays.asList(1,2),Arrays.asList(3,4));
		List<Integer> collect2 = listOfList.stream().flatMap(p->p.stream()).collect(Collectors.toList());
		System.out.println(collect2);
	}
}
