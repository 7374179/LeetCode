class Solution:
    def numberOfSubstrings(self, s: str) -> int:
        len_s = len(s)
        left, right = 0, 0
        freq = [0] * 3
        total = 0

        while(right < len_s):
            curr = s[right] 
            freq[ord(curr) - ord('a')] += 1

            while(self.hasAllChars(freq)):
                total += len_s - right
                leftChar = s[left]
                freq[ord(leftChar) - ord('a')] -= 1
                left += 1
            
            right += 1

        return total
        
    def hasAllChars(self, freq):
        return freq[0] > 0 and freq[1] > 0 and freq[2] > 0