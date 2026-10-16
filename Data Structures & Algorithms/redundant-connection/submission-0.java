class Solution {
    int[] size;
    int[] parent;

    
    public int[] findRedundantConnection(int[][] edges) {
        int n=edges.length;

        // Initialize parent and size ONCE
        parent = new int[n + 1];
        size = new int[n + 1];
        
        for(int i=0;i<n;i++){//initially every node is their own parent
            parent[i]=i;
        }
        for(int[] edge:edges){
            int u=edge[0];
            int v=edge[1];
            if(!union(u,v)){
                return edge;
            }
        }
        return new int[0];
    }
    public int find(int x){
        if(parent[x]!=x){
            parent[x]=find(parent[x]);
        }
        return parent[x];
    }
    public boolean union(int u,int v){
       
        int rootu=find(u);
        int rootv=find(v);
        if(rootu==rootv){
            return false;
        }
        if(size[rootu]<size[rootv]){
            int temp=rootu;
            rootu=rootv;
            rootv=temp;
        }
        parent[rootv]=rootu;
        size[rootu]+=size[rootv];
        return true;

    }
    }
