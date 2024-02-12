class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int result=0;
        for(int i:nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])>nums.length/2){
                result = nums[i];
                break;
            }
        }
        return result;
        // int num = nums.length;
        // int[] numArray = new int[num];
        // Arrays.sort(nums);
        // int count=0;
        // int max=0;
        // int value=0;

        // if(num==1){
        //     return nums[0];
        // }

        // for(int i=1;i<num;i++){
        //     if(nums[i-1]==nums[i]){
        //         count++;
        //         if(count>max){
        //             max=count;
        //             value=nums[i];
        //         }
        //     }else{
        //         count=0;
        //     }
        // }
        // return value;
    }
}