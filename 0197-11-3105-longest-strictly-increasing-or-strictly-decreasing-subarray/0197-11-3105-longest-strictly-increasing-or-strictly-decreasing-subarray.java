class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int max = 1;
        int count = 1;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i;j<nums.length-1;j++){
                if(nums[j]<nums[j+1]){
                    count++;
                } else{
                    break;
                }
            }
            if(max<count){
                max=count;
            }
            count = 1;
        }
        for(int i=0;i<nums.length-1;i++){
            for(int j=i;j<nums.length-1;j++){
                if(nums[j]>nums[j+1]){
                    count++;
                } else{
                    break;
                }
            }
            if(max<count){
                max=count;
            }
            count = 1;
        }

        return max;
    }
}