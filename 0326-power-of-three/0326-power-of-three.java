class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<0||n==0){
            return false;
        }
        while(n!=1){
            if(n%3!=0){
                return false;
            }else{
                n=n/3;
                if(n==1){
                    return true;
                }
            }
        }
        return true;
    }
}