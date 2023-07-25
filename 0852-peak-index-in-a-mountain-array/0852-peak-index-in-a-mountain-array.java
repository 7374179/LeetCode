class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int count=0;
        int i=0;
        while(true){
            if((arr[i]<arr[i+1]) && (arr[i+1]>arr[i+2])){
                count=i+1;
                break;
            }
            i++;
        }
        return count;
    }
}