class MedianFinder {
    PriorityQueue<Integer> r = new PriorityQueue<>();
    PriorityQueue<Integer> l = new PriorityQueue<>((a,b) -> b - a);

    public MedianFinder() {     
    }
    
    public void addNum(int num) {
        if(l.isEmpty() || num <= l.peek()){
            l.add(num);
        }
        else{
            r.add(num);
        }
        if(l.size() > r.size() && l.size() - r.size() > 1){
            int x = l.poll();
            r.add(x);
        }
        if(l.size() < r.size()){
            l.add(r.poll());
        }
        
    }
    
    public double findMedian() {
        double median;
        if(l.size() == r.size()){
            median = (l.peek() + r.peek())/2.0;
        }
        else{
            median = l.peek();
        }
        return median;
  
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
