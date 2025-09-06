package dsaMockInterview;

public class minCost {



    public int solve(int[][] A, int B, int C) {




        int rows = A.length;
        int cols = A[0].length;

        int[][] dp = new int[rows][cols];

        dp[0][0] = A[0][0];

        // Initialize first column
        for (int i = 1; i < rows; i++) {
            dp[i][0] = dp[i - 1][0] + A[i][0];


        }

        // Initialize first row

        for (int j = 1; j < cols; j++) {
            dp[0][j] = dp[0][j - 1] + A[0][j];
        }


        // Fill the rest of dp array

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {

                dp[i][j] = A[i][j] + Math.min(
                        dp[i - 1][j],
                        Math.min(dp[i][j - 1], dp[i - 1][j - 1])
                );
            }


        }

        return dp[B][C];
    }


    public static void main(String[] args) {

        minCost m = new minCost();
        int[][] cost = {
                {1, 2, 3},
                {4, 8, 2},
                {1, 5, 3}
        };
        int A = 2, B = 2;

        int res = m.solve(cost, A, B);

        System.out.println(res);

    }

}