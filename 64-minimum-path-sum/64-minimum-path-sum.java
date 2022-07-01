class Solution {
    public int minPathSum(int[][] grid) {
         
        int r = grid.length;
        int c = grid[0].length;
        
        // DP array to store values
        int[][] dp = new int[r][c];
        for(int[] row: dp)
            Arrays.fill(row, -1);
        
        return f(r-1, c-1, grid, dp);
    }
    
    public int f(int r, int c, int[][] grid, int[][] dp){        
        // when reached (0,0) a unique path is found so return 1
        if(r == 0 && c == 0) return grid[0][0];
    
        // check whether DP array got a result for (r,c)
        // if exist return the result
        if(dp[r][c] != -1) return dp[r][c];
        
        // else calculate and update the result in DP and return
        int ans = Integer.MAX_VALUE;
        
        // to move down
        if(r > 0) ans = Math.min(ans, f(r-1, c, grid, dp));
        
        // to move right
        if(c > 0) ans = Math.min(ans, f(r, c-1, grid, dp));
        
        return dp[r][c] = ans + grid[r][c];
    }
}