class Solution {
    public String losingPlayer(int x, int y) {
        int count = 0;
        while(x>=0 || y>=0){
            if(x>=1 && y>=4){
                x = x-1;
                y = y-4;
                count++;
            }else{
                break;
            }
        }
        if(count%2 == 0){
            return "Bob";
        }
        return "Alice";
    }
}