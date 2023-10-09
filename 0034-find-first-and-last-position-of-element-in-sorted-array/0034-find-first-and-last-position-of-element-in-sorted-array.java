class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2];
        arr[0]=-1;
        arr[1]=-1;
        if(nums.length==0){
            return arr;            
        }
        int left=0;
        int right = nums.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]>target){
                right=mid-1;
            }else if(nums[mid]<target){
                left=mid+1;
            }else{
                arr[0]=mid;
                int tmp=arr[0];
                while(nums[tmp]==target && tmp<nums.length-1){
                    tmp++;
                }
                if(nums[tmp]==target){
                    arr[1]=tmp;
                }else{
                    arr[1]=tmp-1;
                }

                tmp = arr[0];
                while(nums[tmp]==target && tmp>0){
                    tmp--;
                }
                if(nums[tmp]==target){
                    arr[0]=tmp;
                }else{
                    arr[0]=tmp+1;
                }
                return arr;
            }
        }
        return arr;
    }
}