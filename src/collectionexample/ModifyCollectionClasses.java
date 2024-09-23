package collectionexample;

import java.util.Arrays;
import java.util.List;

public class ModifyCollectionClasses {
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("asfar","moazzam","mehdi");
		System.out.println(list1);
		
		/**we can't add or remove(but we can modify) any element from this type of list, bcz it if fixed(Arrays.asList())...*/
		list1.remove("moazzam"); //UnsupportedOperationException
		list1.remove(1);	//UnsupportedOperationException
		list1.add("demo");//UnsupportedOperationException
		list1.set(1, "aasma"); //work fine
		System.out.println(list1);
	}
}
