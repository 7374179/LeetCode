class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Character> que = new LinkedList<>();
        for(int i=0;i<senate.length();i++){
            que.add(senate.charAt(i));
        }
        int D=0;
        int R=0;

        while(que.size()>1 && D<senate.length() && R<senate.length()){
            char ch = que.poll();
            if(ch=='D' && D>0){
                D--;
                continue;
            }
            if(ch=='R' && R>0){
                R--;
                continue;
            }
            if(ch=='D'){
                R++;
            }else{
                D++;
            }
            que.add(ch);
        }
        if(que.peek()=='R'){
            return "Radiant";
        }
        return "Dire";
    }
}