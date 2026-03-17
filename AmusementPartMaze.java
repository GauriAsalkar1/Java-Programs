public class AmusementPartMaze {
   
    public static void main(String[] args) {

        int[][] grid = {
            {1, 8, 21, 7},
            {19, 17, 10, 20},
            {2, 18, 23, 22},
            {14, 25, 4, 13}
        };

        int n = grid.length;
        int m = grid[0].length;

        int[][] dp = new int[n][m];

        // Start point
        dp[0][0] = Math.max(1, grid[0][0]);

        // First row
        for (int j = 1; j < m; j++) {
            dp[0][j] = Math.max(dp[0][j-1], grid[0][j]);
        }

        // First column
        for (int i = 1; i < n; i++) {
            dp[i][0] = Math.max(dp[i-1][0], grid[i][0]);
        }

        // Fill rest
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {

                int fromTop = dp[i-1][j];
                int fromLeft = dp[i][j-1];

                int bestPrev = Math.min(fromTop, fromLeft);

                dp[i][j] = Math.max(bestPrev, grid[i][j]);
            }
        }

        System.out.println(dp[n-1][m-1]);
    }
}

