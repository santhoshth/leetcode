public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int ans = 0;
        
        for(int i = 1; i <= 32; i++){
            if((n & 1) == 1) ans++;
            n = n >> 1;
        }
        
        return ans;
    }
}