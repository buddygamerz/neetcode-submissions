class Solution {
    public int lastStoneWeight(int[] stones) {
         PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

         for(int i=0;i<stones.length;i++){
            maxHeap.offer(stones[i]);
         }
        int j=maxHeap.size();
        while(maxHeap.size()>1){
            int first = maxHeap.poll();   // largest
            int second = maxHeap.poll();
            if(first-second!=0){
               maxHeap.offer(first-second);
                
            }
            
           

        }
        
        if(maxHeap.peek()!=null){
        return maxHeap.poll();
    }
    return 0;
}}
