class Solution {
    public boolean isPowerOfTwo(int n) {
        String str = Integer.toBinaryString(n);
        if(n==-2147483648){
            return false;
        }
        return str.indexOf('1')!=-1 && str.indexOf('1') == str.lastIndexOf('1');
    }
}
