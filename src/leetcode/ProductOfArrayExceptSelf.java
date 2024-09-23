package leetcode;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4};
        int[] output = new int[input.length];
        
        int product = 1;
        int count0 = 0;

        for (int num : input) {
            if (num != 0) {
                product *= num;
            } else {
                count0++;
            }
        }

        for (int i = 0; i < input.length; i++) {
            if (count0 > 1) {
                output[i] = 0;
            } else if (count0 == 1) {
                if (input[i] == 0) {
                    output[i] = product;
                } else {
                    output[i] = 0;
                }
            } else {
                output[i] = product / input[i];
            }
        }

        System.out.println(Arrays.toString(output));
    }
    
    
//    int[] arr = {1,2,3,0,4};
//	int[] newArr = new int[arr.length];
//	
//	int product = 1;
//	int countZero = 0;
//	for(int num:arr) {
//		if(num == 0) {
//			countZero++;
//		} else {
//			product *=num;
//		}
//	}
//	
//	int idx = 0;
//	for(int num:arr) {
//		if(countZero >1) {
//			newArr[idx++] = 0;
//		} else if(countZero == 1) {
//			newArr[idx++] = num == 0 ? product:0;
//		} else {
//			newArr[idx++] = product/num;
//		}
//	}
//	
//	System.out.println(Arrays.toString(newArr));
}
