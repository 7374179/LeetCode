class Solution {
    public int secondsToRemoveOccurrences(String s) {
        int count = 0;
        int left=0;
        int curr=left+1;
        char[] ch = s.toCharArray();
        int sum=0;

        for(int i=0;i<s.length();i++){
            left=0;
            curr=left+1;
            count=0;
            while(left<ch.length-1){
                if(ch[left]=='0' && ch[curr]=='1'){
                    count++;
                    ch[left]='1';
                    ch[curr]='0';
                    left=left+2;
                    curr=left+1;
                }else{
                    left++;
                    curr++;
                }
            }
            if(count==0){
                break;
            }else{
                sum++;
            }
        }
        return sum;
    }
}