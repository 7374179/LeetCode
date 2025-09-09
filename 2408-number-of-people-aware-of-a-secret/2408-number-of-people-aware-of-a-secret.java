class Solution {
    public int peopleAwareOfSecret(int n, int delay, int forget) {
        long MOD = 1_000_000_007L;

        // dp[i] : i번째 날에 '새로' 비밀을 알게 된 사람의 수
        // 중간 계산에서 오버플로우를 방지하기 위해 long 타입을 사용합니다.
        long[] dp = new long[n + 1];

        // 기본값: 첫째 날, 한 명이 비밀을 알게 됩니다.
        dp[1] = 1;

        // 'sharing' : 현재 비밀을 공유할 수 있는 사람의 총 수
        long sharing = 0;

        // 2일차부터 n일차까지 dp 배열을 채웁니다.
        for (int i = 2; i <= n; i++) {
            // 오늘부터 공유를 '시작'하는 사람들을 더합니다.
            // (i - delay)일에 비밀을 알게 된 사람들은 오늘부터 공유할 수 있습니다.
            if (i - delay >= 1) {
                sharing = (sharing + dp[i - delay]) % MOD;
            }

            // 오늘 비밀을 '잊어버리는' 사람들을 뺍니다.
            // (i - forget)일에 비밀을 알게 된 사람들은 오늘 비밀을 잊으므로 더 이상 공유할 수 없습니다.
            if (i - forget >= 1) {
                // 음수가 되는 것을 방지하기 위해 MOD를 더한 후 모듈러 연산을 합니다.
                sharing = (sharing - dp[i - forget] + MOD) % MOD;
            }

            // 오늘 새로 비밀을 알게 된 사람의 수는 현재 공유 중인 사람의 수와 같습니다.
            dp[i] = sharing;
        }

        // 최종 결과: n번째 날에 비밀을 알고 있는 모든 사람의 수
        // 이들은 (n - forget + 1)일차부터 n일차 사이에 비밀을 알게 된 사람들입니다.
        long totalKnown = 0;
        for (int i = n - forget + 1; i <= n; i++) {
            totalKnown = (totalKnown + dp[i]) % MOD;
        }

        return (int) totalKnown;    }
}