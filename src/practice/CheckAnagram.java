package practice;

import java.util.Arrays;

public class CheckAnagram {
	public static void main(String[] args) {
		String str1="java";
		String str2="avaj";
		System.out.println(anagramMethod(str1,str2));
	}

	private static String anagramMethod(String str1, String str2) {
		str1 = sortString1(str1);
		str2 = sortString(str2);
		return str1.equalsIgnoreCase(str2) ? "Anagram" : "Not Anagram";
	}
	
	/**use i and j in if condition of inner for loop starts from i+1*/
	private static String sortString(String str) {
		char[] charArray = str.toCharArray();
		for(int i=0;i<charArray.length;i++) {
			for(int j=i+1;j<charArray.length;j++) {
				if(charArray[i]>charArray[j]) {
					char temp = charArray[i];
					charArray[i] = charArray[j];
					charArray[j] = temp;
				}
			}
		}
		return Arrays.toString(charArray);
	}
	
	/**use j and j+1 in if condition of inner for loop starts from i=0*/
	private static String sortString1(String str) {
		char[] charArray = str.toCharArray();
		for(int i=0;i<charArray.length-1;i++) {
			for(int j=0;j<charArray.length-1;j++) {
				if(charArray[j] > charArray[j+1]) {
					char temp = charArray[j];
					charArray[j] = charArray[j+1];
					charArray[j+1] = temp;
				}
			}
		}
		return Arrays.toString(charArray);
	}
}
