class Solution {
    public String largestGoodInteger(String num) {
        char ch = ' ';
        for(int i=0;i<num.length()-2;i++){
            if(num.charAt(i) == num.charAt(i+1) && num.charAt(i) == num.charAt(i+2)){
                if(num.charAt(i)>ch){
                    ch=num.charAt(i);
                }
            }
        }
        if(ch==' '){
            return "";
        }else{
            return ""+ch+ch+ch;
        }
    }
}