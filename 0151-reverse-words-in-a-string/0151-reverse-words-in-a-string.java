class Solution {
    public String reverseWords(String s) {
        String[] str = s.trim().split(" ");
        String tmp = "";
        for(int i=0;i<str.length;i++){
            if(str[i].equals("")){
                continue;
            }else{
                tmp=str[i]+" "+tmp;
            }
        }
        return tmp.substring(0, tmp.length()-1);
    }
}