//Detect A cycle in Undirected Graph using BFS

class Graph_Cycle {
    // Function to detect cycle in an undirected graph.
    
    public static boolean detect(int src, boolean[] vis, int V, ArrayList<ArrayList<Integer>> adj){
        Queue < Pair > q=new LinkedList<>();
        q.add(new Pair(src,-1));
        vis[src]=true;
        
        while(!q.isEmpty()){
            int node=q.peek().first;
            int parent=q.peek().second;
            
            q.poll();
            
            for(Integer adjNode:adj.get(node)){
                if(vis[adjNode]!=true){
                    vis[adjNode]=true;
                    q.add(new Pair(adjNode,node));
                }else if(adjNode!=parent){
                    return true;
                }
            }
        }
        
        return false;
    }
    
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        
        boolean[] vis=new boolean[V];
        // The following part of code is used in case if the graph are unconnected
        for(int src=0;src<V;src++){
            if(vis[src]!=true){
                if(detect(src,vis,V,adj)){
                    return true;
                }
            }
        }
        return false;
    }
}

class Pair {
    int first;
    int second;
    public Pair(int first, int second) {
        this.first = first;
        this.second = second; 
    }
}

//Detect A cycle in Undirected Graph using DFS

class Solution {
    // Function to detect cycle in an undirected graph.
    public boolean detect(int node, int parent, boolean[] vis, int V, ArrayList<ArrayList<Integer>> adj){
        vis[node]=true;
        
        for(Integer adjNode:adj.get(node)){
            if(vis[adjNode]!=true){
                if(detect(adjNode,node,vis,V,adj)==true){
                    return true;
                }
            }else if(parent!=adjNode){
                    return true;
            }
        }
        return false;
    }
    
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean vis[]=new boolean[V];
        
        for(int i=0;i<V;i++){
            if(vis[i]!=true){
                if(detect(i,-1,vis,V,adj)==true){
                    return true;
                }
            }
        }
        return false;
    }
}