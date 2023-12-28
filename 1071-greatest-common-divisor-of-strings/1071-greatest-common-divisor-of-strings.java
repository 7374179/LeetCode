class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(str1.length()<str2.length()){
            String tmp ="";
            tmp = str1;
            str1=str2;
            str2=tmp;
        }
        for(int i=0;i<Math.max(str1.length(), str2.length());i++){
            if(str1.charAt(i)!=str2.charAt(i%(str2.length()))){
                return "";
            }
        }
        int len1 = str1.length();
        int len2 = str2.length();

        int gcd = 0;
        while(len1%len2!=0){
            gcd=len1%len2;
            len1=len2;
            len2=gcd;
        }
        
        if(gcd==0){
            return str2;
        }else{
            for(int i=0;i<str1.length();i++){
                if(str1.charAt(i)!=str2.charAt(i%gcd)){
                    return "";
                }
            }
        }
        return str1.substring(0,gcd);
    }
}