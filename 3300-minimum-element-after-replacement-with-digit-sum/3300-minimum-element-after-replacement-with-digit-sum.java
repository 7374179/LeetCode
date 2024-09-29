class Solution {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int tmp = nums[i];
            int sum = 0;
            while(tmp>0){
                sum = sum + tmp%10;
                tmp = tmp/10;
            }
            if(min > sum){
                min = sum;
            }
        }
        return min;
    }
}