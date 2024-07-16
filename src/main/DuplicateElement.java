package main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElement {
	public static void main(String[] args) {
		String str="aabbccabcc";
		Set<Character> set1 = new HashSet<>();
		List<Character> set2 = new ArrayList<>();
		char[] charArray = str.toCharArray();
		for(char c:charArray) {
			if(!set1.contains(c)) {
				set1.add(c);
			} else {
				set2.add(c);
			}
		}

		for(int i=0;i<set2.size();i++) {
			int count=0;
			for(int j=i;j<set2.size();j++) {
				if(set2.get(i).equals(set2.get(j))) {
					count++;
				}
			}
			if(count>1) {
				System.out.println(set2.get(i)+"--repeats--" +count+"---times");
			}
		}
	}
}
