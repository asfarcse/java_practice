package collectionexample;

import java.util.ArrayList;

public class RetainAllExample {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>();
		
		list1.add("asfar");list1.add("moazzam");list1.add("mehdi");list1.add("khurshid");
		list2.add("asfar");list2.add("moazzam");list2.add("afaque");list2.add("adil");
		
		System.out.println(list1+"::::::"+list2);
		list1.retainAll(list2);
		System.out.println(list1+"::::::"+list2);
	}
}
