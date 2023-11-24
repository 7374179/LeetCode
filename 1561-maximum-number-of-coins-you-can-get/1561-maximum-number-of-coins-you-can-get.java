class Solution {
    public int maxCoins(int[] piles) {
        int sum=0;
        int count=0;
        Arrays.sort(piles);
        for(int i=piles.length-2;i>=0;i=i-2){
            if(count==piles.length/3){
                break;
            }
            sum=sum+piles[i];
            count++;
        }
        return sum;
    }
}