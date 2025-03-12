class Solution:
    def maximumCount(self, nums: List[int]) -> int:
        max = 0
        for i in range(len(nums)):
            if nums[i]<0:
                max += 1
            elif nums[i]>0:
                if len(nums)-i > max:
                    max = len(nums)-i
            else:
                continue
        
        return max