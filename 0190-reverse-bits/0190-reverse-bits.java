public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        String str = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder(str);
        while(sb.length()!=32){
          if(sb.length()!=32){
              sb.insert(0,"0");
          }

        }
        sb.reverse();
        String strR = sb.toString();

        long tmp = Long.parseLong(strR, 2);
        return (int)tmp;
    }
}