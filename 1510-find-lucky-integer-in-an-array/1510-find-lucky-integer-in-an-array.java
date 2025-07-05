class Solution {
    public int findLucky(int[] arr) {
        int[] newArr = new int[501];
        int max = 0;
        for(int i=0;i<arr.length;i++){
            newArr[arr[i]]++;
        }
        for(int i=0;i<newArr.length;i++){
            if(newArr[i] == i){
                if(i>max){
                    max= i;
                }
            }
        }
        if(max == 0){
            return -1;
        }
        return max;
    }
}