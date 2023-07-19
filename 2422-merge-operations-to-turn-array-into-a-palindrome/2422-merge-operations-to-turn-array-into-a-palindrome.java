class Solution {
    public int minimumOperations(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int count=0;

        while(left<=right){
            if(nums[left]==nums[right]){
                left++;
                right--;
            }else{
                if(nums[left]>nums[right]){
                    nums[right-1]+=nums[right];
                    nums[right]=0;
                    count++;
                    right--;
                }else{
                    nums[left+1]+=nums[left];
                    nums[left]=0;
                    count++;
                    left++;
                }
            }
        }
        return count;
    }
}

