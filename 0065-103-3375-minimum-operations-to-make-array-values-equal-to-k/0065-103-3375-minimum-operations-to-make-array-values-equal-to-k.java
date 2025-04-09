class Solution {
    public int minOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 0;
        int i = nums.length-1;
        while(i>=0) {
            int tmp = nums[i];
            if(tmp>k){
                while(i>=0){
                    if(tmp==nums[i]){
                        i--;
                    }else {
                        break;
                    }
                }
            }else if(tmp==k){
                if(i!=0){
                    while(i>=0){
                        if(tmp==nums[i]){
                            i--;
                        }else{
                            break;
                        }
                    }
                    if(i<0){
                        return count;
                    }else{
                        return -1;
                    }
                }
                return count;
            }else{
                return -1;
            }
            count++;
        }
        return count;
    }
}