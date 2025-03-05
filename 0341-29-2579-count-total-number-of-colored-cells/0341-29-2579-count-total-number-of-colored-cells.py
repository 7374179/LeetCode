class Solution:
    def coloredCells(self, n: int) -> int:
        num = self._calculate(n-1)
        return num

    def _calculate(self, n:int) -> int:
        if n==0: return 1
        tmp = 4 * n + self._calculate(n-1)
        return tmp