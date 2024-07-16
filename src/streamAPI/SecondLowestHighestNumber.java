package streamAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class SecondLowestHighestNumber {
	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(2,3,4,5,6,1,665,34,20,55,90);
		
		//second highest number
		Optional<Integer> secondHighest = numList.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst();
		System.out.println("secondHighest::::::"+secondHighest.get());
		
		//second lowest number
		Optional<Integer> secondLowest = numList.stream().sorted().distinct().skip(1).findFirst();
		System.out.println("secondLowest::::"+secondLowest.get());
	}
}
