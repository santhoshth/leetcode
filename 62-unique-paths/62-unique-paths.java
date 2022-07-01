class Solution {
    public int uniquePaths(int m, int n) {
        
        int[][] dp = new int[m][n];
        for(int[] row: dp)
            Arrays.fill(row, -1);
        
        dp[0][0] = 1;
        
        for(int r = 0; r < m; r++){
            for(int c = 0; c < n; c++){
                if(r == 0 && c == 0) dp[r][c] = 1;
                else{
                    int ans = 0;
                    if(r > 0) ans += dp[r-1][c];
                    if(c > 0) ans += dp[r][c-1];
                    dp[r][c] = ans;
                }
            }
        }
        
        return dp[m-1][n-1];
        // return f(m-1, n-1, dp);
    }
    
    public int f(int m, int n, int[][] dp){
        if(m == 0 && n== 0) return 1;
        
        if(dp[m][n] != -1) return dp[m][n];
        
        int ans = 0;
        
        if(m > 0) ans += f(m-1, n, dp);
        if(n > 0) ans += f(m, n-1, dp);
        
        return dp[m][n] = ans;
    }
}