class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int count = 0;
        int sum = 0;
        int len = nums.length-1;
        int left=0;

        for(int i:nums){
            sum+=i;
        }
        if(target>sum){
            return 0;
        }else if(target==nums[len]||target==nums[0]){
            return 1;
        }else{
            sum = 0;
        }
        int tmp = left;
        int min =Integer.MAX_VALUE;

        while(tmp<len){
            sum+=nums[left];
            count++;
            if(sum==target||sum>target){
                if(count<min){
                    min=count;
                    tmp++;
                    left=tmp;
                    sum=0;
                    count=0;
                }else{
                    tmp++;
                    left=tmp;
                    sum=0;
                    count=0;
                }
            }else{
                if(left==len){
                    break;
                }
                left++;
            }
        }

        return min;
    }
}