class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        
        int r = obstacleGrid.length;
        int c = obstacleGrid[0].length;
        
        // DP array to store values
        int[][] dp = new int[r][c];
        for(int[] row: dp)
            Arrays.fill(row, -1);
        
        return f(r-1, c-1, obstacleGrid, dp);
    }
    
    public int f(int r, int c, int[][] grid, int[][] dp){
        // condition to skip obstacle cell
        if(grid[r][c] == 1) return 0;
        
        // when reached (0,0), a unique path is found so return 1
        if(r == 0 && c == 0) return 1;
    
        // check whether DP array got a result for (r,c)
        // if exist return the result
        if(dp[r][c] != -1) return dp[r][c];
        
        // else calculate and update the result in DP and return
        int ans = 0;
        
        // to move down
        if(r > 0) ans += f(r-1, c, grid, dp);
        
        // to move right
        if(c > 0) ans += f(r, c-1, grid, dp);
        
        return dp[r][c] = ans;
    }
}