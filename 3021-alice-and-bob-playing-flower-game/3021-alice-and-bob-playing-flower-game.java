class Solution {
    public long flowerGame(int n, int m) {
        long evenN=n/2;
        long oddN=n-evenN;
        long evenM=m/2;
        long oddM=m-evenM;
        
        return evenN*oddM + oddN*evenM;
    }
}