class Solution:
    def maxAbsoluteSum(self, nums: List[int]) -> int:
        prefixSum = 0
        minPrefixSum = 0
        maxPrefixSum = 0

        for i in range(0, len(nums)):
            prefixSum += nums[i]            
            minPrefixSum = min(minPrefixSum, prefixSum)
            maxPrefixSum = max(maxPrefixSum, prefixSum)
        
        return maxPrefixSum - minPrefixSum