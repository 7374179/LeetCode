class Solution {
    public boolean isBalanced(String num) {
        int nums = 0;
        for(int i=0;i<num.length();i++){
            if(i%2==0){
                nums = nums + (num.charAt(i)-'0');
            }else{
                nums = nums - (num.charAt(i)-'0'); 
            }
        }
        if(nums==0){
            return true;
        }
        return false;
    }
}