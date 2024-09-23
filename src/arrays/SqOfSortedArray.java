package arrays;

import java.util.Arrays;

public class SqOfSortedArray {
	public static void main(String[] args) {
		int[] num1 = {-4,-1,0,3,10};
		int[] num2 = {-7,-3,2,3,11};
		
		System.out.println(Arrays.toString(findSqOfSortedArray(num1)));
		System.out.println(Arrays.toString(findSqOfSortedUsingStream(num2)));
	}

	private static int[] findSqOfSortedUsingStream(int[] num2) {
		return Arrays.stream(num2).map(p->p*p).toArray();
	}

	private static int[] findSqOfSortedArray(int[] num) {
		
		int[] newArr = new int[num.length];
		
		for(int i=0;i<num.length;i++) {
			newArr[i] = num[i]*num[i];
		}
		
		/**bubble sort technique*/
		for(int i=0;i<newArr.length-1;i++) {
			for(int j=0;j<newArr.length-1;j++) {
				if(newArr[i]<newArr[j]) {
					int temp = newArr[i];
					newArr[i]=newArr[j];
					newArr[j]=temp;
				}
			}
		}
		return newArr;
	}
}
