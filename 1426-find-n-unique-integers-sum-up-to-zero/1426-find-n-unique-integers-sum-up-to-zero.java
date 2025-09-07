class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        int tmp = 1;

        if(n==1) {
            return arr;
        }

        for(int i=0;i<(n/2)*2;i=i+2){
            arr[i] = tmp;
            arr[i+1] = -(tmp);
            tmp++;
        }

        return arr;
    }
}