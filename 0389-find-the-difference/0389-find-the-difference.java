class Solution {
    public char findTheDifference(String s, String t) {
        int[] arr = new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            arr[t.charAt(i)-'a']--;
        }
        char ch=' ';
        for(int i=0;i<arr.length;i++){
            if(arr[i]==-1){
                ch=(char)(i+97);
            }
        }
        return ch;
    }
}