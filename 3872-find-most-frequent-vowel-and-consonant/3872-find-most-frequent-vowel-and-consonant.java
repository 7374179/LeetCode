class Solution {
    public int maxFreqSum(String s) {
        int[] arr = new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i) - 'a']++;
        }
        int vowMax = findMax(arr, "vow");
        int conMax = findMax(arr, "con");
        return vowMax + conMax;
    }
    private int findMax(int[] arr, String type) {
        if(type == "vow"){
            int[] indices = {0, 4, 8, 14, 20};
            int maxVal = arr[indices[0]];

            for(int index: indices) {
                if(arr[index] > maxVal) {
                    maxVal = arr[index];
                }
            }
            return maxVal;
        } else {
            int maxVal = arr[1];
            for(int i=2;i<26;i++){
                if(i==4 || i==8 || i==14 || i==20){
                    continue;
                } else{
                    if(arr[i] > maxVal) {
                        maxVal = arr[i];
                    }
                }
            }
            return maxVal;
        }
    }
}