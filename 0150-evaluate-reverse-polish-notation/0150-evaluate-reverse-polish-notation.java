class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        stack.add(Integer.parseInt(tokens[0]));
        int i=1;
        while(i<tokens.length){
            if(tokens[i].equals("+")){
                int tmp=stack.pop()+stack.pop();
                stack.add(tmp);
            } else if (tokens[i].equals("-") ){
                int tmp1=stack.pop();
                int tmp2=stack.pop();
                int tmp3=tmp2-tmp1;      
                stack.add(tmp3);
            } else if(tokens[i].equals("*")){
                int tmp=stack.pop()*stack.pop();
                stack.add(tmp);
            }else if(tokens[i].equals("/")){
                int tmp1=stack.pop();
                int tmp2=stack.pop();
                int tmp3=tmp2/tmp1;      
                stack.add(tmp3);          
            } else{
                stack.add(Integer.parseInt(tokens[i]));
            }
            i++;
        }
        return stack.pop();
    }
}