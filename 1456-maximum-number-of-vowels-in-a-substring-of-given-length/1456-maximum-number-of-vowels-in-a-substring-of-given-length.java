class Solution {
    public int maxVowels(String s, int k) {
        if(s.length()==0){
            return 0;
        }
        int max=0;
        int count=0;
        StringBuilder str = new StringBuilder();
        for(int i=0;i<k;i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                count++;
            }
            str.append(s.charAt(i));
        }
        max=count;
        for(int i=0;i<s.length()-k;i++){
            if(str.charAt(0)=='a'||str.charAt(0)=='e'||str.charAt(0)=='i'||str.charAt(0)=='o'||str.charAt(0)=='u'){
                count--;
            }
            str.deleteCharAt(0);

            if(s.charAt(i+k)=='a'||s.charAt(i+k)=='e'||s.charAt(i+k)=='i'||s.charAt(i+k)=='o'||s.charAt(i+k)=='u'){
                count++;
                if(max<count){
                    max=count;
                }
            }         
            str.append(s.charAt(i+k));
        }
        return max;
    }
}