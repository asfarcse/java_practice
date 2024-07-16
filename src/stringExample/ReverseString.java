package stringExample;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		String str = "asfar";
		System.out.println(reverseString(str));
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter a string to reverse");
//		String str = sc.next();
//		System.out.println(ReverseString.reverseString(str));
//	}
//
//	private static StringBuilder reverseString(String str) {
//		StringBuilder sBuilder = new StringBuilder();
//		for(int i=str.length()-1;i>=0 ;i--) {
//			sBuilder.append(str.charAt(i));
//		}
//		return sBuilder;
	}
	
	public static String reverseString(String s) {
		StringBuilder sb = new StringBuilder();
		char[] charArr = s.toCharArray();
		for(int i=charArr.length-1;i>=0;i--) {
			sb.append(charArr[i]);
		}
		return sb.toString();
	}
}
