class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int tmp = nums.length/2;
        int max = 0;
        for(int i=0;i<nums.length;i=i+2){
            max = max+nums[i];
        }
        return max;
    }
}