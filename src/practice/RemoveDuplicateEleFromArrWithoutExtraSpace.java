package practice;

import java.util.Arrays;

public class RemoveDuplicateEleFromArrWithoutExtraSpace {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 3, 5, 6, 7, 6, 8};
        removeElement(arr);
    }

    private static void removeElement(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (arr[i] == arr[j]) {
                    removeElementByShifting(j, arr);
                    length--;
                    j--; 
                }
            }
        }
        
        System.out.println(Arrays.toString(Arrays.copyOf(arr, length)));
    }

    private static void removeElementByShifting(int index, int[] arr) {
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
    }
}
