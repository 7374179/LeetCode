class Solution:
    def minCapability(self, nums: List[int], k: int) -> int:
        min_val = 1
        max_val = max(nums)
        total = len(nums)

        while min_val<max_val:
            mid = (min_val+max_val) // 2
            possible = 0
            i = 0
            while i < total:
                if nums[i] <= mid:
                    possible += 1
                    i += 1
                i += 1
            
            if possible >= k:
                max_val = mid
            else: min_val = mid + 1
        
        return min_val