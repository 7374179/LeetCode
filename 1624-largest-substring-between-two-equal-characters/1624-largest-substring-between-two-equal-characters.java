class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int max=Integer.MIN_VALUE;
        int left=0;
        int curr=left+1;
        while(curr<s.length()){
            if(s.charAt(left)==s.charAt(curr)){
                if(curr-left>max){
                    max=curr-left;
                }
            }
            curr++;
            if(curr==s.length()){
                left++;
                if(max<0){
                    curr=left+1;
                }else{
                    curr=left+max;
                }
            }
        }
        if(max<0){
            return -1;
        }
        return max-1;
    }
}