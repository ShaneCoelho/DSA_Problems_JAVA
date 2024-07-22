// Implement Depth-First Search (DFS) for a graph.

class Prob_38 {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> dfs=new ArrayList<>();
        
        boolean[] vis=new boolean[V];
        
        int node=0;
        
        return dfsLogic(node, V, adj, dfs, vis);
    }
    
    public static ArrayList<Integer> dfsLogic(int node, int V, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> dfs, boolean[] vis){
        
        dfs.add(node);
        vis[node]=true;
        
        for(Integer it:adj.get(node)){
            if(vis[it]==false){
                dfsLogic(it,V,adj,dfs,vis);
            }
        }
        
        return dfs;
    }
    
}
