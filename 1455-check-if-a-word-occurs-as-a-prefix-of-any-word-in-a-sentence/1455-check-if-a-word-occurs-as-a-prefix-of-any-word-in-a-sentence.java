class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        int count = -1;
        String[] str = sentence.split(" ");

        for(int i=0;i<str.length;i++){
            int tmp = 0;
            tmp = str[i].indexOf(searchWord);
            if(tmp == 0){
                count = i+1;
                break;
            }
        }

        return count;
    }
}