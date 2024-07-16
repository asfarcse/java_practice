package leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Problem27 {
	public static void main(String[] args) {
		int[] arr = {0,1,2,2,3,0,4,2};
		System.out.println(removeElement(arr,2));
	}
	
    public static int removeElement(int[] nums, int val) {
    	 List<Integer> list = Arrays.stream(nums).boxed().filter(p->p != val).collect(Collectors.toList());
         return list.size();
    }

}
