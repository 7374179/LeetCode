class Solution {
    public int totalMoney(int n) {
        int sum=0;
        int tmp=0;
        for(int i=1;i<=n;i++){
            tmp=i/7;
            if(i%7!=0){
                sum=sum+i%7+tmp;
            }else{
                sum=sum+7+tmp-1;
            }
        }
        return sum;
    }
}