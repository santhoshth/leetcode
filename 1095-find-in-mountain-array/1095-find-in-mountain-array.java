/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
     
        
        int maxIndex = peak(mountainArr);

        int index = searchAsc(mountainArr, target, 0 , maxIndex);
        if(index == -1){
            index = searchDsc(mountainArr, target, maxIndex, mountainArr.length() - 1);
        }
        
        return index;
    }
    
    public int peak(MountainArray arr){
        int start = 0;
        int end = arr.length() - 1;
        
        while(start < end){
            int mid = start + (end - start) / 2;
            
            if(arr.get(mid) > arr.get(mid + 1)){
                end = mid;
            } else {
                start = mid + 1;
            }            
        }
        return start;
    }
    
    public int searchAsc(MountainArray arr, int n, int start, int end){
                
        while(start <= end){
            int mid = start + (end - start) / 2;
            
            if(arr.get(mid) == n){
                return mid;
            }
            
            if(arr.get(mid) > n){
                end = mid - 1;
            } else {
                start = mid + 1;
            }            
        }
        return -1;
    }
    
    public int searchDsc(MountainArray arr, int n, int start, int end){
    
        while(start <= end){
            int mid = start + (end - start) / 2;
            
            if(arr.get(mid) == n){
                return mid;
            }
            
            if(arr.get(mid) < n){
                end = mid - 1;
            } else {
                start = mid + 1;
            }            
        }
        return -1;
    }
}