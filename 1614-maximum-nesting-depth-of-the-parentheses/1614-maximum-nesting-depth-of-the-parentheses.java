class Solution {
    public int maxDepth(String s) {
        int count=0;
        int max=0;
        Stack tmp = new Stack();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                tmp.push('(');
                count++;
            }else if(s.charAt(i)==')'){
                tmp.pop();
                if(count>max){
                    max=count;
                }
                count--;
            }
        }
        return max;       
    }
}