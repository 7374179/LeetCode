class Solution {
    public int maxFrequency(int[] nums, int k) {
        int count=0;
        int tmp=k;
        int max=0;
        Arrays.sort(nums);
        for(int i=nums.length-1;i>0;i--){
            count=0;
            tmp=k;
            if(max>i){
                break;
            }
            for(int j=i-1;j>=0;j--){
                if(nums[i]-nums[j]<=tmp){
                    tmp=tmp-(nums[i]-nums[j]);
                    count++;
                    max=Math.max(max, count);                
                }else{
                    count=0;
                    tmp=k;
                    break;
                }
            }
        }
        return max+1;
    }
}