class Solution {
    public String findDifferentBinaryString(String[] nums) {
        Arrays.sort(nums);     
        int len = nums.length;   
        int num = (int)Math.pow(2, nums.length);
        String str="";

        int i=0;
        while(i<num){
           str = Integer.toBinaryString(i);
            while(str.length()!=len){
                str="0"+str;
            }
            if(i==len){
                break;
            }
            if(str.equals(nums[i])){
                i++;
            } else{
                return str;
            }
        }       

        return str;
    }
}