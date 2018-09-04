package DynamicProgramming;

public class ClimbingStairs {

    public int climbStairs(int n) {
        if (n < 1) {
            return 0;
        } else if (n < 4) {
            return n;
        } else {
            int[] dp = new int[n + 1];
            //the number of ways to reach step n could be calculated from n-1 and n-2
            dp[1] = 1;
            dp[2] = 2;
            for (int i = 3; i <= n; i++) {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
            return dp[n];
        }
    }

    public static void main(String[] args) {
        ClimbingStairs climbingStairs = new ClimbingStairs();
        System.out.println(climbingStairs.climbStairs(4));
    }
}
