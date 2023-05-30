class Solution {
    public int hammingDistance(int x, int y) {
        int count = 0;
        int c = x^y;

        String bi = Integer.toBinaryString(c);

        for(int i=0;i<bi.length();i++){
            if(bi.charAt(i)=='1'){
                count++;
            }
        }

        return count;
    }
}