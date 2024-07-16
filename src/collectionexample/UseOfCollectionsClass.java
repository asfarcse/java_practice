package collectionexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UseOfCollectionsClass {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for(int i=1;i<=5;i++) {
			list.add(i);
		}
		list.add(10);
		list.add(6);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		System.out.println(Collections.binarySearch(list, 2));
	}
}
