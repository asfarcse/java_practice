package interviewQuestion;

import java.util.Scanner;

public class PalindromeCheck {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str = sc.nextLine();
		str = str.replace(",", "").replace(":", "").replace(" ", "");
		System.out.println(checkForPalindrom(str));
	}
	
	public static Boolean checkForPalindrom(String str) {
		boolean result = true;
		Integer length = str.length();
		for(int i=0;i<=length/2-1;i++) {
			if(str.charAt(i) != str.charAt(str.length()-1-i)) {
				result = false;
				break;
			}
		}
		return result;
	}
}
