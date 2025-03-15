class Solution {
    public int minCapability(int[] nums, int k) {
        int min = 1;
        int max = Arrays.stream(nums).max().getAsInt();
        int total = nums.length;

        while(min<max){
            int mid = (min + max) /2;
            int possible = 0;
            for(int i=0; i<total;++i){
                if(nums[i]<=mid){
                    possible++;
                    i++;
                }
            }
            if(possible>=k) max = mid;
            else min = mid + 1;
        }
        return min;
    }
}