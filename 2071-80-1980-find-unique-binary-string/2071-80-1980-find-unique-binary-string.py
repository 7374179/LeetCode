class Solution:
    def findDifferentBinaryString(self, nums: List[str]) -> str:
        nums.sort()
        len_nums = len(nums)
        num = 2**len(nums)

        i = 0
        while i < num:
            str_binary = bin(i)[2:]
            str_binary = '0' * (len_nums - len(str_binary)) + str_binary

            if i == len_nums:
                break
            
            if str_binary == nums[i]:
                i += 1
            else:
                return str_binary

        return str_binary