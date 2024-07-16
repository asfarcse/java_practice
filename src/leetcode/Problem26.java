package leetcode;

import java.util.Arrays;

public class Problem26 {
	public static void main(String[] args) {
		Problem26 object = new Problem26();
		int[] intArr = {0,0,1,1,1,2,2,3,3,4};
		System.out.println(object.removeDuplicates(intArr));
		System.out.println(Arrays.toString(intArr));
	}
	
	public int removeDuplicates(int[] nums) {
        int count = 0;
		for(int i=0;i<nums.length;i++) {
			if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                continue;
            } else {
            	nums[count] = nums[i];
				count++;
			}
		}
		return count;
    }
}
