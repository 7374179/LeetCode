class Solution {
    public int[] closestPrimes(int left, int right) {
        int[] arr = new int[2];
        int min = Integer.MAX_VALUE;
        int tmp1 = 0;
        int tmp2 = 0;
        for(int i=left;i<=right;i++){
            if(isPrime(i)){
                if(tmp1==0 && tmp2==0){
                    tmp1 = i;
                }else if(tmp1!=0 && tmp2==0){
                    tmp2 = i;
                    min = tmp2-tmp1;
                    arr[0] = tmp1;
                    arr[1] = tmp2;
                }else if(tmp1!=0 && tmp2!=0){
                    tmp1 = tmp2;
                    tmp2 = i;
                    if(min == tmp2-tmp1){
                        continue;
                    }
                    if(min > tmp2-tmp1){
                        min = tmp2-tmp1;
                        arr[0] = tmp1;
                        arr[1] = tmp2;
                    }
                }
            }
        }
        if(arr[0]==0 && arr[1]==0){
            arr[0] = -1;
            arr[1] = -1;
            return arr;
        }
        return arr;
    }
    private boolean isPrime(int num){
        if(num<=1) return false;
        if(num==2) return true;
        if(num%2==0) return false;
        for(int j=3;j<=Math.sqrt(num);j+=2){
            if(num%j==0) return false;
        }
        return true;
    }
}