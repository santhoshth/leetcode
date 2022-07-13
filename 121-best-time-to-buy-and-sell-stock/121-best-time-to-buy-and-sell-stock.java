class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        
        for(int each: prices){
            if(each < min) min = each;
            else if(each - min > max) max = each - min;
        }
        
        return max;
    }
}