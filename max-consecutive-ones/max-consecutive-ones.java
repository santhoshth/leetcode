class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxi = Integer.MIN_VALUE;
        
        int count = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                maxi = Math.max(maxi, count);
                count = 0;
            } else {
                count++;
            }
        }
        
        return Math.max(maxi, count);
    }
}