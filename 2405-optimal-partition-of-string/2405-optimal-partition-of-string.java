class Solution {
    public int partitionString(String s) {
        List<List<Character>> list = new ArrayList<>();
        list.add(new ArrayList<Character>());

        int tmp=0;

        for(int i=0;i<s.length();i++){
            if(!list.get(tmp).contains(s.charAt(i))){
                list.get(tmp).add(s.charAt(i));
            }else{
                tmp++;
                list.add(new ArrayList<Character>());
                list.get(tmp).add(s.charAt(i));
            }
        }
        return list.size();
    }
}