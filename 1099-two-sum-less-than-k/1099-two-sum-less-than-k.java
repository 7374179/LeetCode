class Solution {
    public int twoSumLessThanK(int[] nums, int k) {
        int left = 0;
        int right = nums.length-1;
        Arrays.sort(nums);
        int max = Integer.MIN_VALUE;
        int i=0;
        if(nums.length==1){
            return -1;
        }

        while(i<nums.length){
            while(left<=right){
                int mid = left+ (right-left)/2;
                if(nums[i]+nums[mid]<k){
                    if(max<nums[i]+nums[mid]){
                        max=nums[i]+nums[mid];
                    }else{
                        left=mid+1;
                    }
                }else if(nums[i]+nums[mid]>k){
                    right=mid-1;
                }else{
                    if(max>k){
                        return -1;
                    }else{
                        // max=nums[i]+nums[mid];
                        // return max;
                        break;
                    }
                }
            }
            i++;
            left= i+1;
            right=nums.length-1;
        }
        if(max>0){
            return max;
        }else{
            return -1;
        }
    }
}