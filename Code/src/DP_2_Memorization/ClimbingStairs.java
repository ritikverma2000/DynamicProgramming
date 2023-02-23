import java.util.Arrays;
import java.util.Collections;

public class ClimbingStairs {

    // Count number of ways in which you can reach nth step, you can
    // climb either 1 or 2 steps at a time.
    public static void main(String[] args) {
        int n = 50;

        int[] dp = new int[n + 1];

        // To set all index to a value of -1 intially
        Arrays.fill(dp, -1);

        int ans = distinctways(0, n);
        int ans2 = distinctwaysmemo(0, n, dp);
        System.out.println(ans);

    }

    // recursive solution
    public static int distinctways(int k, int n) {

        if (k == n) {
            return 1;
        }
        if (k > n) {
            return 0;
        }

        int left = distinctways(k + 1, n);
        int right = distinctways(k + 2, n);

        return left + right;

    }

    // memorization solution
    public static int distinctwaysmemo(int k, int n, int[] dp) {

        if (k == n) {
            return 1;
        }
        if (k > n) {
            return 0;
        }

        if (dp[k] != -1) {
            return dp[k];
        }
        int left = distinctwaysmemo(k + 1, n, dp);
        int right = distinctwaysmemo(k + 2, n, dp);

        return dp[k] = left + right;

    }
}