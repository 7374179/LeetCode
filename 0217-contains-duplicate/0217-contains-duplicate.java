class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        // for(int i=0;i<nums.length-1;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]==nums[j]){
        //             return true;
        //         }
        //     }
        // }
        // return false;
        Set<Integer> list = new HashSet<Integer>();

        for(int i=1;i<nums.length;i++){
            list.add(nums[i-1]);
            if(list.contains(nums[i])){
                return true;
            }
        }
        return false;
    }
}