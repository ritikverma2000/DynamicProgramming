public class Fibonacci {

    // Time Complexity O(n)
    // Space Complexity O(n) for stack space + O(n) for array
    // Top Down Approach
    public static void main(String[] args) {
        int n = 6;
        // Taking dp array of size n+1
        int[] dp = new int[n + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = -1;
        }

        int ans = fibo(n, dp);
        System.out.println(ans);
    }

    public static int fibo(int n, int[] dp) {

        if (n < 2) {
            return n;
        }

        if (dp[n] != -1) {
            return dp[n];
        }

        return dp[n] = fibo(n - 1, dp) + fibo(n - 2, dp);

    }

}
