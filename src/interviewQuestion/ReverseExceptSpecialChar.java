package interviewQuestion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
Input:   str = “a,b$c”
Output:  str = “c,b$a”
Explanation: Note that $ and , are not moved anywhere.  Only subsequence “abc” is reversed
Input:   str = “Ab,c,de!$”
Output:  str = “ed,c,bA!$”


Create a temporary character array say temp[]. 
Copy alphabetic characters from the given array to temp[]. 
Reverse temp[] using standard string reversal algorithm. 
Now traverse input string and temp in a single loop. 
Wherever there is an alphabetic character is input string,
replace it with the current character of temp[].

 */



public class ReverseExceptSpecialChar {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("give input mixed of char and special char");
		String input = sc.next();
		char[] result = reverseString(input);
		System.out.println("input:::"+input);
		System.out.print("output::::");
		for(char ch:result) {
			System.out.print(ch);
		}
	}
	
	public static char[] reverseString(String str) {
		List<Character> list = new ArrayList<>();
		for(int i=0;i<str.length();i++) {
			if((str.charAt(i) >='a' && str.charAt(i) <='z') || (str.charAt(i) >='A' && str.charAt(i) <='Z')) {
				list.add(str.charAt(i));
			}
		}
		String revStr = reverseMethod(list);
		char[] origArray = str.toCharArray();
		char[] newArray = revStr.toCharArray();
		origArray = replaceCharMethod(origArray,newArray);
		return origArray;
	}

	private static char[] replaceCharMethod(char[] origArray, char[] newArray) {
		int index = 0;
		for(int i=0;i<origArray.length;i++) {
			if((origArray[i] >='a' && origArray[i] <='z') || (origArray[i] >='A' && origArray[i] <='Z')) {
				origArray[i] = newArray[index];
				index++;
			}
		}
		return origArray;
	}

	private static String reverseMethod(List<Character> list) {
		String newStr = "";
		for(int i=list.size()-1;i>=0;i--) {
			newStr += list.get(i);
		}
		return newStr;
	}
}
