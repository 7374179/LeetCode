class Solution {
    public int minimumOperations(int[] nums) {
        int[] arr = new int[101];
        int count = 0;
        boolean bool = true;
        for(int i=0;i<nums.length;i++){
            if(arr[nums[i]]>0) bool = false;
            arr[nums[i]]++;
        }
        if(bool){
            return count;
        }
        int three = 3;
        for(int i=0;i<nums.length;i++){
        bool = true;
            while(three>0){
                arr[nums[i]]--;
                i++;
                if(i>=nums.length) {
                    return count+1;
                }
                three--;
            }
            count++;
            i--;
            three=3;
            for(int j=0;j<arr.length;j++){
                if(arr[j]>1){
                    bool = false;
                    break;
                }
            }
            if(bool){
                return count;
            }
        }
        return count;
    }
}