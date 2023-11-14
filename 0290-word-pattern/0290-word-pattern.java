class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();
        String[] words = s.split(" ");
        if(pattern.length()!=words.length){
            return false;
        }

        for(int i=0;i<pattern.length();i++){
            Character ch = pattern.charAt(i);
            if(map.containsKey(ch)){
                if(!map.get(ch).equals(words[i])){
                    return false;
                }
            }else {
                String str = words[i];
                for(int j=0;j<map.size();j++){
                    if (map.containsValue(str)){
                        return false;
                    }
                }
            }
            map.put(ch, words[i]);
        }
    return true;

    }
}