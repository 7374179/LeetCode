class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==1){
                if((i+2)<arr.length && arr[i+1]%2==1 && arr[i+2]%2==1){
                    return true;
                }                
            }
        }
        return false;
    }
}