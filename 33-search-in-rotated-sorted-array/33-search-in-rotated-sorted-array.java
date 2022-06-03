class Solution {
    public int search(int[] arr, int target) {
        
        int res = -1;

        if(arr[0] > arr[arr.length - 1]) {

            int peak = peak(arr);

            if (target <= arr[arr.length - 1]) {
                res = search(arr, target, peak + 1, arr.length - 1);
            } else {
                res = search(arr, target, 0, peak);
            }
        } else {
            res = search(arr, target, 0 , arr.length - 1);
        }
        
        return res;
    }
    
    public int peak(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[mid+1]){
                return mid;
            }
            
            if(mid > 0 && arr[mid] < arr[mid-1]){
                return mid-1;
            }

            if(arr[start] >= arr[mid]){
                end = mid - 1;
            } else {
                start = mid;
            }
        }

        return start;
    }

    public int search(int[] arr, int n, int start, int end){

        while(start <= end){
            int mid = start + (end - start) / 2;

            if (arr[mid] == n) return mid;

            if(arr[mid] > n){
                end = mid - 1;
            } else{
                start = mid + 1;
            }
        }
        return -1;
    }
}