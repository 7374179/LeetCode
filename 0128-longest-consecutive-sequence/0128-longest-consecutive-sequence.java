class Solution {
    public int longestConsecutive(int[] nums) {
        // 풀었지만 O(n) 만족 시키지 못함
        if(nums.length==0){
            return 0;
        }
        Set<Integer> set = new TreeSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int count=0;
        int max=0;
        int prev=Integer.MIN_VALUE;
        for(int val:set){
            if(prev!=Integer.MIN_VALUE && prev+1==val){
                count++;
            }else{
                if(max<count){
                    max=count;
                }
                count=0;
            }
            prev=val;
        }
        return Math.max(count+1,max+1);
    }
}