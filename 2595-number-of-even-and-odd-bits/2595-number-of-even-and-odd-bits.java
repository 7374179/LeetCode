class Solution {
    public int[] evenOddBit(int n) {
        int tmp=n;
        String str ="";
        int[] array= new int[2];
        int even=0;
        int odd=0;
        while(tmp>0){
            str=str+tmp%2;
            tmp=tmp/2;
        }

        for(int i=str.length();i>0;i--){
            if(str.length()%2==0){
                if(i%2==0){
                    if(str.charAt(str.length()-i)=='1'){
                        even++;
                    }
                }else{
                    if(str.charAt(str.length()-i)=='1'){
                        odd++;
                    }
                }
            } else{
                if(i%2==1){
                    if(str.charAt(str.length()-i)=='1'){
                        even++;
                    }
                }else{
                    if(str.charAt(str.length()-i)=='1'){
                        odd++;
                    }
                }               
            }            
        }
        array[0]=even;
        array[1]=odd;
        return array;
    }
}