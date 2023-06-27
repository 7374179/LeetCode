class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] arr = new int[nums.length];
        int start=0;
        int end = nums.length-1;

        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                arr[start++]=nums[i];
            }else{
                arr[end--]=nums[i];
            }
        }
        return arr;
    }
}