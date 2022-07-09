class Solution {
    public List<Integer> findClosestElements(int[] nums, int k, int x) {
        int lo = 0;
        int hi = nums.length - 1;
        while(lo < hi) {
            int mid = lo + (hi - lo)/2;
            if(nums[mid] < x) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        
        
        int start = lo;
        int end = lo;
        int count = 0;
        while(count <= k && start >= 0 && end < nums.length) {
            if(x - nums[start] > nums[end] - x) end++;
            else start--;
            count++;
        }
        
        while(count <= k && start >= 0) { start--; count++; }
        while(count <= k && end < nums.length) { end++; count++; }
        
        List<Integer> result = new ArrayList<>();
        for(int i=start+1; i<end; i++) {
            result.add(nums[i]);
        }
        
        return result;
    }
}