class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int result = 0;
        int currentSum = 0;
        Set<Integer> set = new HashSet<>();
        int start = 0;
        for(int i=0;i<nums.length;i++){
            while(set.contains(nums[i])) {
                set.remove(nums[start]);
                currentSum -= nums[start];
                start++;
            }
            currentSum += nums[i];
            set.add(nums[i]);
            result = Math.max(result, currentSum);
        }
        return result;
    }
}