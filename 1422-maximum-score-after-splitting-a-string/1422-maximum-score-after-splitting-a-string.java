class Solution {
    public int maxScore(String s) {
        int right=0;
        int sum=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                right++;
            }
        }
        int left=0;
        int max=0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='0'){
                left++;
                sum=right+left;
                max=Math.max(max, sum);
            }else{
                right--;
                max=Math.max(max, right);
            }
        }
        return max;
    }
}