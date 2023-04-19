package Graph.qns;

import java.util.ArrayList;
import java.util.Stack;

public class ShortestPathDAG {
private void toposort(int node , ArrayList<ArrayList<Pair3>> adj , int[] vis, Stack<Integer> st){

    vis[node]=1;
    for(int i=0; i<adj.get(node).size();i++){
        int v = adj.get(node).get(i).v;
        if(vis[v]==0){
            toposort(v,adj,vis,st);
        }
    }
    st.push(node);
}



    public int[] shortestPath(int N,int M, int[][] edges) {
        //Code here

        ArrayList<ArrayList<Pair3>> adj = new ArrayList<>();
        for(int i=0;i<N;i++){
         ArrayList<Pair3> temp = new ArrayList<>();
         adj.add(temp);
        }

        for(int i=0;i<M;i++){
            int u = edges[i][0];
            int v = edges[i][1];
            int wt = edges[i][2];
            adj.get(u).add(new Pair3(v,wt));
        }

        int[] vis= new int[N];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<N;i++){
            if(vis[i]==0){
                toposort(i,adj,vis,st);
            }
        }

        int dist[] =new int[N];
        for(int i=0;i<N;i++){
            dist[i]=(int)(1e9); //storing infinity
        }

        dist[0]=0;
        while (!st.isEmpty()){
            int node = st.peek();
            st.pop();

            for (int i=0;i<adj.get(node).size();i++){
                int v= adj.get(node).get(i).v;
                int w = adj.get(node).get(i).wt;

                if(dist[node]+w < dist[v]){
                    dist[v]=dist[node]+w;
                }
            }
        }

        for (int i=0;i<dist.length;i++){
            if(dist[i]==(int)(1e9))
            {
                dist[i]=-1;
            }
        }

        return dist;
    }




}

class Pair3{
    int v;
    int wt;
    Pair3(int v ,  int wt ){
        this.v=v;
        this.wt=wt;
    }
}
