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
	}
}
