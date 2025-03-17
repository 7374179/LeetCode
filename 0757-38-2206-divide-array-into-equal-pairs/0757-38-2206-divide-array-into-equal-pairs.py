class Solution:
    def divideArray(self, nums: List[int]) -> bool:
        arr = [0] * 501
        for i in nums:
            arr[i] += 1
        for i in arr:
            if(i % 2 == 1):
                return False

        return True