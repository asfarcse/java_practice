package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class mapAndFlatMap {
	public static void main(String[] args) {
		List<String> fruitList = Arrays.asList("mango","banana","orange","apple","cherry");
		/**MAP()*/
		List<Integer> wordCount = fruitList.stream().map(f->f.length()).collect(Collectors.toList());
		System.out.println("wordCount:::"+wordCount);
		
		/**FlatMap()*/
		List<List<Integer>> numArrayList = Arrays.asList(Arrays.asList(1,2),Arrays.asList(3,4),Arrays.asList(5,6));
		List<Integer> newList = numArrayList.stream().flatMap(s->s.stream()).collect(Collectors.toList());
		
		System.out.println("newList::::"+newList);
	}
}
