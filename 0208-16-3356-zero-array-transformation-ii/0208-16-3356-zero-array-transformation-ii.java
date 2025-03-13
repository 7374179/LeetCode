class Solution {
    public int minZeroArray(int[] nums, int[][] queries) {
        int n = nums.length, left = 0, right = queries.length;
        if(!currentIndexZero(nums, queries, right)) return -1;

        while(left<=right){
            int middle = left + (right-left) /2;
            if(currentIndexZero(nums, queries, middle)){
                right = middle-1;
            } else{
                left = middle+1;
            }
        }        
        return left;
    }
    private boolean currentIndexZero(int[] nums, int[][]queies, int k){
        int n = nums.length, sum = 0;
        int[] differenceArray = new int[n+1];

        for(int queryIndex = 0;queryIndex<k;queryIndex++){
            int val = queies[queryIndex][2];
            int left = queies[queryIndex][0];
            int right = queies[queryIndex][1];

            differenceArray[left] += val;
            differenceArray[right+1] -= val;
        }
        for(int numIndex=0;numIndex<n;numIndex++){
            sum += differenceArray[numIndex];
            if(sum<nums[numIndex]) return false;
        }
        return true;
    }
}