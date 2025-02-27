class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        int[][] dp = new int[arr.length][arr.length];
        int max = 0;
        for(int curr=2;curr<arr.length;curr++){
            int start = 0;
            int end = curr-1;
            int fibo = arr[curr];
            while(start<end){
                int tmp = arr[start] + arr[end];
                if(fibo>tmp) {
                    start++;
                } else if(fibo<tmp){
                    end--;
                } else{
                    dp[end][curr]  = dp[start][end]+1;
                    max = Math.max(max, dp[end][curr]);
                    start++;
                    end--;
                }
            }
        }
        return max == 0 ? 0 : max+2;
    }
}