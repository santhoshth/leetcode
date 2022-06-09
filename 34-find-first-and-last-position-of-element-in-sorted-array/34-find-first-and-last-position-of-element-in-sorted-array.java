class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = -1;
        int end = -1;

        if(nums.length > 0 && search(nums, target)){
            start = ceil(nums, target-1);
            end = floor(nums, target+1);
        }

        return new int[]{start, end};
    }
    
    public boolean search(int[] nums, int target){
        int s = 0;
        int e = nums.length - 1;

        while(s <= e){
            int mid = s + (e - s) / 2;

            if(nums[mid] == target){
                return true;
            }

            if(nums[mid] > target){
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return false;
    }

    public int ceil(int[] nums, int target){
        int s = 0;
        int e = nums.length - 1;

        while(s <= e){
            int mid = s + (e - s) / 2;

            if(nums[mid] > target){
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return s;
    }

    public int floor(int[] nums, int target){
        int s = 0;
        int e = nums.length - 1;

        while(s <= e){
            int mid = s + (e - s) / 2;

            if(nums[mid] < target){
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

        return e;
    }
}   