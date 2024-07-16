package stringExample;

public class FindUpperAndLowerCaseCount {
	public static void main(String[] args) {
		countCases("Asfar IS Not Yours");
	}
	
	public static void countCases (String str) {
		int upperCaseCount=0;
		int lowerCaseCount=0;
		for(Character ch:str.toCharArray()) {
			if(Character.isAlphabetic(ch) && Character.isLowerCase(ch)) {
				lowerCaseCount++;
			} else if(Character.isAlphabetic(ch) && Character.isUpperCase(ch)){
				upperCaseCount++;
			}
		}
		
		System.out.println("lowerCaseCount:::"+lowerCaseCount+" upperCaseCount::::"+upperCaseCount);
	}
}
