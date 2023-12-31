class Solution {
    public boolean makeEqual(String[] words) {
        int[] arr = new int[26];
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words[i].length();j++){
                arr[words[i].charAt(j)-'0'-49]++;
            }
        }
        
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                if(arr[i]%words.length!=0){
                    return false;
                }
            }
        }
        return true;
    }
}