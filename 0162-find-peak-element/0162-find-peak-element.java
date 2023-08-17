class Solution {
    public int findPeakElement(int[] nums) {
        int curr=1;
        int index=0;

        while(curr<nums.length-1){
            if(nums[curr]>nums[curr-1] && nums[curr]>nums[curr+1]){
                index=curr;
                break;
            }else if(nums[curr]>nums[curr+1]){
                curr=curr+2;
            }else if(nums[curr]<nums[curr+1]){
                curr++;
            }
        }

        if(nums.length==1){
            return 0;
        }

        if(index==0){
            if(nums[0]>nums[1]){
                return 0;
            }else if(nums[nums.length-1]>nums[nums.length-2]){
                return nums.length-1;
            }
        } 
        if(nums.length==1){
            return 0;
        }
        return index;
    }
}