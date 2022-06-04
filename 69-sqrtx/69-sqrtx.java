class Solution {
    public int mySqrt(int x) {
        long start = 1;
        long end = x;
        int ans = 0;
        
        while(start <= end){
            long mid = start + (end - start)/2;
            long square = mid * mid;
            if(square == x){
                return (int)mid;
            }
            
            if(square < x){
                ans = (int)mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }            
        }
        
        return ans;
    }
}