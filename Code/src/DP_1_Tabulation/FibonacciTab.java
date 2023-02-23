public class FibonacciTab {
    public static void main(String[] args) {

        // TC is O(n) where as SC is O(n) not extra stack space
        int n = 6;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i < dp.length; i++) {
            // 1 dp[2]=dp[1]+dp[0]
            // 2 dp[3]= dp[2]+dp[1]
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        System.out.println(dp[n]);

    }
}
