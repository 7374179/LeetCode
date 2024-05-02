class Solution {
    public int findMaxK(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int max = Integer.MIN_VALUE;
        for(int num:nums){
            if(set.contains(num*(-1))){
                if(Math.abs(num)>max){
                    max=Math.abs(num);
                }
            }else{
                set.add(num);
            }
        }
        if(max!=Integer.MIN_VALUE){
            return max;
        }
        return -1;
    }
}