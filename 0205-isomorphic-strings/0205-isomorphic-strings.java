class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char chS = s.charAt(i);
            char chT = t.charAt(i);
            if(map.containsKey(chS)){
                if(map.get(chS)==chT){
                    continue;
                }else{
                    return false;
                }
            }else{
                if(map.containsValue(chT)){
                    return false;
                }
                map.put(chS, chT);
            }
        }
        return true;
    }
}