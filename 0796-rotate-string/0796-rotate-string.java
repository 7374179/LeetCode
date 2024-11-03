class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.equals(goal)){
            return true;
        }
        String str = s;
        for(int i=0;i<s.length()-1;i++){
            str = str.substring(1, s.length()) + str.substring(0,1);
            if(str.equals(goal)){
                return true;
            }
        }
        return false;
    }
}