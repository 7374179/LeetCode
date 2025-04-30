class Solution:
    def findNumbers(self, nums: List[int]) -> int:
        count = 0
        for num in nums:
            if(num>=10 and num<=99) or (num>=1000 and num<=9999) or num == 100000:
                count+= 1

        return count