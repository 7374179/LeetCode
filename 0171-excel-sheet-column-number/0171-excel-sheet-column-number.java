class Solution {
    public int titleToNumber(String columnTitle) {
        int sum = 0;
        int len = columnTitle.length();

        for(int i=0;i<len;i++){
            sum+=Math.pow(26,i)*(Integer.valueOf(columnTitle.charAt(len-1-i))-64);
        }

        return sum;
    }
}