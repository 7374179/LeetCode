class Solution {
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(!stack.isEmpty() && Math.abs(s.charAt(i)-stack.peek())==32){
                stack.pop();
            }else{
                stack.push(s.charAt(i));
            }
        }
        String str="";
        int len = stack.size();
        for(int i=0;i<len;i++){
            str=stack.pop()+str;
        }
        return str;
    }
}