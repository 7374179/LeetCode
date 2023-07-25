class Solution {
    public int appendCharacters(String s, String t) {
        int left=0;
        int curr=0;
        // int count=0;

        while(left<s.length() && curr<t.length()){
            if(s.charAt(left)==t.charAt(curr)){
                left++;
                curr++;
            }else{
                left++;
            }
        }
        return t.length()-curr;
    }
}