class Solution {
    public String clearDigits(String s) {
        Stack<Character> stack = new Stack<>();
        String str = "";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)-'0'>=0 && s.charAt(i)-'0'<=9){
                if(stack.size()>0){
                    stack.pop();
                }
            } else {
                stack.push(s.charAt(i));
            }
        }
        int tmp = stack.size();
        for(int i=0;i<tmp;i++){
            str = stack.pop()+str;
        }
        return str;
    }
}