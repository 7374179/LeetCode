class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] arr = new int[nums.length];
        int pos=0;
        int neg=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                if(nums[pos]>0){
                    arr[i]=nums[pos++];
                }else{
                    while(nums[pos]<0){
                        pos++;
                    }
                    arr[i]=nums[pos++];
                }
            }else{
                if(nums[neg]<0){
                    arr[i]=nums[neg++];
                }else{
                    while(nums[neg]>0){
                        neg++;
                    }
                    arr[i]=nums[neg++];
                }
            }
        }
        return arr;
    }
}