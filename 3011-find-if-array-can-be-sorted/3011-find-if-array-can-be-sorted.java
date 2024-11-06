class Solution {
    public boolean canSortArray(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            String str = Integer.toBinaryString(nums[i]);
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)=='1'){
                    arr[i]++;
                }
            }
        }
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(nums[i]>nums[j]){
                    if(arr[i]==arr[j]){
                        int tmp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = tmp;
                    }else{
                        return false;
                    }
                }
            }
        }
        return true;
    }
}