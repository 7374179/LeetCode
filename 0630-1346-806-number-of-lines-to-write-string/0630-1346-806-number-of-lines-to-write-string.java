class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int[] arr = new int[2];
        int count = 1;
        int sum = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(sum+widths[ch-'a']<=100){
                sum = sum + widths[ch-'a'];
            }else {
                count++;
                sum = widths[ch-'a'];
            }
        }
        arr[0] = count;
        arr[1] = sum;
        return arr;
    }
}