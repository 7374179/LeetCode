class Solution {
    public boolean lemonadeChange(int[] bills) {
        if(bills[0]!=5){
            return false;
        }
        int five=0;
        int ten=0;
        int ee=0;
        int sum=0;

        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
                five++;
            }else if(bills[i]==10){
                ten++;
                five--;
            }else{
                ee++;
                if(ten>0){
                    ten--;
                    five=five-1;
                }else{
                    five=five-3;
                }
            }
            if(five<0||ten<0){
                return false;
            }
        }
        return true;
    }
}