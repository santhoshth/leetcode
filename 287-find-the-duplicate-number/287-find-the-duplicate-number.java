class Solution {
    public int findDuplicate(int[] nums) {
        
        int i = 0;
        while(i < nums.length){            
            if(nums[i] != i+1){
                if(nums[i] == nums[nums[i]-1]){  
                    return nums[i];                
                } 
                 swap(nums, i, nums[i]-1);
            }else{
                i++;
            }          
        }     
        
        return -1;
    }
    
    public void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}