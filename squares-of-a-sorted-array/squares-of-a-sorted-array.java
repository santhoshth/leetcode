class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int s = 0;
        int e = nums.length - 1;
        
        int[] res = new int[nums.length];
        int resIndex = res.length - 1;
        
        while(s <= e){
            int startSquare = nums[s] * nums[s];
            int endSquare = nums[e] * nums[e];
            if(startSquare > endSquare){
                res[resIndex--] = startSquare;
                s++;
            } else {
                res[resIndex--] = endSquare;
                e--;
            }
        }
        
        
        return res;
    }
}