package impetus;

import java.io.PrintStream;

//input="The Cat is very1 Beautiful Animal"
//output="Animal is Beautiful 1yrev Cat The"
public class ReverseWord {

	public static void main(String[] args) {
        String input = "The Cat is ver1y Beautiful Animal";
        String output = reverseWords(input);
        System.out.println(input);
        System.out.println(output);
    }

    public static String reverseWords(String input) {
        
        String[] words = input.split("\\s+");
        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            if (containsNumeric(words[i])) {
                reversed.append(reverWord(words[i]));
                reversed.append(" ");
            } else {
                reversed.append(words[i]).append(" ");
            }
        }

        return reversed.toString().trim();
    }

	private static String reverWord(String string) {
		StringBuilder sb = new StringBuilder();
		char temp = 0;
		for(int i=string.length()-1;i>=0;i--) {
			Character ch = string.charAt(i);
			if(Character.isDigit(ch)) {
				temp=ch;
				sb.append("");
			}else {
				sb.append(ch);
			}
			
		}
		sb.append(temp);
		return sb.toString();
	}

	public static boolean containsNumeric(String str) {
        for (Character c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }
}







 