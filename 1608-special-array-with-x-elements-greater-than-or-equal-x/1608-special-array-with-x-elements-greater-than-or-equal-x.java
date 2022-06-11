class Solution {
    public int specialArray(int[] nums) {
        
        int i = 0;
        int count = greaterNumbers(nums, i);
        while(count > 0){
            if(i == count){
                return count;
            }
            
            i += 1;
            count = greaterNumbers(nums, i);
        }
        
        return -1;
    }
    
    public int greaterNumbers(int[] nums, int target){
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= target){
                count++;
            }
        }
        
        return count;
    }
}