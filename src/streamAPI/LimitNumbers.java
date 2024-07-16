package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class LimitNumbers {
	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(2,3,4,5,6,1,665,34,20,55,90);
		
		//get first 5 number and do sum of it
		Optional<Integer> optional = numList.stream().limit(5).reduce((a,b)->a+b);
		System.out.println(optional.get());
		
		//skip first 5 number and do sum of it
		Optional<Integer> skipObj = numList.stream().skip(5).reduce((a,b)->a+b);
		System.out.println(skipObj.get());
		
		
	}
}
