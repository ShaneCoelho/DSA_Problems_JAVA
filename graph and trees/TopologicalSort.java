class TopologicalSort
{
    
    static void dfs(int node, int V, boolean[] vis, ArrayList<ArrayList<Integer>> adj, Stack<Integer> st){
        vis[node]=true;
        
        for(int it:adj.get(node)){
            if(vis[it]!=true){
                dfs(it,V,vis,adj,st);
            }
        }
        
        st.push(node);
    }
    //Function to return list containing vertices in Topological order. 
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        // add your code here


        Stack<Integer> st=new Stack<>();
        
        boolean[] vis=new boolean[V];
        
        for(int i=0;i<V;i++){
            if(vis[i]!=true){
                dfs(i,V,vis,adj,st);
            }
        }
        
        int[] arr=new int[V];
        
        int j=0;
        
        while(!st.isEmpty()){
            arr[j]=st.pop();
            j++;
        }
        
        return arr;
    }
}

