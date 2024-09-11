class Solution {
    public int minBitFlips(int start, int goal) {
        int count = 0;

        while(start!=0 || goal!=0){
            int lastBit1 = start&1;
            int lastBit2 = goal&1;
            if(lastBit1 != lastBit2){
                count++;
            }
            start = start>>1;
            goal = goal>>1;
        }
        return count;
    }
}