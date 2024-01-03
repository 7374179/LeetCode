class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];
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
                arr[i]=0;
            }else if(count==1){
                if(index==i){
                    arr[i]=sum;
                }else{
                    arr[i]=0;
                }
            }else{
                arr[i]=sum/nums[i];
            }
        }
        return arr;
    }
}