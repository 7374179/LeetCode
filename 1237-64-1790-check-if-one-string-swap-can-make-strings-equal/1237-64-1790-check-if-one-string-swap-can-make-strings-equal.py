class Solution:
    def areAlmostEqual(self, s1: str, s2: str) -> bool:
        count = 0
        arr = [0] * 26
        for i in range(len(s1)):
            arr[ord(s1[i]) - ord('a')] += 1
            arr[ord(s2[i]) - ord('a')] -= 1

        for val in arr:
            if val<0:
                return False

        for i in range(len(s1)):
            if s1[i] != s2[i]:
                count += 1
        
        return count<3