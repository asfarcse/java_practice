package collectionexample;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetClass {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		for(int i=1;i<=5;i++) {
			set.add(i);
		}
		set.add(10);
		set.add(10);
		set.add(10);
		set.add(10);
		set.add(6);
		System.out.println(set);
	}
}
