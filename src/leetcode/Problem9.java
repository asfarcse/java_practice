package leetcode;

public class Problem9 {
	public static void main(String[] args) {
		Problem9 obj=new Problem9();
		System.out.println(obj.isPalindrome(121));
	}

	public boolean isPalindrome(int x) {
		char[] arr = Integer.toString(x).toCharArray();
		for(int i=0;i<=Integer.toString(x).toCharArray().length/2;i++) {
			if(arr[i] != arr[arr.length-i-1]) {
				return false;
			}
		}
		return true;
	}
}
