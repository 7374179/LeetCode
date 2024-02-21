class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        if(left==right){
            return left;
        }
        String leftStr = Integer.toBinaryString(left);
        String rightStr = Integer.toBinaryString(right);
        long result=left;
        if(leftStr.length()!=rightStr.length()){
            return 0;
        }else{
            for(long i=left+1;i<=right;i++){
                result=result&i;
            }
            return (int)result;
        }
    }
}

