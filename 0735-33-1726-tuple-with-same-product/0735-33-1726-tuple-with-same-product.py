class Solution:
    def tupleSameProduct(self, nums: List[int]) -> int:
        map = defaultdict(int)
        count = 0

        for i in range(len(nums)-1):
            for j in range(i+1, len(nums)):
                product = nums[i] * nums[j]
                map[product] += 1

        for i in map.values():
            if i>1:
                count += (i * (i-1)//2) * 8

        return count