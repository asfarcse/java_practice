package collectionexample.setExample;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<>();
//		ts.add(null); //will throw NPE
		ts.add("asfar");
		ts.add("mohd");
		ts.add("delhi");
//		ts.add(null); //will throw NPE
		System.out.println(ts);
		
		
		System.out.println("*****************************");
		TreeSet<String> ts1 = new TreeSet<>(nameComparator);
		ts1.add("asfar");
		ts1.add("mohd");
		ts1.add("delhi");
		System.out.println(ts1);
		
	}
	
	public static Comparator<String> nameComparator = new Comparator<>() {
		
		@Override
		public int compare(String o1, String o2) {
			return o2.compareTo(o1);
		}
	};
}
