class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        double max = Double.MIN_VALUE;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        max=sum;
        int curr=0;
        for(int i=k;i<nums.length;i++){
            sum=sum-nums[curr++]+nums[i];
            if(sum>max){
                max=sum;
            }
        }
        return max/k;
    }
}