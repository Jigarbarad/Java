public class knapsack_dynamic {

    public static void main(String[] args) 
    {
        int[] val = {15, 20, 25, 30};
        int[] wt = {2, 1, 2, 3};
        int W = 5;

        int maxValue = knapsackDP(val, wt, W);
        System.out.println("Maximum value that can be obtained: " + maxValue);
    }

    public static int knapsackDP(int[] val, int[] wt, int W) {
        int n = val.length;
        int[][] dp = new int[n + 1][W + 1];

        for (int i = 0; i <= n; i++) {
            for (int w = 0; w <= W; w++)
             {
                if (i == 0 || w == 0) 
                {
                    dp[i][w] = 0;
                } 
                else if (wt[i - 1] <= w)
                {
                    dp[i][w] = Math.max(val[i - 1] + dp[i - 1][w - wt[i - 1]], dp[i - 1][w]);
                } 
                else 
                {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }

        return dp[n][W];
    }
}
