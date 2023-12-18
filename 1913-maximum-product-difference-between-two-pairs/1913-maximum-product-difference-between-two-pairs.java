class Solution {
    public int maxProductDifference(int[] nums) {
        int maxA=Integer.MIN_VALUE;
        int maxB=Integer.MIN_VALUE;
        int minA=Integer.MAX_VALUE;
        int minB=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>maxA){
                maxB=maxA;
                maxA=nums[i];
            }else if(nums[i]>maxB){
                maxB=nums[i];
            }
            if(nums[i]<minA){
                minB=minA;
                minA=nums[i];
            }else if(nums[i]<minB){
                minB=nums[i];
            }
        }
        return maxA*maxB-minA*minB;
    }
}