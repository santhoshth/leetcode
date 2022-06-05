class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        sort(nums);

        List<Integer> res = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++) {
            if(i+1 != nums[i]){
                res.add(i+1);
            }
        }
        
        return res;
    }
    
    public void sort(int[] nums) {
        int i = 0;
        while(i < nums.length){
            if(nums[i] == i + 1 || nums[i] == nums.length + 1){
                i++;
            }else{
                if(nums[i] == nums[nums[i]-1]){
                    i++;
                }else {
                swap(nums, i, nums[i]-1);
                }
            }
        }
    }

    public void swap(int[] nums, int f, int s){
        int temp = nums[f];
        nums[f] = nums[s];
        nums[s] = temp;
    }
}