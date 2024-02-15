class Solution {
    public long largestPerimeter(int[] nums) {
        long[] arr = new long[nums.length];
        Arrays.sort(nums);
        arr[0]=nums[0];
        long result=0;
        for(int i=1;i<nums.length;i++){
            arr[i]=arr[i-1]+nums[i];
        }
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]<arr[i-1]){
                result=arr[i];
                break;
            }
        }
        if(result==0){
            return -1;
        }
        return result;
    }
}
