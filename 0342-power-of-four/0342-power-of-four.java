class Solution {
    public boolean isPowerOfFour(int n) {
        int tmp=0;
        int i=0;
        if(n==1){
            return true;
        }
        while(tmp<=n){
            if(Math.pow(4, i)<n){
                i++;
            }else if(Math.pow(4, i)>n){
                return false;
            }else{
                return true;
            }
        }
        return false;
    }
}