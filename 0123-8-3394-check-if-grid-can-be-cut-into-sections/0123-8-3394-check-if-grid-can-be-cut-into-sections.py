class Solution:
    def checkValidCuts(self, n: int, rectangles: List[List[int]]) -> bool:
        return self.checkCuts(rectangles, 0) or self.checkCuts(rectangles, 1)

    def checkCuts(self, rectangles, dim):
        gapCount = 0
        rectangles.sort(key=lambda x: x[dim])
        furthestEnd = rectangles[0][dim+2]

        for i in range(1, len(rectangles)):
            rect = rectangles[i]
            if furthestEnd <= rect[dim]:
                gapCount += 1
            furthestEnd = max(furthestEnd, rect[dim+2])

        return gapCount >= 2
