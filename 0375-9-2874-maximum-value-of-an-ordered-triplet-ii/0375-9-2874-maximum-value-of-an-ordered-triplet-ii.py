class Solution:
    def maximumTripletValue(self, nums: List[int]) -> int:
        res = 0
        imax = 0
        dmax = 0
        for i in range(len(nums)):
            res = max(res, dmax * nums[i])
            dmax = max(dmax, imax - nums[i])
            imax = max(imax, nums[i])
        return res