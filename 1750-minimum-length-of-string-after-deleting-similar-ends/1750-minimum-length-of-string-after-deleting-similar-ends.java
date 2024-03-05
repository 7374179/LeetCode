class Solution {
    public int minimumLength(String s) {
        int count = 0;
        int left = 0;
        int right = s.length()-1;
        while(left<right){
            if(s.charAt(left)==s.charAt(right)){
                for(int i=left;i<right;i++){
                    if(s.charAt(i)==s.charAt(i+1)){
                        left=i+1;
                    }else{
                        break;
                    }
                }
                left++;
                for(int i=right;i>left;i--){
                    if(s.charAt(i)==s.charAt(i-1)){
                        right=i-1;
                    }else{
                        break;
                    }
                }
                right--;
            }else{
                break;
            }
        }
        if(left>right){
            return 0;
        }
        return right-left+1;
    }
}