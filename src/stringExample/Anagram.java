package stringExample;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String str1 = "silent";
		String str2 = "listen";
		System.out.println(checkForAnagram(str1,str2));
	}

	private static Boolean checkForAnagram(String str1, String str2) {
		str1 = sortString(str1);
		str2 = sortString(str2);
		if(str1.equalsIgnoreCase(str2))
			return true;
		return false;
	}
	
	private static String sortString(String str) {
		char[] charArray = str.toCharArray();
		for(int i=0;i<charArray.length;i++) {
			for(int j=i+1;j<charArray.length;j++) {
				if(charArray[i]>charArray[j]) {
					char temp = charArray[i];
					charArray[i]=charArray[j];
					charArray[j] = temp;
				}
			}
		}
		return Arrays.toString(charArray);
	}
}
