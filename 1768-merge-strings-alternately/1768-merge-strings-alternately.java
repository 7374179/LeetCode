class Solution {
    public String mergeAlternately(String word1, String word2) {
        String tmp="";
        int i=0;
        while(i<word1.length() && i<word2.length()){
            tmp=tmp+word1.charAt(i)+word2.charAt(i);
            i++;
        }
        if(i<word1.length()){
            while(i<word1.length()){
                tmp=tmp+word1.charAt(i);
                i++;
            }
        }else{
            while(i<word2.length()){
                tmp=tmp+word2.charAt(i);
                i++;
            }
        }
        return tmp;
    }
}