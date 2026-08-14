/*
Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        HashMap<Node,Node>map=new HashMap<>();
        if(node==null){
            return null;
        }
        Queue<Node>q=new LinkedList<>();
        q.add(node);
        
        map.put(node, new Node(node.val));
        while(!q.isEmpty()){
            Node currnode=q.poll();
        for(Node neighbour : currnode.neighbors){
            if(!map.containsKey(neighbour)){
                Node clone=new Node(neighbour.val);
                map.put(neighbour,clone);

                q.add(neighbour);
               
            }
             map.get(currnode).neighbors.add(map.get(neighbour));//gimme currni=ode clone
            }}
            return map.get(node);
    }
   
    }
