package cursorsInJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
	public static void main(String[] args) {
		
		List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);
		
		Iterator<Integer> iterator = intList.iterator();
		
		while(iterator.hasNext()) {
			Integer element = iterator.next();
			if(element%2==0) {
				System.out.println(element);
			} else {
				iterator.remove();
			}
		}
		
		System.out.println(intList);
	}
}
