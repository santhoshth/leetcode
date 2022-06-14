class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int max = 0;
        for(int i = 0; i < nums1.length; i++){
            int j = ceil(nums2, nums1[i])-1;
            if(i <= j && j-i > max){
                max = j-i;
            }  
        }
        
        return max;
    }
    
    public int ceil(int[] arr, int n){
        int start = 0;
        int end = arr.length-1;
        
        while(start <= end){
            int mid = start + (end - start)/2;
            
            if(arr[mid] >= n){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }
}