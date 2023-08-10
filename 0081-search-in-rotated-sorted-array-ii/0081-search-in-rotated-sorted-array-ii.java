class Solution {
    public boolean search(int[] nums, int target) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length-1;

        while(left<=right){
            int mid = left + (right-left)/2;
            if(nums[mid]==target){
                return true;
            }else if(nums[mid]>target){
                right = mid-1;
            }else if(nums[mid]<target){
                left = mid+1;
            }
        }
        return false;
    }
}