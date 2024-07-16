package practice;


public class ReverseWordInString {
	public static void main(String[] args) {
		String str = "Welcome To Java World";
		System.out.println(reverseWords(str));
	}

	private static String reverseWords(String str) {
		String[] split = str.split(" ");
		StringBuilder sb = new StringBuilder();
		
		for(int i=split.length-1;i>=0;i--) {
			sb.append(split[i]+" ");
		}
		
		return sb.toString();
	}
}
