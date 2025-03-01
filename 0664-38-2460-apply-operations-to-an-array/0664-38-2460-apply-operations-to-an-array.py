class Solution:
    def applyOperations(self, nums: List[int]) -> List[int]:
        for i in range(0, len(nums)-1):
            if nums[i] == nums[i+1]:
                nums[i]=nums[i]*2
                nums[i+1]=0
        
        left=0
        right=left+1
        while (right<len(nums)):
            if nums[left] != 0 and nums[right] !=0:
                left += 1
                right += 1

            elif nums[left]!=0 and nums[right]==0:
                left+=1
                right+1
            elif nums[left]==0 and nums[right]==0:
                right+=1
            elif nums[left]==0 and nums[right]!=0:
                tmp = nums[left]
                nums[left] = nums[right]
                nums[right] = tmp
                left+=1
                right+=1
        
        return nums