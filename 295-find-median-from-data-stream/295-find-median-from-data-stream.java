class MedianFinder {
    private final PriorityQueue<Integer> minHeap;
    private final PriorityQueue<Integer> maxHeap;
    
    public MedianFinder() {
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    }
    
    public void addNum(int num) {
        if(maxHeap.isEmpty() || maxHeap.peek() >= num){
            maxHeap.add(num);
        } else{
            minHeap.add(num);
        }
        
        if(maxHeap.size() > minHeap.size() + 1){
            minHeap.add(maxHeap.poll());
        } else if(maxHeap.size() < minHeap.size()){
            maxHeap.add(minHeap.poll());
        }
    }
    
    public double findMedian() {
        if(minHeap.size() > 0 && maxHeap.size() > 0 &&minHeap.size() == maxHeap.size()) {
            int totalLength = minHeap.size() + maxHeap.size();
            return (double)(minHeap.peek()+maxHeap.peek())/2;
            
        }
        return maxHeap.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */