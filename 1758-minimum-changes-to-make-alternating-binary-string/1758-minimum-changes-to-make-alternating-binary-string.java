class Solution {
    public int minOperations(String s) {
        int len = s.length();
        String str1="";
        String str2="";
        int count1=0;
        int count2=0;
        for(int i=0;i<s.length();i++){
            if(i%2==0){
                str1=str1+"0";
                str2=str2+"1";
            }else{
                str1=str1+"1";
                str2=str2+"0";
            }
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=str1.charAt(i)){
                count1++;
            }else if(s.charAt(i)!=str2.charAt(i)){
                count2++;
            }
        }
        return Math.min(count1, count2);
    }
}