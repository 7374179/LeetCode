class Solution {
    public String frequencySort(String s) {
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        String str = new String(ch);
        List<String> list = new ArrayList<>();
        int left=0;
        int curr=left+1;
        while(curr<str.length()){
            if(str.charAt(left)!=str.charAt(curr)){
                list.add(str.substring(left, curr));
                left=curr;
                curr=left+1;
                if(curr==str.length()){
                    list.add(""+str.charAt(curr-1));
                }
            }else{
                curr++;
                if(curr==str.length()){
                    list.add(str.substring(left, curr));
                }
            }
        }

        Collections.sort(list, (s1, s2) -> Integer.compare(s2.length(), s1.length()));
        String result = "";
        for(int i=0;i<list.size();i++){
            result=result+list.get(i);
        }
        return result;
    }
}