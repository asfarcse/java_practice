package stringExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//input--> Hii how are you
//output--> iiH woh era uoy
public class ReverseEachWordOfString {
	public static void main(String[] args) {

		/** traditional approach */
		String[] strArray = { "hii", "how", "are", "you" };
		List<String> arrList = new ArrayList<>();
		for (int i = 0; i < strArray.length; i++) {
			arrList.add(reverseString(strArray[i]));
		}
		System.out.println(arrList);

		/** using streamsAPI */
		List<String> strList = Arrays.asList("hii", "how", "are", "you");
		List<String> collect = strList.stream().map(p -> new StringBuffer(p).reverse().toString())
				.collect(Collectors.toList());
		System.out.println(collect);
	}

	private static String reverseString(String str) {
		StringBuilder sb = new StringBuilder();
		for (int i = str.length() - 1; i >= 0; i--) {
			sb.append(str.charAt(i));
		}
		return sb.toString();
	}
}
