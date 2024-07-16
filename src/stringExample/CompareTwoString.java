package stringExample;

import java.util.Arrays;
public class CompareTwoString {
	public static void main(String[] args) {
		String s1 = "dbca";
		String s2 = "dcba";
		System.out.println(compareString(s1, s2));
	}

	public static boolean compareString(String s1, String s2) {

		char[] charArray1 = s1.toCharArray();
		char[] charArray2 = s2.toCharArray();
		
		charArray1 = sortArray(charArray1);
		charArray2 = sortArray(charArray2);
		
		return Arrays.equals(charArray1, charArray2);
	}
	
	
	/**Bubble sort technique*/
	public static char[] sortArray(char[] charArray) {
		for (int i = 0; i < charArray.length - 1; i++) {
			boolean isSwapped = false;
			for (int j = 0; j < charArray.length - 1 - i; j++) {
				if (charArray[j] > charArray[j + 1]) {
					char temp = charArray[j];
					charArray[j] = charArray[j + 1];
					charArray[j + 1] = temp;
					isSwapped = true;
				}
			}
			if(!isSwapped) {
				break;
			}
		}
		return charArray;
	}
}
