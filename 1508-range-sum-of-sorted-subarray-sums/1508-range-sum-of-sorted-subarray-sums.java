class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        long[] num = new long[n*(n+1)/2];
        int z = 0;
        long tmp1 = 0;
        for(int i=0;i<nums.length;i++){
            num[z++] = nums[i];
            for(int j=i+1;j<nums.length;j++){
                tmp1 = nums[i]+nums[j];
                num[z++] = tmp1;
                for(int k=j+1;k<nums.length;k++){
                    tmp1 = tmp1 + nums[k];
                    num[z++] = tmp1;
                }
                break;
            }
        }
        Arrays.sort(num);
        long sum = 0;
        for(int i=left-1;i<right;i++){
            sum = sum + num[i];
        }
        return (int)(sum % (1_000_000_007));
    }
}