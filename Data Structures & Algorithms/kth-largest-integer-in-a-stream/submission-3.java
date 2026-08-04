class KthLargest {
     private PriorityQueue<Integer> minHeap;
     private int k;
    public KthLargest(int k, int[] nums) {
      
            this.k=k;
            minHeap=new PriorityQueue<>();
             for(int i=0;i<nums.length;i++){
                add(nums[i]);
             }
             //we directly push elements in the heap one by one insteading of first adding all the intial elements and then triming it by usign while loop
        
    }
    
    public int add(int val) {
        minHeap.offer(val);
        if(minHeap.size()>k){
            minHeap.poll();
        }
        return minHeap.peek();
    }
}
