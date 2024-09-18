class Solution {
    public int numberOfSpecialChars(String word) {
        int count = 0;
        boolean[] small = new boolean[26];
        boolean[] big = new boolean[26];
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            if('a' <= ch && ch <= 'z'){
                small[ch-'a'] = true;
            }else{
                big[ch-'A'] = true;
            }
        }
        for(int i=0;i<small.length;i++){
            if(small[i] == true && big[i] == true){
                count++;
            }
        }
        return count;
    }
}