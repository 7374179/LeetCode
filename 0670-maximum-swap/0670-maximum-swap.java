class Solution {
    public int maximumSwap(int num) {
        char[] numStr = Integer.toString(num).toCharArray();
        int n = numStr.length;
        int maxDigitIndex = -1, swapIdx1 = -1, swapIdx2 = -1;

        for(int i=n-1;i>=0;i--){
            if(maxDigitIndex == -1 || numStr[i] > numStr[maxDigitIndex]){
                maxDigitIndex = i;
            }else if(numStr[i] < numStr[maxDigitIndex]){
                swapIdx1 = i;
                swapIdx2 = maxDigitIndex;
            }
        }

        if(swapIdx1 != -1 && swapIdx2 != -1){
            char temp = numStr[swapIdx1];
            numStr[swapIdx1] = numStr[swapIdx2];
            numStr[swapIdx2] = temp;
        }

        return Integer.parseInt(new String(numStr));
    }
}