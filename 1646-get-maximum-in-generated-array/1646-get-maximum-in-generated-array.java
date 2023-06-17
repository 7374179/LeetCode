class Solution {
    public int getMaximumGenerated(int n) {
        int[] nums = new int[n+1];

        if(n==0){
            return 0;
        }

        nums[0] = 0;
        nums[1] = 1;

        for(int i=1;i<=n/2;i++){
            if(2*i <= n){
                nums[2*i] = nums[i];
            }
            if(2*i+1<=n){
            nums[2*i+1]=nums[i]+nums[i+1];
            }
        }
        return Arrays.stream(nums).max().orElse(Integer.MIN_VALUE);
    }
}