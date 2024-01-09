class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length==1){
            return;
        }
        k=k%nums.length;
        int[] arr1 = new int[k];
        int[] arr2 = new int[nums.length-k];

        for(int i=0;i<k;i++){
            arr1[i]=nums[nums.length-k+i];
        }
        for(int i=0;i<nums.length-k;i++){
            arr2[i]=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(i<k){
                nums[i]=arr1[i];
            }else{
                nums[i]=arr2[i-k];
            }
        }
    }
}