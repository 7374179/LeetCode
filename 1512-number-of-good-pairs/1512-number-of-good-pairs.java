class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
        }
        return count;

        // Map<Integer, Integer> counts = new HashMap<>();
        // int ans = 0;

        // for (int num: nums) {
        //     ans += counts.getOrDefault(num, 0);
        //     counts.put(num, counts.getOrDefault(num, 0) + 1);
        // }
        
        // return ans;
    }
}

