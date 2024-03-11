class Solution {
    public String customSortString(String order, String s) {
        Queue<Character> que1 = new LinkedList<>();
        Queue<Character> que2 = new LinkedList<>();
        for(int i=0;i<s.length();i++){
            if(order.contains(String.valueOf(s.charAt(i)))){
                que1.add(s.charAt(i));
            }else{
                que2.add(s.charAt(i));
            }
        }
        String str ="";
        int j=0;
        int count=0;
        while(!que1.isEmpty()){
            char ch=que1.poll();
            if(order.charAt(j)==ch){
                str=str+ch;
            }else{
                que1.add(ch);
            }
            count++;
            if(count==s.length()){
                j++;
                count=0;
            }
        }
        int len = que2.size();
        for(int i=0;i<len;i++){
            str=str+que2.poll();
        }
        return str;
    }
}