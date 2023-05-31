class Solution {
    public int minStartValue(int[] nums) {
        int val1 = 1;
        int val2 = 1;
        int i =0;

        while(i<nums.length){
            val2+=nums[i];
            if(val2<1){
                val2=++val1;
                i=-1;
            }
            i++;
        }

        return val1;
    }
}