class Solution {
    public String reverseVowels(String s) {
        String tmp ="";
        String ss="";
        int num = s.length();
        for(int i=0;i<num;i++){
            if(s.charAt(i)=='a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'||s.charAt(i)=='A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U'){
                tmp=tmp+s.charAt(i);
            }
        }

        int num2 = tmp.length();

        for(int i=0;i<num;i++){
            if(s.charAt(i)=='a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'||s.charAt(i)=='A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U'){
                ss=ss+tmp.charAt(num2-1);
                num2--;
            }else{
                ss=ss+s.charAt(i);
            }            
        }
        return ss;
    }
}