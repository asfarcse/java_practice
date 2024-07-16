package stringExample;

import java.util.Arrays;

public class SortString {
	public static void main(String[] args) {
		String[] strArrays = {"khurshid","asfar","moazzam","ali"};
		Arrays.sort(strArrays);
		System.out.println(Arrays.toString(strArrays));
		
		String str = "sadaf";
		System.out.println(str.compareTo("asfar"));
	}
}
