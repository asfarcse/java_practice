package main;

public class ConstrutorChaining {
	class Solution {
		   public int solution(int[] A) {
		       int currentSum = 0;
		       int relocationCount = 0;
		       for (int i = 0; i < A.length; i++) {
		           currentSum += A[i];
		           if (currentSum < 0 && A[i] < 0) {
		               // relocate current expense to the end of the array
		               int j = i;
		               while (j < A.length - 1 && A[j + 1] < 0) {
		                   int temp = A[j];
		                   A[j] = A[j + 1];
		                   A[j + 1] = temp;
		                   j++;
		                   relocationCount++;
		               }
		           }
		       }
		       return relocationCount;
		   }
		}
	public static void main(String[] args) {
		new ConstrutorChaining();
	}
}
	


