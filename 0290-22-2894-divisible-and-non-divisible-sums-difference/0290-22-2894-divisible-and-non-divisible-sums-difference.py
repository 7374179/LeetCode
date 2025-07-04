class Solution:
    def differenceOfSums(self, n: int, m: int) -> int:
        diff = 0
        for i in range(1, n+1):
            if i%m!=0:
                diff += i
            else:
                diff -= i
        return diff