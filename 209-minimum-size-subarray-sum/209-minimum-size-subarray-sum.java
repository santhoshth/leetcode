class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        if(nums.length == 1){
            return target == nums[0] ? 1 : 0;
        }
        
       int min = Integer.MAX_VALUE;
        
        int i = 0;
        int j = 1;
        
        int sum = nums[i];
        
        while(i <= j && j <= nums.length){
            if(sum < target){                
                if(j < nums.length) sum += nums[j];
                j++;
            } else {
                min = Math.min(min, j-i);
                sum -= nums[i++];
            }
        }
        
        return min == Integer.MAX_VALUE ? 0 : min;
    }
    
}