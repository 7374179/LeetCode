class Solution {
    public String addStrings(String num1, String num2) {
        int count = 0;
        int sum = 0;
        String str = "";

        int len1 = num1.length()-1;
        int len2 = num2.length()-1;

        int i=0;
        int j=0;

        while(i<=len1 || j<=len2){
            if(i>len1){
                str=(Character.getNumericValue(num2.charAt(len2-j))+count)%10+str;
                if(count+Character.getNumericValue(num2.charAt(len2-j))>=10){
                    count=1;
                }else{
                    count=0;
                }                
                // count=0;
            }else if(j>len2){
                str=(Character.getNumericValue(num1.charAt(len1-i))+count)%10+str;
                if(count+Character.getNumericValue(num1.charAt(len1-i))>=10){
                    count=1;
                }else{
                    count=0;
                }
                // count=0;
            }
            if(i<=len1 && j<=len2){
                sum= (Character.getNumericValue(num1.charAt(len1-i))+Character.getNumericValue(num2.charAt(len2-j))+count)%10;
                if(Character.getNumericValue(num1.charAt(len1-i))+Character.getNumericValue(num2.charAt(len2-i))+count>=10){
                    count=1;
                }else{
                    count=0;
                }
            str=sum+str;
            }
            i++;
            j++;
        }
        if(count==1){
            str="1"+str;
        }
        return str;
    }
}