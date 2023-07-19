class Solution {
    public int minimumSwaps(int[] nums) {
        int min=nums[0];
        int minCount=0;
        int max=nums[0];
        int maxCount=0;

        for(int i=1;i<nums.length;i++){
            if(min>nums[i]){
                min=nums[i];       
                minCount=i;     
            }
            if(max<=nums[i]){
                max=nums[i];
                maxCount=i;
            }
        }

        // if((minCount>maxCount&&nums.length>2) || (maxCount>minCount)){
        //     return maxCount+minCount-1;
        // }

        // return maxCount+minCount;
        if(minCount>maxCount){
            return minCount+(nums.length-1-maxCount)-1;
        }
        
        return minCount+(nums.length-1-maxCount);

    }
}