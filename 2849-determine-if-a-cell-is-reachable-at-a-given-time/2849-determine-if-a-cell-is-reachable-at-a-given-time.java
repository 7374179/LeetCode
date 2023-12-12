class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        int tmpX=(int)Math.sqrt(Math.pow(sx-fx, 2));
        int tmpY=(int)Math.sqrt(Math.pow(sy-fy, 2));
        int tmp=(int)Math.max(tmpX, tmpY);

        if(sx==fx && sy==fy){
            if(t==1){
                return false;
            }else{
                return true;
            }
        }
        return tmp<=t;
    }
}