class Solution {
    public int[] diStringMatch(String s) {
        int[] arr = new int[s.length()+1];
        int lo =0;
        int hi = s.length();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='I') {
                arr[i] = lo++;
            } else {
                arr[i] = hi--;
            }
        }
        arr[s.length()] = lo;
        return arr;
    }
}