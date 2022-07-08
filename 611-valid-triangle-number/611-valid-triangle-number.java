class Solution {
    public int triangleNumber(int[] nums) {
        
        Arrays.sort(nums);
        
        int count = 0;
        int n = nums.length;
        
        for(int i = n-1; i > 0; i--){
            int left = 0;
            int right = i-1;
            
            while(left < right){
                if(nums[left] + nums[right] > nums[i]){
                    count+= right-left;
                    right--;
                } else
                    left++;
                
            }
        }
        
        return count;
    }
    
    
}