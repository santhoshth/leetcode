class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int each: stones){
            maxHeap.offer(each);
        }
            
        while(maxHeap.size() > 1){
            int first = maxHeap.poll();
            int second = maxHeap.poll();
            int difference =  first - second;
            maxHeap.offer(difference);
        }
            
        return maxHeap.size() == 0 ? 0 : maxHeap.peek();
            
    }
}