class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean in = checkInc(nums);
        boolean de = checkDec(nums);
        return in||de;     
    }

    boolean checkInc(int[] nums){
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<=nums[i+1]){
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
    boolean checkDec(int[] nums){
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>=nums[i+1]){
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}