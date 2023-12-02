class Solution {
    public int countCharacters(String[] words, String chars) {
        int sum=0;
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for(int i=0;i<chars.length();i++){
            map1.put(chars.charAt(i), map1.getOrDefault(chars.charAt(i), 0)+1);
        }
        map2.putAll(map1);
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words[i].length();j++){
                char ch = words[i].charAt(j);
                if(map1.containsKey(ch) && map1.get(ch)>0){
                    map1.put(ch, map1.getOrDefault(ch, 0)-1);
                }else{                    
                    break;
                }
                if(j==words[i].length()-1){
                    sum=sum+words[i].length();
                }
                
            }
            map1.putAll(map2);
        }
        return sum;
    }
}