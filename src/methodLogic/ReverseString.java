package methodLogic;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an string to reverse");
		String input = sc.nextLine();
		
		ReverseString.reverseLogic(input);
	}

	private static void reverseLogic(String input) {
		char[] charArray = input.toCharArray();
		String result = "";
		for(int i=charArray.length-1;i>=0;i--) {
			result+=charArray[i];
		}
		System.out.println(result);
	}
}
