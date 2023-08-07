class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='*'){
                stack.pop();
            }else{
                stack.add(ch);
            }
        }
        String str = "";
        while(!stack.isEmpty()){
            str=stack.pop()+str;
        }
        return str;
    }
}