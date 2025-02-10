class Solution:
    def clearDigits(self, s: str) -> str:
        stack = []
        for char in s:
            if '0' <= char <= '9':
                if stack:
                    stack.pop()
            else:
                stack.append(char)
        
        return ''.join(stack)