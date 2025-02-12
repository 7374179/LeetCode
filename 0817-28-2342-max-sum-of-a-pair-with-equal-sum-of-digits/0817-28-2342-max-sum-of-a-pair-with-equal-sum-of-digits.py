class Solution:
    def maximumSum(self, nums: List[int]) -> int:
        arr = []
        max_sum = 0
        result = 0

        for num in nums:
            digit_sum = sum(int(d) for d in str(num))
            arr.append([num, digit_sum])

        arr.sort(key=lambda x: (x[1], x[0]))

        for i in range(len(nums) - 1):
            if arr[i][1] == arr[i+1][1]:
                result = arr[i][0] + arr[i+1][0]
            if result > max_sum:
                max_sum = result
            
        return max_sum if max_sum > 0 else -1