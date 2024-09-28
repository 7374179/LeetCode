class Solution {
    public String getEncryptedString(String s, int k) {
        String str = "";
        for(int i=0;i<s.length();i++){
            str = str + s.charAt((i+k)%s.length());
        }
        return str;
    }
}