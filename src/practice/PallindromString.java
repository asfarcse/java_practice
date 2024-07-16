package practice;

public class PallindromString {
	public static void main(String[] args) {
		String str = "madam";
		System.out.println(isPallindrom(str));
	}

	private static String isPallindrom(String str) {
		int j=str.length()-1;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i) != str.charAt(j)) {
				return "not pallindrom";
			}
			j--;
		}
		
		return "pallindrom";
	}
}
