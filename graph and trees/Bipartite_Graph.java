//Bipartite Check using BFS

class Bipartite_Graph
{
    public boolean detect(int start, int[] color, int V, ArrayList<ArrayList<Integer>>adj){
        Queue<Integer> q=new LinkedList<>();
        q.add(start);
        color[start]=0;
        
        while(!q.isEmpty()){
            int node=q.poll();
            
            for(Integer adjNode:adj.get(node)){
                if(color[adjNode]==-1){
                    color[adjNode]=1-color[node];
                    q.add(adjNode);
                }else if(color[adjNode]==color[node]){
                    return false;
                }
            }
        }
        
        return true;
    }
    public boolean isBipartite(int V, ArrayList<ArrayList<Integer>>adj)
    {
        // Code here
        int[] color=new int[V];
        
        for(int i=0;i<V;i++){
            color[i]=-1;
        }
        
        for(int i=0;i<V;i++){
            if(color[i]==-1){
                if(detect(i,color,V,adj)==false){
                    return false;
                }
            }
        }
        
        return true;
    }
}

//Bipartite Check using DFS

class Solution
{
    
    public boolean detect(int node, int col, int[] color, int V, ArrayList<ArrayList<Integer>>adj){
        color[node]=col;
        
        for(Integer adjNode:adj.get(node)){
            if(color[adjNode]==-1){
                if(detect(adjNode,1-col,color,V,adj)==false){
                    return false;
                }
            }else if(color[adjNode]==col){
                    return false;
            }
        }
        
        return true;
    }
    public boolean isBipartite(int V, ArrayList<ArrayList<Integer>>adj)
    {
        // Code here
        int[] color=new int[V];
        
        for(int i=0;i<V;i++){
            color[i]=-1;
        }
        
        for(int i=0;i<V;i++){
            if(color[i]==-1){
                if(detect(i,0,color,V,adj)==false){
                    return false;
                }
            }
        }
        return true;
    }
}