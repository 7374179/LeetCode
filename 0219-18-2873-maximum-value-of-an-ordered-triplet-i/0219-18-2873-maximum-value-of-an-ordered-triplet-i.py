class Solution:
    def maximumTripletValue(self, nums: List[int]) -> int:
        max = 0
        for i in range(len(nums)-2):
            for j in range(i+1, len(nums)-1):
                for k in range(j+1,len(nums)):
                    if(max<(nums[i]-nums[j])*nums[k]):
                        max = (nums[i]-nums[j])*nums[k]
        if max<0:
            return 0;
        return max