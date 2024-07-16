package leetcode;

class Problem1 {
    public static void main(String args[]) {
        int[] arr = {2,7,11,15};
        Problem1 s = new Problem1();
        System.out.println(s.twoSum(arr,9)[0]+" "+s.twoSum(arr,9)[1]);
    }

    public int[] twoSum(int[] arr, int target) {
        int[] tempArr = {0,0};
        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<arr.length;j++) {
                if(arr[i]+arr[j] == target) {
                    tempArr[0]=i;
                    tempArr[1]=j;
                    return tempArr;
                }
            }
        }
        return null;
    }
}
