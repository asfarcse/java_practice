package stringExample;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class IsogramExample {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter word");
		String input = sc.next();
		System.out.println(checkIsogram(input));
		
	}
	
	public static boolean checkIsogram (String input) {
		Set<Character> set = new HashSet<>();
		for(Character ch:input.toCharArray()) {
			if(set.contains(ch)) {
				return false;
			} else {
				set.add(ch);
			}
		}
		return true;
	}
}
