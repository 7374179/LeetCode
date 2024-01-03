class Solution {
    public int[] productExceptSelf(int[] nums) {
        int sum=1;
        int count=0;
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                sum=sum*nums[i];
            }else if(nums[i]==0){
                count++;
                index=i;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(count>1){
                nums[i]=0;
            }else if(count==1){
                if(index==i){
                    nums[i]=sum;
                }else{
                    nums[i]=0;
                }
            }else{
                nums[i]=sum/nums[i];
            }
        }
        return nums;
    }
}