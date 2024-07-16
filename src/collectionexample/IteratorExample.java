package collectionexample;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		for(int i=1;i<=10;i++) {
			list.add(i);
		}
		System.out.println(list);
		Iterator iterator = list.iterator();
		while(iterator.hasNext()) { 
			Integer i = (Integer) iterator.next();
			if(i%2==0) {
				System.out.print(i);
				System.out.print(" ");
			} else {
				iterator.remove();
			}
		}
		System.out.println();
		System.out.println(list);
	}
}
