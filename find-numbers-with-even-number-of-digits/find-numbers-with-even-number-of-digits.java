class Solution {
    public int findNumbers(int[] nums) {
        
        int count = 0;
        
        for(int each: nums){
            int digits = (int)(Math.log10(each) + 1);
            if(digits % 2 == 0) count++;
        }
        
        return count;
        
    }
}