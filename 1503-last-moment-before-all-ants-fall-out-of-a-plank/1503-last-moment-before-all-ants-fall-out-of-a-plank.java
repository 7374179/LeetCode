class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        int countL=0;
        int countR=0;
        Arrays.sort(left);
        Arrays.sort(right);

        if(left.length!=0){
            countL=left[left.length-1];
        }
        if(right.length!=0){
            countR=right[0];
        }

        if(left.length!=0 && right.length!=0){
            return Math.max(countL, n-countR);
        }else if(left.length!=0 && right.length==0){
            return countL;
        }else{
            return n-countR;
        }
    }
}