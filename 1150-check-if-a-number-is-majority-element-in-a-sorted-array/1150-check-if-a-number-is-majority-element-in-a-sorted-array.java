class Solution {
    public boolean isMajorityElement(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        int sum=0;

        while(left<right){
            boolean flag = false;
            if(nums[left]<target){
                left++;
                flag = true;
            }
            if(nums[right]>target){
                right--;
                flag = true;
            }
            if(!flag){
                sum=right-left+1;
                left=right;
            }
        }
        return sum>nums.length/2;

    }
}