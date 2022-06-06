class Solution {
    public int findDuplicate(int[] nums) {
        
        int i = 0;
        while(i < nums.length){            
            if(nums[i] == i+1 || nums[i] == nums[nums[i]-1]){
                i++;
            }else{
                swap(nums, i, nums[i]-1);
            }          
        }     
        
        for(int j = 0; j < nums.length; j++){
            if(j+1 != nums[j]){
                return nums[j];
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