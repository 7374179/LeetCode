class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        if(nums.length==1){
            return nums[0];
        }
        if(nums.length==2){
            return Math.min(nums[0], nums[1]);
        }
        if(nums[right] > nums[left]){
            return nums[left];
        }
        while(left<right){
            int mid=(left+right)/2;
            if(nums[left]>nums[mid] && nums[mid]<nums[right]){
                if(nums[mid-1]>nums[mid] && nums[mid]<nums[mid+1]){
                    return nums[mid];
                }
                right=mid-1;
            }else if(nums[left]>nums[mid]){
                right=mid-1;
            }else if(nums[mid]>nums[right]){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return nums[left];
    }
}
