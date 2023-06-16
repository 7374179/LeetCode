class Solution {
    public int arrangeCoins(int n) {
        int count=0;
        int m = n;
        
        for(int i=1;i<=m;i++){
            n=n-i;
            if(n<0){
                count = i-1;
                break;
            }else if(n==0){
                count = i;
                break;
            }
        }
        return count;
    }
}