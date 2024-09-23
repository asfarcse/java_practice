package arrays;

public class RepeatTwice {
	public static void main(String[] args) {
		int[] arr = {2,4,6,8,10,2};
		int count=1;
		for(int i=0;i<arr.length;i++) {
			if(i == arr.length-1 && count !=2) {
				count++;
				i=-1;
				System.out.println("********");
			}
		}
	}
}
