class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        Arrays.sort(nums);
        int i=0;
        while(i<nums.length){
            if(nums[i]==nums[i+1]){
                i=i+3;
                if(i==nums.length-1){
                    return nums[i];
                }
                continue;
            }else{
                if(nums[i]!=nums[i+1]){
                    return nums[i];
                }
            }
        }
        return 0;
    }
}