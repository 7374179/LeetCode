class Solution {
    public String maximumOddBinaryNumber(String s) {
        int len = s.length();
        int count=0;
        String str = "";
        for(int i=0;i<len;i++){
            if(s.charAt(i)=='1'){
                count++;
            }
        }
        for(int i=0;i<len-1;i++){
            if(count-1>0){
                str=str+"1";
                count--;
            }else{
                str=str+"0";
            }
        }
        str=str+"1";
        return str;
    }
}