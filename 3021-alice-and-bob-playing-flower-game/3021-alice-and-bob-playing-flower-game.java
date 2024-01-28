class Solution {
    public long flowerGame(int n, int m) {
        return (long)n/2*(m-m/2) + (long)(n-n/2)*(m/2);
    }
}