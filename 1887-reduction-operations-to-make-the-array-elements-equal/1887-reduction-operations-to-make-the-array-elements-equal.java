class Solution {
    public int reductionOperations(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        int count=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]!=nums[i]){
                count++;
            }
            sum=sum+count;
        }
        return sum;
    }
}

