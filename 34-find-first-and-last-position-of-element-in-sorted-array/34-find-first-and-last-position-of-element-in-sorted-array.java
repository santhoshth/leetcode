class Solution {
public int[] searchRange(int[] arr, int target){
        int ceil = ceiling(arr, target-1);
        int floor = floor(arr, target+1);
    
        if(ceil > floor){
            return new int[]{-1, -1};
        }        
        
        return new int[]{ceil, floor};
    }

    public int ceiling(int[] arr, int target) {
        int start = 0;
        int end  = arr.length - 1;
        
        while(start <= end){
            int mid = start + (end - start)/2;

            if(target < arr[mid]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    public int floor(int[] arr, int target) {
        int start = 0;
        int end  = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target > arr[mid]){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return end;
    }
}