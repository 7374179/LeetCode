class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        int[] arr = new int[nums1.length];
        for(int i=0;i<nums2.length;i++){
            map.put(i, nums2[i]);
            if(nums2[i]>max){
                max = nums2[i];
            }
        }
        for(int i=0;i<nums1.length;i++){
            if(nums1[i] == max){
                arr[i] = -1;
            } else {
                int key = 0;
                for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
                    if(entry.getValue().equals(nums1[i])){
                        key = entry.getKey();
                        break;
                    }
                }
                if(key==nums2.length-1){
                    arr[i] = -1;
                } else {
                    int j = key+1;
                    while(key<nums2.length){
                        if(nums1[i]<nums2[key]){
                            arr[i] = nums2[key];
                            break;
                        }
                        key++;
                        if(key==nums2.length){
                            arr[i] = -1;
                            break;
                        }
                    }
                }
            }
        }
        return arr;
    }
}