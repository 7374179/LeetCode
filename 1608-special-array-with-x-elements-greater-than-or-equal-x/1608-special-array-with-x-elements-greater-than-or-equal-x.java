class Solution {
    public int specialArray(int[] nums) {
        int num = nums.length;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int count = 0;
            for(int j=0;j<nums.length;j++){
                if(num<=nums[j]){
                    count++;
                }
            }
            if(count == num){
                return num;
            }
            num--;
        }
        return -1;
    }
}