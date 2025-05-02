class Solution {
    public int[] orArray(int[] nums) {
        int[] arr = new int[nums.length-1];
        for(int i=0;i<arr.length;i++){
            arr[i] = nums[i] | nums[i+1];
        }
        return arr;
    }
}