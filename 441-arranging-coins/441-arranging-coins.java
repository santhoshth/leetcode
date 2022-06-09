class Solution {
    public int arrangeCoins(int n) {
        
        double ans = Math.sqrt(2*(long)n + 0.4);
        int res = (int)(ans - 0.5);
        
        return res;
//         if(n==0) return 0;
//         int i = 0;
//         while(n > 0){
//             n = n - i;
//             i++;
//         }

//         if (n==0) return i-1;
//         else return i-2;
    }
}