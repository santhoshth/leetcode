class Solution {
    public int firstMissingPositive(int[] nums) {
        int i = 0;
        while(i < nums.length){            
            if(nums[i] <= 0 || nums[i] > nums.length || nums[i] == i+1 || nums[i] == nums[nums[i]-1]){               
                 i++;
            }else{
                swap(nums, i, nums[i]-1);
            }          
        }     
        
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != j+1){
                return j+1;
            }
            
            if(j == nums.length-1 && nums[j] == j+1){
                return nums.length+1;
            }
        }
        
        System.out.println(Arrays.toString(nums));
        return 1;
    }
    
    public void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}