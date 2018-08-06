package Queues;

public class PerfectSquares {

    public int numSquares(int n) {
        int[] DP = new int[n + 1];
        for (int i = 1; i <= n; i++)
        {
            int min= Integer.MAX_VALUE;
            for (int j = 1; j * j <= i; j++)
            {
                min= Math.min(min, DP[i - j * j] + 1);
            }
            DP[i] = min;
        }
        return DP[n];
    }

    public static void main(String[] args) {
        PerfectSquares perfectSquares = new PerfectSquares();
        System.out.println(perfectSquares.numSquares(12));
    }
}
