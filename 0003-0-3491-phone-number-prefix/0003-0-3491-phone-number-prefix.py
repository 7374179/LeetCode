class Solution:
    def phonePrefix(self, numbers: List[str]) -> bool:
        for i in range(len(numbers)):
            for j in range(len(numbers)):
                if i == j:
                    continue
                if numbers[i].startswith(numbers[j]):
                    return False

        return True