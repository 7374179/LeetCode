class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char[] chS = s.toCharArray();
        char[] chT = t.toCharArray();
        Arrays.sort(chS);
        Arrays.sort(chT);
        for(int i=0;i<chS.length;i++){
            if(chS[i]!=chT[i]){
                return false;
            }
        }
        return true;
    }
}