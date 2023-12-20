class Solution {
    public int buyChoco(int[] prices, int money) {
        int min=Integer.MAX_VALUE;
        int nextMin=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                nextMin=min;
                min=prices[i];
            }else{
                nextMin=Math.min(prices[i], nextMin);
            }
        }
        int sum=money-min-nextMin;
        return sum>=0?sum:money;
    }
}