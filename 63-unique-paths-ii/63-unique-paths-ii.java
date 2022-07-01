class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        
        int r = obstacleGrid.length;
        int c = obstacleGrid[0].length;
        
        int[][] dp = new int[r][c];
        for(int[] row: dp)
            Arrays.fill(row, -1);
        
        
        return f(r-1, c-1, obstacleGrid, dp);
    }
    
    public int f(int r, int c, int[][] grid, int[][] dp){
        if(grid[r][c] == 1) return 0;
        
        if(r == 0 && c == 0) return 1;
    
        if(dp[r][c] != -1) return dp[r][c];
        
        int ans = 0;
        
        if(r > 0) ans += f(r-1, c, grid, dp);
        
        if(c > 0) ans += f(r, c-1, grid, dp);
        
        return dp[r][c] = ans;
    }
}