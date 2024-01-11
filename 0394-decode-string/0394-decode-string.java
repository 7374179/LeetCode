class Solution {
    public String decodeString(String s) {
        String sb = "";
        Stack<Character> stack = new Stack<>();
        for(int i=s.length()-1;i>=0;i--){
            sb="";
            stack.push(s.charAt(i));
            char ch = s.charAt(i);
            int num=0;
            if(ch>='0' && ch<='9'){
                stack.pop();
                String tmp="";
                for(int j=i;j>=0;j--){
                    char ch1 = s.charAt(j);
                    if(ch1>='0' && ch1<='9'){
                        tmp=ch1+tmp;
                    }else{
                        break;
                    }
                    i=j;
                }
                if(tmp.equals("")){
                    num=ch-'0';
                }else{
                    num=Integer.parseInt(tmp);
                }
                String str = "";
                while(stack.peek()!=']'){
                    if(stack.peek()=='['){
                        stack.pop();
                    }
                    str=str+stack.pop();
                }
                if(stack.peek()==']'){
                    stack.pop();
                }
                for(int k=0;k<num;k++){
                    sb=sb+str;
                }
            }
            for(int l=sb.length()-1;l>=0;l--){
                stack.push(sb.charAt(l));
            }
        }
        String com = "";
        int len = stack.size();
        for(int i=0;i<len;i++){
            com=com+stack.pop();
        }
        return com;
    }
}