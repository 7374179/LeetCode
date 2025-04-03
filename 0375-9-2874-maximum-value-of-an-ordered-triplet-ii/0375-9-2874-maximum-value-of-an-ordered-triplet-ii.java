class Solution {
    public long maximumTripletValue(int[] nums) {
        long min = 0;
        long min2 = 0;
        long mul = 0;

        for(int i=0;i<nums.length;i++){
            mul = Math.max(mul, min * nums[i]);
            min = Math.max(min, min2 - nums[i]);
            min2 = Math.max(min2, nums[i]);
        }

        return mul;
    }
}