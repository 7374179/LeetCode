class Solution {
    public int minimumRecolors(String blocks, int k) {
        int left=0;
        int curr=left;
        int numB=0;
        int max=0;
        while(curr<blocks.length()){
            if(curr-left<k){
                if(blocks.charAt(curr)=='B'){
                    numB++;
                }
                curr++;
                max=Math.max(numB, max);
            }else{
                if(blocks.charAt(left)=='B'){
                    numB--;
                }
                left++;
                max=Math.max(numB, max);
            }
        }
        if(max>k){
            return 0;
        }
        return k-max;
    }
}