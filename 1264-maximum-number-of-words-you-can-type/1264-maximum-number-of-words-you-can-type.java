class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] str = text.split(" ");
        int num = str.length;
        for(int i=0;i<str.length;i++){
            for(int j=0;j<brokenLetters.length();j++){
                char ch = brokenLetters.charAt(j);
                if(str[i].indexOf(ch) != -1) {
                    num--;
                    break;
                }
            }
        }
        return num;
    }
}