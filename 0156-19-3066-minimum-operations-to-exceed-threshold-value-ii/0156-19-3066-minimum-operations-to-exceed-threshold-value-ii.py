class Solution:
    def minOperations(self, nums: List[int], k: int) -> int:
        pq = []
        count = 0

        for num in nums:
            heapq.heappush(pq, num)

        while len(pq) > 1:
            if pq[0] >=k:
                break
            
            x = heapq.heappop(pq)
            y = heapq.heappop(pq)
            heapq.heappush(pq, min(x, y) * 2 + max(x, y))
            count += 1
        
        return count