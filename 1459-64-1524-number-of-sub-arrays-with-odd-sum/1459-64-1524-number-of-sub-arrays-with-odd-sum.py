class Solution:
    def numOfSubarrays(self, arr: List[int]) -> int:
        MOD = 1_000_000_007
        count = 0
        prefixSum = 0
        oddCount = 0
        evenCount = 1

        for i in arr:
            prefixSum += i
            if(prefixSum % 2 ==0):
                count += oddCount
                evenCount += 1
            else:
                count += evenCount
                oddCount += 1
            
            count = count % MOD

        return count
