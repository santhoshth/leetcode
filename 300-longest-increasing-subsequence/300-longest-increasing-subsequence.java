class Solution {
    public int lengthOfLIS(int[] num) {
        int[] dp = new int[num.length];
        
        int max = 1;

        for (int j = 0; j < num.length; j++) {
            dp[j] = 1;
            for (int k = 0; k < j; k++) {
                if(num[j] > num[k]){
                    dp[j] = Math.max(dp[j], 1+dp[k]);
                }
            }
            
            max = Math.max(max, dp[j]);
        }
        
        return max;
    }
}