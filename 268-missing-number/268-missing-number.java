class Solution {
    public int missingNumber(int[] nums) {
        sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if(i != nums[i]){
                return i;
            }
        }
        
        return nums.length;
    }
    
    public void sort(int[] nums) {
        int i = 0;
        while(i < nums.length){
            if(nums[i] == i || nums[i] == nums.length){
                i++;
            }else{
                swap(nums, i, nums[i]);
            }
        }
    }

    public void swap(int[] nums, int f, int s){
        int temp = nums[f];
        nums[f] = nums[s];
        nums[s] = temp;
    }
}