class Solution {
    public long coloredCells(int n) {
        long num = calculate(n-1);
        return num;
    }

    private long calculate(int n){
        if(n==0){
            return 1;
        }
        long tmp = 4*n + calculate(n-1);
        return tmp;
    }
}
