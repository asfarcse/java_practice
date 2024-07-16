package practice;

public class RemoveDuplicateFromString {
	public static void main(String[] args) {
		String str = "asfar";
		System.out.println(removeDuplicate(str));
	}

	private static String removeDuplicate(String str) {
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<str.length();i++) {
			if(!sb.toString().contains(str.charAt(i)+"")) {
				sb.append(str.charAt(i));
			}
		}
		return sb.toString();
	}
}
