package leetcode;

/**
Example 1:
Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5

Example 2:
Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.

Example 3:
Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.
**/
public class Problem58 {
	public static void main(String[] args) {
		System.out.println(lengthOfLastWord("luffy is still joyboy"));
	}
	
	public static int lengthOfLastWord(String s) {
//        String[] arr = s.split(" ");
//        s = arr[arr.length-1];
//        return s.length();
		return s.split(" ")[s.split(" ").length - 1].length();
    }
}
