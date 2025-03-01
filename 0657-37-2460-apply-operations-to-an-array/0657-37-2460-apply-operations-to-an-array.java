class Solution {
    public int[] applyOperations(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i]=nums[i]*2;
                nums[i+1] = 0;
            }
        }
        int left=0;
        int right=1;
        while(right<nums.length){
            if(nums[left] !=0 && nums[right] !=0){
                left++;
                right++;
            } else if(nums[left]!=0 && nums[right]==0){
                left++;
                right++;
            } else if(nums[left]==0 && nums[right]==0){
                right++;
            } else if(nums[left]==0 && nums[right]!=0){
                int tmp = nums[left];
                nums[left] = nums[right];
                nums[right] = tmp;
                left++;
                right++;                
            }
        }
        return nums;
    }
}