class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<> ((a, b) -> (b[0]*b[0] + b[1]*b[1]) - (a[0]*a[0] + a[1]*a[1]));//this is imp we can add condition here on which we want to create the max heap; if we want to make minheap we will do PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> (a[0]*a[0] + a[1]*a[1]) - (b[0]*b[0] + b[1]*b[1])); notice we did a's-b's instead of b's-a'ss
        for(int i=0;i<points.length;i++){
            maxHeap.offer(points[i]);
           if(maxHeap.size()>k){
            maxHeap.poll();
        }
        }
        int[][] result = new int[k][2];
        for (int i = 0; i < k; i++) {
            result[i] = maxHeap.poll();
        }
        return result;
    }
        
    }

