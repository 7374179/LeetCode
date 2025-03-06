class Solution:
    def findMissingAndRepeatedValues(self, grid: List[List[int]]) -> List[int]:
        n = len(grid)
        arr = [0,0]
        num_set = set(range(1, n*n+1))

        for i in range(n):
            for j in range(n):
                if grid[i][j] in num_set:
                    num_set.remove(grid[i][j])
                else:
                    arr[0] = grid[i][j]
        
        arr[1] = num_set.pop()
        return arr