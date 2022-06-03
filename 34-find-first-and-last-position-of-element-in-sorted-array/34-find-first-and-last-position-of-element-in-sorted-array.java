class Solution {
public int[] searchRange(int[] nums, int target) {
        
        int index = search(nums, target);
        if(index == -1){
            return new int[]{-1,-1};
        }
        
        int start = index;
        int end = index;
                
        while(start > 0 && nums[start - 1] == target){
            start = start - 1;
        }
        
        while(end < nums.length - 1 && nums[end + 1] == target){
            end = end + 1;
        }
        
        return new int[]{start, end};
        
    }
    
    public int search(int[] nums, int target){
        int length = nums.length;
        int start = 0;
        int end = length - 1;
        
        while(start <= end){
            
            int mid = start + (end - start) / 2;
            
            if(nums[mid] == target){
                return mid;
            }
            
            if(nums[mid] > target){
                end = mid - 1;
            } else {
                start = mid + 1;
            }            
        }
        
          return -1;
    }
}