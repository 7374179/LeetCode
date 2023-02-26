class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int tmp=0;
        for(int i=0;i<n;i++){
            nums1[m++]=nums2[i];
        }

        for(int i=0;i<m-1;i++){
            for(int j=i+1;j<m;j++){
                if(nums1[i]>nums1[j]){
                    tmp = nums1[i];
                    nums1[i]=nums1[j];
                    nums1[j]=tmp;
                }
            }
        }
    }
}