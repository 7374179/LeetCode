class Solution {
    public int divisorSubstrings(int num, int k) {
        String str = String.valueOf(num);
        int count=0;
        String tmp="";

        for(int i=0;i<k;i++){
            tmp=tmp+str.charAt(i);
        }

        int sum=Integer.parseInt(tmp);
        if(num%sum==0){
            count++;
        }

        for(int i=k;i<str.length();i++){
            tmp=tmp.substring(1)+""+str.charAt(i);
            sum=Integer.parseInt(tmp);
            if(sum==0){
                continue;
            }
            if(num%sum==0){
                count++;
            }
        }
        return count;
    }
}