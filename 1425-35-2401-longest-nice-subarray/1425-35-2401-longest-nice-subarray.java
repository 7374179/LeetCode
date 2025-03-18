class Solution {
    public int longestNiceSubarray(int[] nums) {
        int usedBits = 0;
        int windowStart = 0;
        int maxLength = 0;

        for(int windowEnd=0;windowEnd<nums.length;++windowEnd){
            while((usedBits & nums[windowEnd]) != 0){
                usedBits ^= nums[windowStart];
                windowStart++;
            }
            usedBits |= nums[windowEnd];

            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }
        return maxLength;
    }
}