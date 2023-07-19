class Solution {
    public boolean makePalindrome(String s) {
        int left=0;
        int right=s.length()-1;
        int count=2;

        while(left<=right){
            if(s.charAt(left)!=s.charAt(right)){
                count--;
                if(count<0){
                    return false;
                }
            }
            left++;
            right--;
        }
        return true;
    }
}