class Solution {
    public long countSubarrays(int[] nums, int k) {
        long count = 0;
        int max = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max = nums[i];
            }
        }
        int checkMax = 0;
        // Deque<Integer> dq = new ArrayDeque<>();
        int left = 0;
        // int right = left;
        for(int right=0;right<nums.length;right++){
            if(nums[right]==max){
                checkMax++;
            }
            // dq.addLast(nums[right]);
            while(checkMax >= k) {
                count += nums.length - right;
                if(nums[left] == max) {
                    checkMax--;
                }
                left++;
            }
            // if(checkMax==k){
            //     count = count + nums.length-right;
            //     if(dq.peekFirst()==max){
            //         checkMax--;
            //     }
            //     left++;
            //     right = left;
            //     checkMax = 0;
            //     dq.clear();
            // } else {
            //     right++;
            // }
        }
        return count;
    }
}