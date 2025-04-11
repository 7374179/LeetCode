class Solution:
    def countSymmetricIntegers(self, low: int, high: int) -> int:
        count = 0
        for i in range(low, high + 1):
            s = str(i)
            if len(s)%2 == 1:
                continue
            n = len(s) // 2
            sum_start = sum(int(s[j]) for j in range(n))
            sum_end = sum(int(s[-1-j]) for j in range(n))
            if sum_start == sum_end:
                count += 1
        return count
