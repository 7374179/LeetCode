class Solution:
    def countSubarrays(self, nums: List[int], k: int) -> int:
        count = 0
        max_value = max(nums)

        checkMax = 0
        left = 0
        for i in range(len(nums)):
            if nums[i] == max_value:
                checkMax += 1
            while(checkMax >= k):
                count += len(nums) - i
                if(nums[left] == max_value):
                    checkMax -= 1
                left += 1
        return count