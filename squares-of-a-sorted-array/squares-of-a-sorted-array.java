class Solution {
    public int[] sortedSquares(int[] nums) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        
        for(int each: nums)
            q.offer(each * each);
        
        for(int i = 0; i < nums.length; i++){
            nums[i] = q.poll();
        }
        
        return nums;
    }
}