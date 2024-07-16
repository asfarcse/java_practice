package stringExample;

/**You are given a string 'STR' containing lowercase English letters from a to z. Your task is to find all non-empty possible subsequences of 'STR'
Input 1: abc, Output : a ab abc ac b bc c, Input 2: bbb, output : b b b bb bb bb bbb */
public class PossiblePattern {
	public static void main(String[] args) {
		String str = "abc";
		char[] charArray = str.toCharArray();
		for(int i=0;i<charArray.length;i++) {
			for(int j=i;j<charArray.length;j++) {
				if(i != j) {
					System.out.print(charArray[i]);
					System.out.print(charArray[j]);
					System.out.print(",");
				} else {
					System.out.print(charArray[i]);
					System.out.print(",");
				}
				if(i==0 && j==charArray.length-1) {
					System.out.print(charArray);
					System.out.print(",");
				}
			}
		}
	}
}
