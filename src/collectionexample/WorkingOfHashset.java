package collectionexample;

import java.util.HashSet;
import java.util.Set;

public class WorkingOfHashset {
	public static void main(String[] args) {
		
		Set<String> set = new HashSet();
		
		boolean b1 = set.add("prog");
		boolean b2 = set.add("rank");
		
		boolean b3 = set.add("prog");
		
		for(String s:set) {
			System.out.println(s);
		}
		
//		new HashSet<>();
		
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
	}
}
