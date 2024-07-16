package interviewQuestion;

public class RemoveWhitespace {
	public static void main(String[] args) {
		String str = "a s f a  r";
		System.out.println(removeWhiteSpace(str));
	}
	
	static StringBuilder removeWhiteSpace(String str) {
		StringBuilder output = new StringBuilder();
		char[] charArr = str.toCharArray();
		for(char c:charArr) {
			if(!Character.isWhitespace(c)) {
				output.append(c);
			}
		}
		return output != null ? output : new StringBuilder();
	} 
}
