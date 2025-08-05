class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int rem = 0;

        for(int i=0;i<fruits.length;i++){
            for(int j=0;j<baskets.length;j++){
                if(fruits[i]<=baskets[j]){
                    baskets[j] = 0;
                    break;
                }
                if(j==baskets.length-1){
                    rem++;
                }
            }
        }
        return rem;
    }
}