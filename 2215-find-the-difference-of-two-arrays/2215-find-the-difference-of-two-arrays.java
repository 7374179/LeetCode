class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            set2.add(nums2[i]);
        }

        list.add(new ArrayList<>());
        for(int i=0;i<nums2.length;i++){
            if(!set1.contains(nums2[i])&&!list.get(1).contains(nums2[i])){
                list.get(1).add(nums2[i]);
            }
        }

        for(int i=0;i<nums1.length;i++){
            if(!set2.contains(nums1[i])&&!list.get(0).contains(nums1[i])){
                list.get(0).add(nums1[i]);
            }
        }
        return list;
    }
}