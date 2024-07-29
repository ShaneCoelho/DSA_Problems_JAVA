// Find the shortest path in a maze.



class tuple{
    int first,second,third;
    
    tuple(int first,int second,int third){
        this.first=first;
        this.second=second;
        this.third=third;
    }
}

public class Prob_37 {

    int shortestPath(int[][] grid, int[] source, int[] destination) {

        // Your code here
        
        if(source[0]==destination[0] && source[1]==destination[1]){
            return 0;
        }
        
        int n=grid.length;
        int m=grid[0].length;
        int[][] dist=new int[n][m];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                dist[i][j]=Integer.MAX_VALUE;
            }
        }
        
        Queue<tuple> q=new LinkedList<>();
        dist[source[0]][source[1]]=0;
        q.add(new tuple(0,source[0],source[1]));
        
        int dr[]={-1,0,1,0};//For moving left right top bottom
        int dc[]={0,1,0,-1};//For moving left right top bottom
        
        while(!q.isEmpty()){
            tuple it=q.peek();
            q.poll();
            int dis=it.first;
            int r=it.second;
            int c=it.third;
            
            for(int i=0;i<4;i++){
                int newr=r+dr[i];
                int newc=c+dc[i];
                
                if(newr>=0 && newr<n && newc>=0 && newc<m && grid[newr][newc]==1 && dis+1<dist[newr][newc]){
                    dist[newr][newc]=dis+1;
                    if(newr==destination[0] && newc==destination[1]){
                        return dis+1;
                    }
                }
                
                q.add(new tuple(dis+1,newc,newr));
            }
        }
        
        return -1;
        
        
    }
}
