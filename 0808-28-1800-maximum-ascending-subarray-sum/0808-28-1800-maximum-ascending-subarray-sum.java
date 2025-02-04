class Solution {
    public int maxAscendingSum(int[] nums) {
        int max = 0;
        int sum = nums[0];
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                sum = sum + nums[i+1];
            } else {
                if(max<sum){
                    max = sum;
                }
                sum = 0;
                sum = sum + nums[i+1];
            }
        }
        return max<sum ? sum : max;
    }
}