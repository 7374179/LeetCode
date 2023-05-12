class Solution {
    public int addDigits(int num) {
        int tmp=0;
        int sum=0;
        while(num>0&&sum<10){
            tmp+=num%10;
            num=num/10;
            if(num==0&&tmp<10){
                sum= tmp;
                break;
            }
            if(num==0){
                num=tmp;     
                tmp=0;           
            }
        }
        return sum;
    }
}