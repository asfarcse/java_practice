package streamAPI;

import java.util.Arrays;

public class CountPrintVowel {
	public static void main(String[] args) {
		String str="asfar";
		long count = str.chars().filter(s->s=='a' || s=='e' || s=='i' || s=='o' || s=='u').count();
		System.out.println(count);

	}
}
