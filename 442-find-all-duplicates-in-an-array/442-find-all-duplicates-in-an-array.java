class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        List<Integer> res = new ArrayList<>();
        
        int i = 0;
        while(i < nums.length){            
            if(nums[i] != i+1 && nums[i] != nums[nums[i]-1]){
                swap(nums, i , nums[i]-1);
            }else {
               i++; 
            }
        }
        // System.out.println(Arrays.toString(nums));
        
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != j+1){
                res.add(nums[j]);
            }
        }
        
        return res;
    }
    
    public void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}