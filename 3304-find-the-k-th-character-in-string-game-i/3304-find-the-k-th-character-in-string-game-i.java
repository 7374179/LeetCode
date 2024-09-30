class Solution {
    public char kthCharacter(int k) {
        String str = "a";
        String start = "a";
        while(str.length()<k){
            for(int i=0;i<start.length();i++){
                str = str + String.valueOf((char)(start.charAt(i)+1));
            }
            start = str;
        }
        return str.charAt(k-1);
    }
}