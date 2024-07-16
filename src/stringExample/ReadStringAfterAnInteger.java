package stringExample;

import java.util.Scanner;

public class ReadStringAfterAnInteger {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Integer i = input.nextInt();
//		input.nextLine();
		String s = input.nextLine();
		
		System.out.println(i);
		System.out.println(s);
	}
}
