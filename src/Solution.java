class Solution {
    public static void main(String args[]) {
        int[] arr = {2,5,5,11};
        Solution s = new Solution();
        arr = s.twoSum(arr,10);
        for(Integer ar:arr) {
        	System.out.println(ar);
        }
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
