class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int min = 0;

        if(nums.length==1){
            return 0;
        }

        for(int i=1;i<nums.length;i++){
                if(nums[i]-nums[i-1]>min){
                    min=nums[i]-nums[i-1];                
            }
        }
        return min;
    }
}