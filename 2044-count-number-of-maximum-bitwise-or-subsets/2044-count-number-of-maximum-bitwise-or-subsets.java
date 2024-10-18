class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int[] dp = new int[1<<17];
        dp[0] = 1;
        int max = 0;

        for(int num: nums){
            for(int i=max;i>=0;i--){
                dp[i|num] = dp[i|num] + dp[i];
            }
            max = max|num;
        }
        
        return dp[max];
    }
}