class Solution:
    def minOperations(self, grid: List[List[int]], x: int) -> int:
        arr = [num for row in grid for num in row]
        arr.sort()
        mid = arr[len(arr)//2]
        count = 0
        for num in arr:
            diff = abs(num - mid)
            if diff % x != 0:
                return -1
            count += diff // x
        return count