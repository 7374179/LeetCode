class Solution:
    def sumOfGoodNumbers(self, nums: List[int], k: int) -> int:
        sum = 0
        for i in range(len(nums)):
            if(i-k<0 and i+k<len(nums)):
                if nums[i+k] < nums[i]:
                    sum += nums[i]
            elif i+k >= len(nums):
                if nums[i-k] < nums[i]:
                    sum += nums[i]
            elif i-k>=0 and i+k<len(nums):
                if nums[i-k]<nums[i] and nums[i]>nums[i+k]:
                    sum += nums[i]
        return sum
