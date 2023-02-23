public class ClimbingStairs {

    public static void main(String[] args) {

        int n = 5;

        int[] dp = new int[n + 1];

        // dp[5] how many ways can we get to 5 that's 1
        dp[n] = 1;
        dp[n - 1] = 1;
        int cur = dp[n - 1];
        int prev = dp[n];

        for (int i = n - 2; i >= 0; i--) {

            dp[i] = cur + prev;
            prev = cur;
            cur = dp[i];
        }

        for (int i = 0; i < dp.length; i++) {
            System.out.println(dp[i]);
        }

        // we also optimize further for space

        // intilaize two variables one and two with values 1,1

        int one = 1, two = 1;
        // iterating over the loop for n -1 times
        for (int i = 0; i < n - 1; i++) {

            int temp = one + two;
            two = one;
            one = temp;
        }
        System.out.println(one);

    }

}
