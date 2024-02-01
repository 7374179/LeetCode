class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int[][] arr = new int[nums.length/3][3];
        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++){
            arr[i/3][i%3]=nums[i];
            if(i%3>0 && arr[i/3][i%3]-arr[i/3][0]>k){
                return new int[0][];
            }
        }
        return arr;
    }
}