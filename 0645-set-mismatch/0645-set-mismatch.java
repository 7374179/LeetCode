class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] num = new int[nums.length+1];
        int[] arr = new int[2];

        for(int i : nums){
            num[i]++;
        }
        
        for(int i=0;i<num.length;i++){
            if(num[i]==2){
                arr[0]=i;
            }else if(num[i]==0){
                arr[1]=i;
            }
        }

        return arr;
    }
}