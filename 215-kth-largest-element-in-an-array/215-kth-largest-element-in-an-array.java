class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<Integer>(Collections.reverseOrder());
        
        for(int each: nums){
            q.offer(each);
        }
        
        int ans = 0;
        while(k > 0){
            ans = q.poll();
            k--;
        }
        
        return ans;
    }
}