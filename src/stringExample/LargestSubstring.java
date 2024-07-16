package stringExample;

//s = "ababcbb"
//output: 3
import java.util.HashMap;

public class LargestSubstring {
    public static void main(String[] args) {
        String input = "pwwkew";
        String longestSubstring = findLongestSubstring(input);
        System.out.println("Longest Substring: " + longestSubstring);
    }

    public static String findLongestSubstring(String input) {
        int n = input.length();
        int start = 0;
        int end = 0;
        int maxLength = 0;
        String longestSubstring = "";
        HashMap<Character, Integer> charIndexMap = new HashMap<>();

        while (end < n) {
            char currentChar = input.charAt(end);

            if (charIndexMap.containsKey(currentChar)) {
                // Move the start pointer to exclude the repeating character
                start = Math.max(start, charIndexMap.get(currentChar) + 1);
            }

            charIndexMap.put(currentChar, end);
            int currentLength = end - start + 1;

            if (currentLength > maxLength) {
                maxLength = currentLength;
                longestSubstring = input.substring(start, end + 1);
            }

            end++;
        }

        return longestSubstring;
    }
}


