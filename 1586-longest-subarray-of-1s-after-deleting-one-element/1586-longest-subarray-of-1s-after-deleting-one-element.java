class Solution {
    public int longestSubarray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int count = 0;
        int zero = 1;
        int tmp = 0;

        int i = 0;

        int sum=0;
        for(int j=0;j<nums.length;j++){
            sum+=nums[j];
        }
        if(nums.length==sum){
            return sum-1;
        }else if(sum==0){
            return 0;
        }

        while(i<nums.length){
            if(nums[i]==1){
                count++;
                i++;
                if(i==nums.length&&count>max){
                    max=count;
                }
            }else{
                if(zero!=0){
                    tmp=i;
                    zero--;
                    i++;
                    continue;
                }
                if(count>max){
                    max=count;
                    count=0;
                    zero=1;
                    i=tmp+1;
                }else if(count<=max){
                    count=0;
                    zero=1;
                    i=tmp+1;
                }
            }        
        }
        return max;
    }
}