package arrays;

public class DutchNationalFlag {
    
    public static void sortColors(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        
        while (mid <= high) {
            switch (nums[mid]) {
                case 0:
                    swap(nums, low, mid);
                    low++;
                    mid++;
                    break;
                
                case 1:
                    mid++;
                    break;
                
                case 2:
                    swap(nums, mid, high);
                    high--;
                    break;
            }
        }
    }
    
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[] nums = {2, 0, 1, 2, 1, 0};
        System.out.println("Original Array:");
        printArray(nums);
//        sortColors(nums);
        sortArray(nums);
        System.out.println("Sorted Array:");
        printArray(nums);
    }

	private static void sortArray(int[] nums) {
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]>nums[j]) {
					int temp=nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
				}
			}
		}
	}
}

