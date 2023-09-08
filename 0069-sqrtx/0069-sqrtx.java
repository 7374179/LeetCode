class Solution {
    public int mySqrt(int x) {
        int a=0;

        if(x==1 || x==2){
            return 1;
        }

        for(int i=1;i<x;i++){
            if(i*i==x){
                a=i;
                break;
            }else if(i*i>x || i*i<0){
                a=i-1;
                break;
            }

        }
        return a;
    }
}