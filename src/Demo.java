import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//Input: nums = [1,2,3,4]
//Output: [24,12,8,6]
class Demo {
	public static void main(String[] args) {
//		productExceptSelf(arr);

//		int[] arr1 = { 1, 1, 2, 3, 4, 5, 6 };
//		int[] arr2 = { 2, 3, 4, 4, 5 };
//
//		mergeTwoSortedArray(arr1, arr2);
//		
//		
//		String str = "my name is asfar";
//		for(int i=0;i<str.length();i++) {
//			System.out.println(str.charAt(i));
//		}
		
		int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int sum=0;
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
			max = Math.max(max, sum);
			if(sum < 0) {
				sum=0;
			}
		}
		
		System.out.println(max);

	}

	private static void mergeTwoSortedArray(int[] arr1, int[] arr2) {
		
		
		int i=0;
		int j=0;
		List<Integer> list = new ArrayList<>();
		
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i] <= arr2[j]) {
				if(list.isEmpty() || arr1[i] != list.get(list.size()-1)) {
					list.add(arr1[i]);
				}
				i++;
			} else if(arr2[j] <= arr1[i]) {
				if(list.isEmpty() || arr2[j] != list.get(list.size()-1)) {
					list.add(arr2[j]);
				}
				j++;
			}
		}
		
		while(i < arr1.length) {
			if(list.isEmpty() || arr1[i] != list.get(list.size()-1)) {
				list.add(arr1[i]);
			}
			i++;
		}
		
		while(j < arr2.length) {
			if(list.isEmpty() || arr2[j] != list.get(list.size()-1)) {
				list.add(arr2[j]);
			}
			j++;
		}
		
		System.out.println(list);
	}

	private static void productExceptSelf(int[] arr) {
		int product = 1;
		int count0 = 0;
		for (int num : arr) {
			if (num != 0) {
				product *= num;
			} else {
				count0++;
			}
		}
		List<Integer> list = new ArrayList<>();
		for (int num : arr) {
			if (count0 > 1) {
				list.add(0);
			} else if (count0 == 1) {
				if (num == 0) {
					list.add(product);
				} else {
					list.add(0);
				}
			} else {
				list.add(product / num);
			}
		}

		System.out.println(Arrays.toString(list.stream().toArray()));
	}

}
