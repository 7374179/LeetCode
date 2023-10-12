class Solution {
    public int removeDuplicates(int[] nums) {
        int count=0;
        int ele=0;
        int tmp = nums[0];
        for(int i=1;i<nums.length;i++){
            if(tmp==nums[i]){
                if(ele>0){
                    count++;
                    ele++;
                    nums[i]=Integer.MIN_VALUE;
                }else{
                    ele++;
                }
            } else{
                tmp=nums[i];
                ele=0;
            }
        }
        int i=0;
        int num=0;
        while(i<nums.length-count){
            if(nums[i]!=Integer.MIN_VALUE){
                i++;
                num++;
            }else{
                while(nums[num]==Integer.MIN_VALUE){
                    num++;
                }

                int temp = nums[i];
                nums[i]=nums[num];
                nums[num]=temp;
                num=i;
            }
        }

        return nums.length-count ;
    }
}