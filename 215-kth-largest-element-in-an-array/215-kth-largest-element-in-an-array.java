class Solution {  
    public int findKthLargest(int[] nums, int k) {
        // descending sort
        quickSort(nums, 0, nums.length-1);
        
        return nums[k-1];
    }
    
    public void quickSort(int[] arr, int low, int high){
        if(low >= high){
            return;
        }

        int start = low;
        int end = high;
        int mid = start + (end - start)/2;
        int pivot = arr[mid];

        while(start <= end) {
            while (arr[start] > pivot) {
                start++;
            }

            while (pivot > arr[end]) {
                end--;
            }

            //swap start and end elements
            if (start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        
        quickSort(arr, low, end);
        quickSort(arr, start, high);
    }
    
//     public int findKthLargest(int[] nums, int k) {
//         PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
//         for(int each: nums){
//             maxHeap.offer(each);
//         }
        
//         int max = Integer.MAX_VALUE;
//         while(k != 0){
//             max = maxHeap.poll();
//             k--;
//         }
        
//         return max;
//     }
}