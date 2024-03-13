class Solution {
    public int pivotInteger(int n) {
        if(n==1){
            return 1;
        }
        int[] arrLeft = new int[n+1];
        int[] arrRight = new int [n+1];
        arrLeft[0]=0;
        arrRight[n]=n;
        for(int i=1;i<=n;i++){
            arrLeft[i]=arrLeft[i-1]+i;
        }
        for(int i=n-1;i>=0;i--){
            arrRight[i]=arrRight[i+1]+i;
        }
        int left=0;
        int right=n;
        while(left<right){
            int al = arrLeft[left];
            int ar = arrRight[right];
            if(arrLeft[left]<arrRight[right]){
                left++;
            }else if(arrLeft[left]>arrRight[right]){
                right--;
            }else{
                if(arrLeft[++left]==arrRight[--right]){
                    return left;
                }
            }
        }
        return -1;
    }
}