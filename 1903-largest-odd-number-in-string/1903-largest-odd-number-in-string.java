class Solution {
    public String largestOddNumber(String num) {
        int len=num.length()-1;
        while(len>=0){
            int tmp = num.charAt(len)-'0';
            if(tmp%2==1){
              break;
            }else{
              len--;
            }
        }
        return num.substring(0, len+1);
    }
}