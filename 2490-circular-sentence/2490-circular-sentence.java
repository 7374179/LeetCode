class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] str = sentence.split(" ");
        if(str.length == 1){
            if(sentence.charAt(sentence.length()-1)!=sentence.charAt(0)){
                return false;
            }
        }
        for(int i=0;i<str.length-1;i++){
            String str1 = str[i];
            String str2 = str[i+1];
            if(str1.charAt(str1.length()-1)!=str2.charAt(0)){
                return false;
            }
        }
        String str1 = str[0];
        String str2 = str[str.length-1];
        if(str1.charAt(0)!=str2.charAt(str2.length()-1)){
            return false;
        }
        return true;
    }
}