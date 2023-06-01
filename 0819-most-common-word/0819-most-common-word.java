class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        String[] words = paragraph.toLowerCase().split("[ !?',;.]+");
        int ini = 1;
        String str="";

        for(int i=0; i<words.length;i++){
            if(map.containsKey(words[i])){
                map.put(words[i], map.get(words[i])+1);
            }else{
                map.put(words[i], ini);
            }
        }

        if(banned.length>0){
            for(int i=0; i<banned.length;i++){
                if(map.containsKey(banned[i])){
                    map.remove(banned[i]);
                }
            }
        }

        int max=0;

        for(int i=0;i<words.length;i++){
            if(map.containsKey(words[i])){
                if(map.get(words[i])>max){
                    max=map.get(words[i]);
                    str=words[i];
                }
            }
        }

        return str;
    }
}