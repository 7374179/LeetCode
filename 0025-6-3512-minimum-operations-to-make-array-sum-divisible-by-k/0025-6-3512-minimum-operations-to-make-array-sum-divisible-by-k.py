class Solution:
    def minOperations(self, nums: List[int], k: int) -> int:
        # sum = 0
        # for i in range(len(nums)):
        #     sum += nums[i]
        s = sum(nums)
        return s%k