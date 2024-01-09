class Solution {
    public int rob(int[] nums) {
        int[] arr = new int[nums.length+2];
        arr[nums.length-1]=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            arr[i]=nums[i]+Math.max(arr[i+2], arr[i+3]);
        }
        return Math.max(arr[0], arr[1]);
    }
}