class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int count = -1;
        for(int i=0;i<word.length();i++){
            if(ch!=word.charAt(i)){
                stack.push(word.charAt(i));
            }else{
                stack.push(word.charAt(i));
                count=i;
                while(!stack.isEmpty()){
                    sb.append(stack.pop());
                }
                break;
            }
        }
        if(count==-1){
            return word;
        }
        else{
            for(int i=count+1;i<word.length();i++){
                sb.append(word.charAt(i));
            }
        }
        return sb.toString();
        // int count=-1;
        // String reverse="";
        // for(int i=0;i<word.length();i++){
        //     if(ch==word.charAt(i)){
        //         count=i;
        //         break;
        //     }
        // }

        // if(count==-1){
        //     return word;
        // }else{
        //     for(int i=0;i<=count;i++){
        //         reverse=reverse+word.charAt(count-i);
        //     }
        // }
        // for(int i=count+1;i<word.length();i++){
        //     reverse=reverse+word.charAt(i);
        // }
        // return reverse;
    }
}