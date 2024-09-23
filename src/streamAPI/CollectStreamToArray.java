package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CollectStreamToArray {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i=1; i<=10;i++) {
			list.add(i);
		}
		Integer[] evenNumberArr = list.stream().filter(i-> i%2 == 0).toArray(Integer[]::new);
		for(Integer even:evenNumberArr) {
			System.out.println(even);
		}
	}
}
