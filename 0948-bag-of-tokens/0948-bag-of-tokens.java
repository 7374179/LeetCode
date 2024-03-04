class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int score = 0;
        Arrays.sort(tokens);
        int left = 0;
        int right = tokens.length-1;
        int max = 0;
        while(left<=right){
            if(tokens[left]<=power){
                score++;
                power=power-tokens[left];
                left++;
                if(max<score){
                    max=score;
                }
            }else if(tokens[right]>power && score>0){
                score--;
                power=power+tokens[right];
                right--;
            }else{
                break;
            }
        }
        return max;
    }
}