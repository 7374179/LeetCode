class Solution {
    public int getLucky(String s, int k) {
        String sum = "";
        for(int i=0;i<s.length();i++){
            sum = sum + (s.charAt(i)-'0'-48);
        }
        int count = 0;
        int result = 0;
        int  j = 0;
        while(k>0){
            count = count + sum.charAt(j++)-'0';
            if(j==sum.length()){
                j=0;
                k--;
                sum = count+"";
                result = count;
                count = 0;
            }
        }
        return result;
    }
}