class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        int[] arr = new int[26];
        for(int i=0;i<allowed.length();i++){
            char ch = allowed.charAt(i);
            arr[ch-'a']++;
        }

        for(int i=0;i<words.length;i++){
            for(int j=0;j<words[i].length();j++){
                char ch = words[i].charAt(j);
                if(arr[ch-'a']==0){
                    break;
                }
                if(j==words[i].length()-1){
                    count++;
                }
            }
        }
        return count;
    }
}