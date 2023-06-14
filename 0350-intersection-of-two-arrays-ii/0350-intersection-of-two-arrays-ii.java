class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> sec = new ArrayList<Integer>();

        for(int i=0;i<nums1.length;i++){
            list.add(nums1[i]);
        }

        for(int i=0;i<nums2.length;i++){
            if(list.contains(nums2[i])){
                sec.add(nums2[i]);
                list.remove(Integer.valueOf(nums2[i]));
            }
        }
        int len = sec.size();
        
        int[] arr = new int[len];

        for(int i=0;i<len;i++){
            arr[i]=sec.get(i);
        }
        return arr;
    }
}