class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<Math.max(nums1.length, nums2.length);i++){
            if(i<nums1.length){
                set.add(nums1[i][0]);
            }
            if(i<nums2.length){
                set.add(nums2[i][0]);
            }
        }
        int[][] arr = new int[set.size()][2];
        int i = 0;
        int j = 0;
        int k = 0;
        while(k <arr.length){
            if(i<nums1.length && j<nums2.length && nums1[i][0]==nums2[j][0]){
                arr[k][0]=nums1[i][0];
                arr[k][1]=nums1[i][1]+nums2[j][1];
                i++;
                j++;
                k++;
            } else if(i<nums1.length && j<nums2.length && nums1[i][0]<nums2[j][0]){
                arr[k][0]=nums1[i][0];
                arr[k][1]=nums1[i][1];
                i++;
                k++;
            } else if(i<nums1.length && j<nums2.length && nums1[i][0]>nums2[j][0]){
                arr[k][0]=nums2[j][0];
                arr[k][1]=nums2[j][1];
                j++;
                k++;
            } else if(i==nums1.length){
                arr[k][0]=nums2[j][0];
                arr[k][1]=nums2[j][1];
                j++;
                k++;
            } else if(j==nums2.length){
                arr[k][0]=nums1[i][0];
                arr[k][1]=nums1[i][1];
                i++;
                k++;
            }
        }
        return arr;
    }
}