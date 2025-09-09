class Solution {
    public int peopleAwareOfSecret(int n, int delay, int forget) {
        long MOD = 1_000_000_007L;

        long[] dp = new long[n + 1];

        dp[1] = 1;

        long sharing = 0;

        for (int i = 2; i <= n; i++) {
            if (i - delay >= 1) {
                sharing = (sharing + dp[i - delay]) % MOD;
            }

            if (i - forget >= 1) {
                sharing = (sharing - dp[i - forget] + MOD) % MOD;
            }

            dp[i] = sharing;
        }

        long totalKnown = 0;
        for (int i = n - forget + 1; i <= n; i++) {
            totalKnown = (totalKnown + dp[i]) % MOD;
        }

        return (int) totalKnown;    
    }
}