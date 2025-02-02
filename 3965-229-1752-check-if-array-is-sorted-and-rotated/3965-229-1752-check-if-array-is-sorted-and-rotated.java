class Solution {
    public boolean check(int[] nums) {
        int rot = 0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] > nums[i+1]){
                rot = i+1;
                break;
            }
        }
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i] = nums[i];
        }
        Arrays.sort(arr);
        for(int i=0;i<nums.length;i++){
            if(arr[i]!=nums[(i+rot)%arr.length]){
                return false;
            }
        }
        return true;
    }
}