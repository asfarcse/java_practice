package collectionexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UnModifiedList {
	public static void main(String[] args) {
		
		List<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		
		List<Integer> unmodifiableList = Collections.unmodifiableList(intList);
		unmodifiableList.add(101);
		
		System.out.println(unmodifiableList);
		
		
		/****/
		List<String> originalList = new ArrayList<>(Arrays.asList("a", "b", "c"));
		List<String> unmodifiableList1 = Collections.unmodifiableList(originalList);
//		unmodifiableList1.add("d"); // Throws UnsupportedOperationException
		originalList.add("d"); // This change will be reflected in unmodifiableList
		
		System.out.println("originalList::::::"+originalList.hashCode());
		System.out.println("unmodifiableList1::::::"+unmodifiableList1.hashCode());

	}
}
