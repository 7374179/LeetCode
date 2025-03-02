class Solution:
    def mergeArrays(self, nums1: List[List[int]], nums2: List[List[int]]) -> List[List[int]]:
        merged_map = {}
        for key, value in nums1:
            merged_map[key] = merged_map.get(key, 0) + value
        
        for key, value in nums2:
            merged_map[key] = merged_map.get(key, 0) + value

        return sorted([[key, value] for key, value in merged_map.items()])