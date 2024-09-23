package streamAPI;

import java.util.*;
import java.util.stream.*;

public class CollectStreamToList {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for(int i=1;i<=10;i++) {
			list.add(i);
		}
		
		List<Integer> evenNumbersList = list.stream().filter(i -> i%2 == 0).collect(Collectors.toList());
		System.out.println(evenNumbersList);
	}
}
