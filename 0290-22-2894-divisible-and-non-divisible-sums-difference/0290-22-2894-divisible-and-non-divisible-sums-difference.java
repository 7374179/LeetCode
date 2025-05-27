class Solution {
    public int differenceOfSums(int n, int m) {
        int diff = 0;
        for(int i=1;i<=n;i++){
            if(i%m!=0){
                diff = diff+i;
            } else {
                diff = diff-i;

            }
        }
        return diff;
    }
}