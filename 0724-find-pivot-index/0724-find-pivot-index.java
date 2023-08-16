class Solution {
    public int pivotIndex(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int sumLeft=0;
        int sumRight=0;
        int pivot = -1;
        int mid = 0;
        while(mid<=right && mid>=0){
            for(int i=0;i<mid;i++){
                sumLeft+=nums[i];
            }
            if(mid==0){
                sumLeft=0;
            }
            for(int i=mid+1;i<nums.length;i++){
                sumRight+=nums[i];
            }
            if(sumLeft==sumRight){
                pivot = mid;
                break;
            }
            mid++;
            sumLeft=0;
            sumRight=0;
        }
        return pivot;
    }
}