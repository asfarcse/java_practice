package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class AmanPallirom {
	public static void main(String[] args) {
		String input = "aabcccccaaa";
	    compressString(input);
	    String str  = "A man, a plan, a canal: Panama";
	    isPallindrom(str);
	}

	private static void isPallindrom(String str) {
		char[] charArray = str.toCharArray();
		
		List<Character> charList = new ArrayList<>();
		for(int i=0;i<charArray.length;i++) {
			if(Character.isAlphabetic(charArray[i])) {
				charList.add(charArray[i]);
			}
		}
		
		String str1 = charList.stream().map(p->p.toString()).collect(Collectors.joining(""));
		StringBuilder str2 = new StringBuilder(str1).reverse();
		
		System.out.println(str1.equalsIgnoreCase(str2.toString()));
		
	}

	public static void compressString(String str) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                sb.append(str.charAt(i)).append(count);
                count = 1;
            }
        }
        sb.append(str.charAt(str.length() - 1)).append(count);
        System.out.println(sb.toString());
    }
	
}
